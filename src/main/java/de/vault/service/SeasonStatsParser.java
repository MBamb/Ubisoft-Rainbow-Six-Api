package de.vault.service;

import de.vault.models.GameMode;
import de.vault.models.GeneralStats;
import de.vault.models.SeasonStats;
import de.vault.models.TeamRole;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;

public class SeasonStatsParser {
    protected static List<SeasonStats> toSeasonStats(String json) {
        final var jsonObject = new JSONObject(json);

        if (jsonObject.isEmpty()) {
            throw new RuntimeException("Failed to get ticket. Json is empty");
        }

        final var gameModesJson = jsonObject
                .getJSONArray("platform_families_full_profiles").getJSONObject(0)
                .getJSONArray("board_ids_full_profiles");

        return mapGameModes(gameModesJson);
    }

    private static List<SeasonStats> mapGameModes(JSONArray json) {
        return Arrays.stream(GameMode.values())
                .map(gameMode -> mapSeasonStats(json, gameMode))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private static SeasonStats mapSeasonStats(JSONArray json, GameMode gameMode) {
        if (json.isEmpty()) {
            return null;
        }

        final var gameModeName = gameMode.name().toLowerCase();

        var jsonObjects = new ArrayList<JSONObject>();

        for (int i = 0; i < json.length(); i++) {
            jsonObjects.add(json.getJSONObject(i));
        }

        final var oJsonObject = jsonObjects
                .stream()
                .filter(o -> o.getString("board_id").equals(gameModeName))
                .findFirst();

        if (oJsonObject.isEmpty()) {
            return null;
        }

        final var jsonObject = oJsonObject
                .get()
                .getJSONArray("full_profiles")
                .getJSONObject(0);

        final var profileObject = jsonObject
                .getJSONObject("profile");

        final var seasonStatisticsObject = jsonObject
                .getJSONObject("season_statistics");

        final var matchOutcomesObject = seasonStatisticsObject
                .getJSONObject("match_outcomes");

        return new SeasonStats()
                .setGameMode(gameMode)
                .setSeasonId(Utils.getJsonInt(profileObject, "season_id"))
                .setId(Utils.getJsonString(profileObject, "id"))
                .setMatchesWon(Utils.getJsonInt(matchOutcomesObject, "wins"))
                .setMatchesAbandoned(Utils.getJsonInt(matchOutcomesObject, "abandons"))
                .setMatchesLost(Utils.getJsonInt(matchOutcomesObject, "losses"))
                .setKills(Utils.getJsonInt(seasonStatisticsObject, "kills"))
                .setDeaths(Utils.getJsonInt(seasonStatisticsObject, "deaths"))
                .setRank(Utils.getJsonInt(profileObject, "rank"))
                .setRankPoints(Utils.getJsonInt(profileObject, "rank_points"))
                .setTopRankPosition(Utils.getJsonInt(profileObject, "top_rank_position"))
                .setMaxRank(Utils.getJsonInt(profileObject, "max_rank"))
                .setMaxRankPoints(Utils.getJsonInt(profileObject, "max_rank_points"));
    }
}
