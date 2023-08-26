package de.vault.service;

import de.vault.models.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UbisoftRainbowSixApi {
    private static final String UBISOFT_PUBLIC_SERVICES_URL = "https://public-ubiservices.ubi.com/";
    private static final String UBISOFT_PROD_DATA_DEV_URL = "https://prod.datadev.ubisoft.com/";

    private UbisoftRainbowSixApiConfig config = new UbisoftRainbowSixApiConfig();

    private final HttpClient httpClient = HttpClient.newHttpClient();

    /**
     * Requests an {@link UbisoftTicket} from ubisoft-services with old app id
     *
     * @return {@link UbisoftTicket}
     */
    public UbisoftTicket getOldUbisoftTicket() {
        return getUbisoftTicket(true);
    }

    /**
     * Requests an {@link UbisoftTicket} from ubisoft-services with new app id
     *
     * @return {@link UbisoftTicket}
     */
    public UbisoftTicket getUbisoftTicket() {
        return getUbisoftTicket(false);
    }

    private UbisoftTicket getUbisoftTicket(boolean old) {
        final var response = sendRequest(
                "POST",
                UBISOFT_PUBLIC_SERVICES_URL + "v3/profiles/sessions",
                Map.of("Content-Type", "application/json",
                        "ubi-appid", old ? config.getUbiAppIdOld() : config.getUbiAppId(),
                        "Authorization", "Basic " + config.getAuthorizationToken()),
                " "
        );

        return UbisoftTicketParser.toTicket(response, old);
    }

    /**
     * Searches for {@link Profile} based on given searchQuery
     *
     * @param ticket      Old {@link UbisoftTicket}
     * @param searchQuery Name of profile to search for
     * @return List of {@link Profile}
     */
    public List<Profile> searchProfile(UbisoftTicket ticket, String searchQuery) {
        final var response = sendRequest(
                "GET",
                UBISOFT_PUBLIC_SERVICES_URL + "v2/profiles?platformType=uplay&nameOnPlatform=" + searchQuery,
                Map.of("Content-Type", "application/json",
                        "ubi-appid", config.getUbiAppIdOld(),
                        "Authorization", "Ubi_v1 t=" + ticket.getTicket())
        );

        return ProfileParser.toProfile(response);
    }

    /**
     * Get a list of {@link SeasonStats} for season since Ranked 2.0
     *
     * @param ticket    New {@link UbisoftTicket}
     * @param profileId Profile id of the player to get stats for
     * @return List of {@link SeasonStats}
     */
    public List<SeasonStats> getNewSeasonStats(UbisoftTicket ticket, String profileId) {
        final var response = sendRequest(
                "GET",
                UBISOFT_PUBLIC_SERVICES_URL + "v2/spaces/0d2ae42d-4c27-4cb7-af6c-2099062302bb/title/r6s/skill/full_profiles" +
                        "?platform_families=pc" +
                        "&profile_ids=" + profileId,
                Map.of("Content-Type", "application/json",
                        "Ubi-AppId", config.getUbiAppIdOld(),
                        "Ubi-SessionId", ticket.getSessionId(),
                        "authority", "r6s-stats.ubisoft.com",
                        "expiration", ticket.getExpiration().toString(),
                        "Authorization", "Ubi_v1 t=" + ticket.getTicket())
        );

        return SeasonStatsParser.toSeasonStats(response);
    }

    /**
     * Get a list of {@link GeneralStats} for a player based on the given parameters: {@link GameMode} and {@link TeamRole}
     *
     * @param ticket    Old {@link UbisoftTicket}
     * @param profileId Profile id of the player to get stats for
     * @param gameModes List of {@link GameMode} to get stats for
     * @param teamRoles List of {@link TeamRole} to get stats for
     * @return List of {@link GeneralStats}
     */
    public List<GeneralStats> getGeneralStats(UbisoftTicket ticket, String profileId, List<GameMode> gameModes, List<TeamRole> teamRoles) {
        final var gameModesString = gameModes
                .stream()
                .map(Enum::name)
                .map(String::toLowerCase)
                .collect(Collectors.joining(","));

        final var teamRolesString = teamRoles
                .stream()
                .map(TeamRole::getQueryName)
                .collect(Collectors.joining(","));

        final var response = sendRequest(
                "GET",
                UBISOFT_PROD_DATA_DEV_URL + "v1/profiles/" + profileId + "/playerstats" +
                        "?spaceId=5172a557-50b5-4665-b7db-e3f2e8c5041d" +
                        "&view=lifetime&aggregation=summary" +
                        "&gameMode=" + gameModesString +
                        "&platform=PC&teamRole=" + teamRolesString,
                Map.of("Content-Type", "application/json",
                        "Ubi-AppId", config.getUbiAppIdOld(),
                        "Ubi-SessionId", ticket.getSessionId(),
                        "authority", "r6s-stats.ubisoft.com",
                        "expiration", ticket.getExpiration().toString(),
                        "Authorization", "Ubi_v1 t=" + ticket.getTicket())
        );

        return GeneralStatsParser.toGeneralStats(response);
    }

    /**
     * Get a list of {@link MapStats} for a player based on the given parameters: season, {@link GameMode} and {@link TeamRole}
     *
     * @param ticket    Old {@link UbisoftTicket}
     * @param profileId Profile id of the player to get stats for
     * @param season    Season to get stats for. Pattern e.g. "Y8S1"
     * @param gameModes List of {@link GameMode} to get stats for
     * @param teamRoles List of {@link TeamRole} to get stats for
     * @return List of {@link MapStats}
     */
    public List<MapStats> getMapData(UbisoftTicket ticket, String profileId, String season, List<GameMode> gameModes, List<TeamRole> teamRoles) {
        final var gameModesString = gameModes
                .stream()
                .map(Enum::name)
                .map(String::toLowerCase)
                .collect(Collectors.joining(","));

        final var teamRolesString = teamRoles
                .stream()
                .map(TeamRole::getQueryName)
                .collect(Collectors.joining(","));

        final var response = sendRequest(
                "GET",
                "https://prod.datadev.ubisoft.com/v1/profiles/" + profileId + "/playerstats" +
                        "?spaceId=5172a557-50b5-4665-b7db-e3f2e8c5041d" +
                        "&view=seasonal&aggregation=maps" +
                        "&gameMode=" + gameModesString +
                        "&platform=PC&teamRole=" + teamRolesString +
                        "&seasons=" + season,
                Map.of("Content-Type", "application/json",
                        "ubi-appid", config.getUbiAppIdOld(),
                        "Ubi-SessionId", ticket.getSessionId(),
                        "authority", "r6s-stats.ubisoft.com",
                        "expiration", ticket.getExpiration().toString(),
                        "Authorization", "Ubi_v1 t=" + ticket.getTicket())
        );

        return MapStatsParser.toMapStats(response);
    }

    /**
     * Get a list of {@link OperatorStats} for a player based on the given parameters: season, {@link GameMode} and {@link TeamRole}
     *
     * @param ticket    Old {@link UbisoftTicket}
     * @param profileId Profile id of the player to get stats for
     * @param season    Season to get stats for. Pattern e.g. "Y8S1"
     * @param gameModes List of {@link GameMode} to get stats for
     * @param teamRoles List of {@link TeamRole} to get stats for
     * @return List of {@link OperatorStats}
     */
    public List<OperatorStats> getOperatorData(UbisoftTicket ticket, String profileId, String season, List<GameMode> gameModes, List<TeamRole> teamRoles) {
        final var gameModesString = gameModes
                .stream()
                .map(Enum::name)
                .map(String::toLowerCase)
                .collect(Collectors.joining(","));

        final var teamRolesString = teamRoles
                .stream()
                .map(TeamRole::getQueryName)
                .collect(Collectors.joining(","));

        final var response = sendRequest(
                "GET",
                "https://prod.datadev.ubisoft.com/v1/profiles/" + profileId + "/playerstats" +
                        "?spaceId=5172a557-50b5-4665-b7db-e3f2e8c5041d" +
                        "&view=seasonal&aggregation=operators" +
                        "&gameMode=" + gameModesString +
                        "&platform=PC&teamRole=" + teamRolesString +
                        "&seasons=" + season,
                Map.of("Content-Type", "application/json",
                        "ubi-appid", config.getUbiAppIdOld(),
                        "Ubi-SessionId", ticket.getSessionId(),
                        "authority", "r6s-stats.ubisoft.com",
                        "expiration", ticket.getExpiration().toString(),
                        "Authorization", "Ubi_v1 t=" + ticket.getTicket())
        );

        return OperatorStatsParser.toOperatorStats(response);
    }

    /**
     * Get a list of {@link BombsiteStats} for a player based on the given parameters: season, {@link GameMode} and {@link TeamRole}
     *
     * @param ticket    Old {@link UbisoftTicket}
     * @param profileId Profile id of the player to get stats for
     * @param season    Season to get stats for. Pattern e.g. "Y8S1"
     * @param gameModes List of {@link GameMode} to get stats for
     * @param teamRoles List of {@link TeamRole} to get stats for
     * @return List of {@link BombsiteStats}
     */
    public List<BombsiteStats> getBombsiteData(UbisoftTicket ticket, String profileId, String season, List<GameMode> gameModes, List<TeamRole> teamRoles) {
        final var gameModesString = gameModes
                .stream()
                .map(Enum::name)
                .map(String::toLowerCase)
                .collect(Collectors.joining(","));

        final var teamRolesString = teamRoles
                .stream()
                .map(TeamRole::getQueryName)
                .collect(Collectors.joining(","));

        final var response = sendRequest(
                "GET",
                "https://prod.datadev.ubisoft.com/v1/profiles/" + profileId + "/playerstats" +
                        "?spaceId=5172a557-50b5-4665-b7db-e3f2e8c5041d" +
                        "&view=seasonal&aggregation=bombsites" +
                        "&gameMode=" + gameModesString +
                        "&platform=PC&teamRole=" + teamRolesString +
                        "&seasons=" + season,
                Map.of("Content-Type", "application/json",
                        "ubi-appid", config.getUbiAppIdOld(),
                        "Ubi-SessionId", ticket.getSessionId(),
                        "authority", "r6s-stats.ubisoft.com",
                        "expiration", ticket.getExpiration().toString(),
                        "Authorization", "Ubi_v1 t=" + ticket.getTicket())
        );

        return BombsiteStatsParser.toBombsiteStats(response);
    }

    private String sendRequest(String method, String url, Map<String, String> headers) {
        return sendRequest(method, url, headers, null);
    }

    private String sendRequest(String method, String url, Map<String, String> headers, String body) {
        var tries = 0;
        Exception exception = null;

        while (tries <= config.getRetriesOnError()) {
            try {
                final var requestBuilder = HttpRequest
                        .newBuilder()
                        .uri(new URI(url.stripTrailing()))
                        .method(
                                method,
                                body == null
                                        ? HttpRequest.BodyPublishers.noBody()
                                        : HttpRequest.BodyPublishers.ofString(body)
                        );

                headers.forEach(requestBuilder::setHeader);

                final var request = requestBuilder.build();

                HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

                if (response.statusCode() < 200 || response.statusCode() > 299) {
                    throw new RuntimeException("Request failed with code " + response.statusCode() + " and body " + response.body());
                }

                return response.body();
            } catch (Exception e) {
                tries++;
                exception = e;
            }
        }

        throw new RuntimeException("Error while sendingRequest: '" + method + ": " + url + "'", exception);
    }
}
