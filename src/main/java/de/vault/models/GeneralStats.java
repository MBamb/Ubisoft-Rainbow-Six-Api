package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GeneralStats {
    private GameMode gameMode;
    private TeamRole teamRole;
    private long matchesPlayed;
    private long roundsPlayed;
    private long minutesPlayed;
    private long matchesWon;
    private long matchesLost;
    private long roundsWon;
    private long roundsLost;
    private long kills;
    private long assists;
    private long deaths;
    private long headshots;
    private long meleeKills;
    private long teamKills;
    private long openingKills;
    private long openingDeaths;
    private long trades;
    private long openingKillTrades;
    private long openingDeathTrades;
    private long revives;
    private long distanceTravelled;
    private double winLossRatio;
    private double killDeathRatio;
    private double headshotAccuracy;
    private double killsPerRound;
    private double roundsWithAKill;
    private double roundsWithMultiKill;
    private double roundsWithOpeningKill;
    private double roundsWithOpeningDeath;
    private double roundsWithKOST;
    private double roundsSurvived;
    private double roundsWithAnAce;
    private double roundsWithClutch;
    private double timeAlivePerMatch;
    private double timeDeadPerMatch;
    private double distancePerRound;
}
