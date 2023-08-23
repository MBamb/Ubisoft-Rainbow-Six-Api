package de.vault.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Stats {
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
    private float winLossRatio;
    private float killDeathRatio;
    private float headshotAccuracy;
    private float killsPerRound;
    private float roundsWithAKill;
    private float roundsWithMultiKill;
    private float roundsWithOpeningKill;
    private float roundsWithOpeningDeath;
    private float roundsWithKOST;
    private float roundsSurvived;
    private float roundsWithAnAce;
    private float roundsWithClutch;
    private float timeAlivePerMatch;
    private float timeDeadPerMatch;
    private float distancePerRound;
}
