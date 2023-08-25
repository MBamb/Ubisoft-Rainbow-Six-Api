package de.vault.service;

import de.vault.models.GameMode;
import de.vault.models.BombsiteStats;
import de.vault.models.TeamRole;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class BombsiteStatsParser {
    protected static List<BombsiteStats> toBombsiteStats(String json) {
        final var jsonObject = new JSONObject(json);

        if (jsonObject.isEmpty()) {
            throw new RuntimeException("Failed to get ticket. Json is empty");
        }

        final var gameModesJson = jsonObject
                .getJSONObject("platforms")
                .getJSONObject("PC")
                .getJSONObject("gameModes");

        return mapGameModes(gameModesJson);
    }

    private static List<BombsiteStats> mapGameModes(JSONObject json) {
        return Arrays.stream(GameMode.values())
                .map(gameMode -> mapTeamRoles(json, gameMode))
                .filter(mapStats -> !mapStats.isEmpty())
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    private static List<BombsiteStats> mapTeamRoles(JSONObject json, GameMode gameMode) {
        final var gameModeName = gameMode.name().toLowerCase();

        final var gameModeJson = json.getJSONObject(gameModeName);

        if (gameModeJson.isEmpty()) {
            return Collections.emptyList();
        }

        return Arrays
                .stream(TeamRole.values())
                .map(teamRole -> mapBombsiteStats(gameModeJson.getJSONObject("teamRoles"), gameMode, teamRole))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private static BombsiteStats mapBombsiteStats(JSONObject json, GameMode gameMode, TeamRole teamRole) {
        final var jsonArray = json.getJSONArray(teamRole.getQueryName());

        if (jsonArray.isEmpty()) {
            return null;
        }

        final var jsonObject = (JSONObject) jsonArray.get(0);

        return (BombsiteStats) new BombsiteStats()
                .setGameMode(gameMode)
                .setTeamRole(teamRole)
                .setBombsite(Utils.getJsonString(jsonObject, "statsDetail"))
                .setSeasonYear(Utils.getJsonString(jsonObject, "seasonYear").charAt(1))
                .setSeasonNumber(Utils.getJsonString(jsonObject, "seasonNumber").charAt(1))
                .setMatchesPlayed(Utils.getJsonInt(jsonObject, "matchesPlayed"))
                .setRoundsPlayed(Utils.getJsonInt(jsonObject, "roundsPlayed"))
                .setMinutesPlayed(Utils.getJsonInt(jsonObject, "minutesPlayed"))
                .setMatchesWon(Utils.getJsonInt(jsonObject, "matchesWon"))
                .setMatchesLost(Utils.getJsonInt(jsonObject, "matchesLost"))
                .setRoundsWon(Utils.getJsonInt(jsonObject, "roundsWon"))
                .setRoundsLost(Utils.getJsonInt(jsonObject, "roundsLost"))
                .setKills(Utils.getJsonInt(jsonObject, "kills"))
                .setAssists(Utils.getJsonInt(jsonObject, "assists"))
                .setDeaths(Utils.getJsonInt(jsonObject, "death"))
                .setHeadshots(Utils.getJsonInt(jsonObject, "headshots"))
                .setMeleeKills(Utils.getJsonInt(jsonObject, "meleeKills"))
                .setTeamKills(Utils.getJsonInt(jsonObject, "teamKills"))
                .setOpeningKills(Utils.getJsonInt(jsonObject, "openingKills"))
                .setOpeningDeaths(Utils.getJsonInt(jsonObject, "openingDeaths"))
                .setTrades(Utils.getJsonInt(jsonObject, "trades"))
                .setOpeningKillTrades(Utils.getJsonInt(jsonObject, "openingKillTrades"))
                .setOpeningDeathTrades(Utils.getJsonInt(jsonObject, "openingDeathTrades"))
                .setRevives(Utils.getJsonInt(jsonObject, "revives"))
                .setDistanceTravelled(Utils.getJsonInt(jsonObject, "distanceTravelled"))
                .setWinLossRatio(Utils.getJsonFloat(jsonObject, "winLossRatio"))
                .setKillDeathRatio(Utils.getJsonFloatFromValue(jsonObject, "killDeathRatio"))
                .setHeadshotAccuracy(Utils.getJsonFloatFromValue(jsonObject, "headshotAccuracy"))
                .setKillsPerRound(Utils.getJsonFloatFromValue(jsonObject, "killsPerRound"))
                .setRoundsWithAKill(Utils.getJsonFloatFromValue(jsonObject, "roundsWithAKill"))
                .setRoundsWithMultiKill(Utils.getJsonFloatFromValue(jsonObject, "roundsWithMultiKill"))
                .setRoundsWithOpeningKill(Utils.getJsonFloatFromValue(jsonObject, "roundsWithOpeningKill"))
                .setRoundsWithOpeningDeath(Utils.getJsonFloatFromValue(jsonObject, "roundsWithOpeningDeath"))
                .setRoundsWithKOST(Utils.getJsonFloatFromValue(jsonObject, "roundsWithKOST"))
                .setRoundsSurvived(Utils.getJsonFloatFromValue(jsonObject, "roundsSurvived"))
                .setRoundsWithAnAce(Utils.getJsonFloatFromValue(jsonObject, "roundsWithAnAce"))
                .setRoundsWithClutch(Utils.getJsonFloatFromValue(jsonObject, "roundsWithClutch"))
                .setTimeAlivePerMatch(Utils.getJsonFloat(jsonObject, "timeAlivePerMatch"))
                .setTimeDeadPerMatch(Utils.getJsonFloat(jsonObject, "timeDeadPerMatch"))
                .setDistancePerRound(Utils.getJsonFloat(jsonObject, "distancePerRound")) ;
    }
}
