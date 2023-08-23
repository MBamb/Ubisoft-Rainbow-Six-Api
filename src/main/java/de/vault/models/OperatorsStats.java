package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OperatorsStats extends Stats {
    private GameMode gameMode;
    private TeamRole teamRole;
    private String operator;
    private long seasonYear;
    private long seasonNumber;
    /*
    {
    "profileId": "50a3f29a-e2e6-4ed3-ba6a-a3631a3130f9",
    "region": "all",
    "statType": "operators",
    "platforms": {
        "PC": {
            "gameModes": {
                "ranked": {
                    "teamRoles": {
                        "Defender": [
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Melusi",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 3,
                                "assists": 0,
                                "death": 1,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 483,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 3.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 7.3871,
                                "timeDeadPerMatch": 0.7097,
                                "distancePerRound": 241.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Thorn",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 5,
                                "minutesPlayed": 17,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 5,
                                "roundsLost": 0,
                                "kills": 5,
                                "assists": 1,
                                "death": 5,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 952,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 12.0417,
                                "timeDeadPerMatch": 15.0833,
                                "distancePerRound": 190.4
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Aruni",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 16,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 8,
                                "matchesLost": 8,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 1,
                                "revives": 0,
                                "distanceTravelled": 120,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 1.625,
                                "timeDeadPerMatch": 6.25,
                                "distancePerRound": 120.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Jager",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 19,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 9,
                                "matchesLost": 10,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 156,
                                "winLossRatio": 0.9,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.2105,
                                "timeDeadPerMatch": 2.0526,
                                "distancePerRound": 156.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Frost",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 28,
                                "roundsPlayed": 20,
                                "minutesPlayed": 65,
                                "matchesWon": 14,
                                "matchesLost": 14,
                                "roundsWon": 12,
                                "roundsLost": 8,
                                "kills": 21,
                                "assists": 7,
                                "death": 16,
                                "headshots": 9,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 7,
                                "openingDeaths": 3,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 4094,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.3125,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.4286,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.05,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.35,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.15,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 54.4286,
                                "timeDeadPerMatch": 25.0714,
                                "distancePerRound": 204.7
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Oryx",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 2,
                                "minutesPlayed": 6,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 0,
                                "roundsLost": 2,
                                "kills": 1,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 447,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 4.3548,
                                "timeDeadPerMatch": 3.0645,
                                "distancePerRound": 223.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Solis",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 29,
                                "roundsPlayed": 12,
                                "minutesPlayed": 42,
                                "matchesWon": 15,
                                "matchesLost": 14,
                                "roundsWon": 9,
                                "roundsLost": 3,
                                "kills": 10,
                                "assists": 5,
                                "death": 11,
                                "headshots": 7,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 3041,
                                "winLossRatio": 1.0714,
                                "killDeathRatio": {
                                    "value": 0.9091,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.8333,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0833,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0833,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0833,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 34.7586,
                                "timeDeadPerMatch": 18.2069,
                                "distancePerRound": 253.4167
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Kapkan",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 30,
                                "roundsPlayed": 6,
                                "minutesPlayed": 21,
                                "matchesWon": 16,
                                "matchesLost": 14,
                                "roundsWon": 3,
                                "roundsLost": 3,
                                "kills": 3,
                                "assists": 2,
                                "death": 5,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1235,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.8333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 15.5667,
                                "timeDeadPerMatch": 10.7,
                                "distancePerRound": 205.8333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Smoke",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 23,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 11,
                                "matchesLost": 12,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 177,
                                "winLossRatio": 0.9167,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 4.8261,
                                "timeDeadPerMatch": 0.913,
                                "distancePerRound": 177.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Pulse",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 22,
                                "roundsPlayed": 3,
                                "minutesPlayed": 9,
                                "matchesWon": 11,
                                "matchesLost": 11,
                                "roundsWon": 1,
                                "roundsLost": 2,
                                "kills": 3,
                                "assists": 1,
                                "death": 3,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 495,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 9.1818,
                                "timeDeadPerMatch": 5.5909,
                                "distancePerRound": 165.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Doc",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 9,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 5,
                                "matchesLost": 4,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 1,
                                "assists": 0,
                                "death": 1,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 147,
                                "winLossRatio": 1.25,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.6667,
                                "timeDeadPerMatch": 9.7778,
                                "distancePerRound": 147.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Warden",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 16,
                                "roundsPlayed": 2,
                                "minutesPlayed": 6,
                                "matchesWon": 8,
                                "matchesLost": 8,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 2,
                                "assists": 2,
                                "death": 2,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 449,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.9375,
                                "timeDeadPerMatch": 4.5625,
                                "distancePerRound": 224.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Caveira",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 23,
                                "roundsPlayed": 9,
                                "minutesPlayed": 33,
                                "matchesWon": 11,
                                "matchesLost": 12,
                                "roundsWon": 5,
                                "roundsLost": 4,
                                "kills": 10,
                                "assists": 2,
                                "death": 7,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 3,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2022,
                                "winLossRatio": 0.9167,
                                "killDeathRatio": {
                                    "value": 1.4286,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.1111,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 32.5217,
                                "timeDeadPerMatch": 20.4348,
                                "distancePerRound": 224.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Tachanka",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 186,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.25,
                                "timeDeadPerMatch": 2.7083,
                                "distancePerRound": 186.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Rook",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 21,
                                "minutesPlayed": 76,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 14,
                                "roundsLost": 7,
                                "kills": 18,
                                "assists": 10,
                                "death": 17,
                                "headshots": 13,
                                "meleeKills": 0,
                                "teamKills": 1,
                                "openingKills": 6,
                                "openingDeaths": 5,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 3724,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 1.0588,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7222,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.8571,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4762,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2381,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.2857,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2381,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.4762,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1905,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 52.5484,
                                "timeDeadPerMatch": 38.2903,
                                "distancePerRound": 177.3333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Echo",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 11,
                                "roundsPlayed": 1,
                                "minutesPlayed": 4,
                                "matchesWon": 6,
                                "matchesLost": 5,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 143,
                                "winLossRatio": 1.2,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.1818,
                                "timeDeadPerMatch": 9.3636,
                                "distancePerRound": 143.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Mira",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 18,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 9,
                                "matchesLost": 9,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 1,
                                "revives": 0,
                                "distanceTravelled": 137,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 1.5556,
                                "timeDeadPerMatch": 4.2778,
                                "distancePerRound": 137.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Azami",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 4,
                                "roundsPlayed": 2,
                                "minutesPlayed": 6,
                                "matchesWon": 2,
                                "matchesLost": 2,
                                "roundsWon": 2,
                                "roundsLost": 0,
                                "kills": 2,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 439,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 46.5,
                                "timeDeadPerMatch": 13.5,
                                "distancePerRound": 219.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Bandit",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 15,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 8,
                                "matchesLost": 7,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 238,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 6.8667,
                                "timeDeadPerMatch": 1.0667,
                                "distancePerRound": 238.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Lesion",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 23,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 11,
                                "matchesLost": 12,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 130,
                                "winLossRatio": 0.9167,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.5217,
                                "timeDeadPerMatch": 1.3043,
                                "distancePerRound": 130.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Fenrir",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 18,
                                "roundsPlayed": 4,
                                "minutesPlayed": 14,
                                "matchesWon": 9,
                                "matchesLost": 9,
                                "roundsWon": 2,
                                "roundsLost": 2,
                                "kills": 4,
                                "assists": 0,
                                "death": 3,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 2,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 1,
                                "revives": 0,
                                "distanceTravelled": 988,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.3333,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 22.4444,
                                "timeDeadPerMatch": 6.6111,
                                "distancePerRound": 247.0
                            }
                        ],
                        "Attacker": [
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Glaz",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 7,
                                "roundsPlayed": 3,
                                "minutesPlayed": 11,
                                "matchesWon": 4,
                                "matchesLost": 3,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 3,
                                "assists": 2,
                                "death": 2,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 347,
                                "winLossRatio": 1.3333,
                                "killDeathRatio": {
                                    "value": 1.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 42.8571,
                                "timeDeadPerMatch": 22.0,
                                "distancePerRound": 115.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Fuze",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 9,
                                "minutesPlayed": 32,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 4,
                                "roundsLost": 5,
                                "kills": 6,
                                "assists": 3,
                                "death": 7,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1219,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 0.8571,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 23.7097,
                                "timeDeadPerMatch": 15.2581,
                                "distancePerRound": 135.4444
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Gridlock",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 3,
                                "minutesPlayed": 11,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 5,
                                "assists": 0,
                                "death": 2,
                                "headshots": 4,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 402,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 2.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.8,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.9583,
                                "timeDeadPerMatch": 6.1667,
                                "distancePerRound": 134.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Ash",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 28,
                                "roundsPlayed": 3,
                                "minutesPlayed": 10,
                                "matchesWon": 14,
                                "matchesLost": 14,
                                "roundsWon": 0,
                                "roundsLost": 3,
                                "kills": 0,
                                "assists": 1,
                                "death": 3,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 284,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.8214,
                                "timeDeadPerMatch": 7.25,
                                "distancePerRound": 94.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Dokkaebi",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 25,
                                "roundsPlayed": 11,
                                "minutesPlayed": 39,
                                "matchesWon": 12,
                                "matchesLost": 13,
                                "roundsWon": 5,
                                "roundsLost": 6,
                                "kills": 7,
                                "assists": 1,
                                "death": 8,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 2,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 1,
                                "distanceTravelled": 2058,
                                "winLossRatio": 0.9231,
                                "killDeathRatio": {
                                    "value": 0.875,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6364,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4545,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0909,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0909,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6364,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2727,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 43.84,
                                "timeDeadPerMatch": 12.96,
                                "distancePerRound": 187.0909
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Sledge",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 30,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 16,
                                "matchesLost": 14,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 1,
                                "assists": 2,
                                "death": 2,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 292,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.6333,
                                "timeDeadPerMatch": 3.9333,
                                "distancePerRound": 146.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Amaru",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 20,
                                "roundsPlayed": 7,
                                "minutesPlayed": 23,
                                "matchesWon": 10,
                                "matchesLost": 10,
                                "roundsWon": 5,
                                "roundsLost": 2,
                                "kills": 4,
                                "assists": 3,
                                "death": 6,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 1,
                                "trades": 2,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1089,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5714,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4286,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.2857,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5714,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 25.85,
                                "timeDeadPerMatch": 14.05,
                                "distancePerRound": 155.5714
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Osa",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 3,
                                "roundsPlayed": 1,
                                "minutesPlayed": 4,
                                "matchesWon": 1,
                                "matchesLost": 2,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 104,
                                "winLossRatio": 0.5,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 27.0,
                                "timeDeadPerMatch": 25.3333,
                                "distancePerRound": 104.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Nokk",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 16,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 8,
                                "matchesLost": 8,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 1,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 206,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 8.0625,
                                "timeDeadPerMatch": 10.5625,
                                "distancePerRound": 103.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Flores",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 28,
                                "roundsPlayed": 3,
                                "minutesPlayed": 11,
                                "matchesWon": 14,
                                "matchesLost": 14,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 3,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 466,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.5714,
                                "timeDeadPerMatch": 4.4286,
                                "distancePerRound": 155.3333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Jackal",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 8,
                                "minutesPlayed": 30,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 3,
                                "roundsLost": 5,
                                "kills": 9,
                                "assists": 2,
                                "death": 5,
                                "headshots": 7,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1439,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 1.8,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7778,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.125,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.375,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.125,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.375,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 26.9355,
                                "timeDeadPerMatch": 10.129,
                                "distancePerRound": 179.875
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Buck",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 30,
                                "roundsPlayed": 21,
                                "minutesPlayed": 74,
                                "matchesWon": 16,
                                "matchesLost": 14,
                                "roundsWon": 9,
                                "roundsLost": 12,
                                "kills": 10,
                                "assists": 3,
                                "death": 19,
                                "headshots": 6,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 3,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2645,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.5263,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.4762,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.381,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0952,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0476,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.381,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0952,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 44.9667,
                                "timeDeadPerMatch": 43.7,
                                "distancePerRound": 125.9524
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Kali",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 18,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 9,
                                "matchesLost": 9,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 1,
                                "assists": 0,
                                "death": 0,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 109,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 4.0556,
                                "timeDeadPerMatch": 0.0,
                                "distancePerRound": 109.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Maverick",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 8,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 4,
                                "matchesLost": 4,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 64,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.75,
                                "timeDeadPerMatch": 5.875,
                                "distancePerRound": 64.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Zero",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 1,
                                "matchesLost": 1,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 179,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 41.0,
                                "timeDeadPerMatch": 14.5,
                                "distancePerRound": 179.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Thermite",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 12,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 7,
                                "matchesLost": 5,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 1,
                                "assists": 1,
                                "death": 0,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 212,
                                "winLossRatio": 1.4,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.8333,
                                "timeDeadPerMatch": 0.0,
                                "distancePerRound": 212.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Blitz",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 133,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 1.9583,
                                "timeDeadPerMatch": 1.1667,
                                "distancePerRound": 133.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Ace",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 17,
                                "roundsPlayed": 6,
                                "minutesPlayed": 20,
                                "matchesWon": 8,
                                "matchesLost": 9,
                                "roundsWon": 0,
                                "roundsLost": 6,
                                "kills": 4,
                                "assists": 1,
                                "death": 6,
                                "headshots": 3,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 940,
                                "winLossRatio": 0.8889,
                                "killDeathRatio": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 32.3529,
                                "timeDeadPerMatch": 9.6471,
                                "distancePerRound": 156.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Brava",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 29,
                                "roundsPlayed": 6,
                                "minutesPlayed": 21,
                                "matchesWon": 15,
                                "matchesLost": 14,
                                "roundsWon": 2,
                                "roundsLost": 4,
                                "kills": 3,
                                "assists": 0,
                                "death": 4,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 958,
                                "winLossRatio": 1.0714,
                                "killDeathRatio": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 20.7931,
                                "timeDeadPerMatch": 6.2759,
                                "distancePerRound": 159.6667
                            }
                        ],
                        "all": [
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Melusi",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 3,
                                "assists": 0,
                                "death": 1,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 483,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 3.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 7.3871,
                                "timeDeadPerMatch": 0.7097,
                                "distancePerRound": 241.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Glaz",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 7,
                                "roundsPlayed": 3,
                                "minutesPlayed": 11,
                                "matchesWon": 4,
                                "matchesLost": 3,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 3,
                                "assists": 2,
                                "death": 2,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 347,
                                "winLossRatio": 1.3333,
                                "killDeathRatio": {
                                    "value": 1.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 42.8571,
                                "timeDeadPerMatch": 22.0,
                                "distancePerRound": 115.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Fuze",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 9,
                                "minutesPlayed": 32,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 4,
                                "roundsLost": 5,
                                "kills": 6,
                                "assists": 3,
                                "death": 7,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1219,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 0.8571,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 23.7097,
                                "timeDeadPerMatch": 15.2581,
                                "distancePerRound": 135.4444
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Gridlock",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 3,
                                "minutesPlayed": 11,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 5,
                                "assists": 0,
                                "death": 2,
                                "headshots": 4,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 402,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 2.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.8,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.9583,
                                "timeDeadPerMatch": 6.1667,
                                "distancePerRound": 134.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Ash",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 28,
                                "roundsPlayed": 3,
                                "minutesPlayed": 10,
                                "matchesWon": 14,
                                "matchesLost": 14,
                                "roundsWon": 0,
                                "roundsLost": 3,
                                "kills": 0,
                                "assists": 1,
                                "death": 3,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 284,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.8214,
                                "timeDeadPerMatch": 7.25,
                                "distancePerRound": 94.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Thorn",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 5,
                                "minutesPlayed": 17,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 5,
                                "roundsLost": 0,
                                "kills": 5,
                                "assists": 1,
                                "death": 5,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 952,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 12.0417,
                                "timeDeadPerMatch": 15.0833,
                                "distancePerRound": 190.4
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Aruni",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 16,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 8,
                                "matchesLost": 8,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 1,
                                "revives": 0,
                                "distanceTravelled": 120,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 1.625,
                                "timeDeadPerMatch": 6.25,
                                "distancePerRound": 120.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Jager",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 19,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 9,
                                "matchesLost": 10,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 156,
                                "winLossRatio": 0.9,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.2105,
                                "timeDeadPerMatch": 2.0526,
                                "distancePerRound": 156.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Dokkaebi",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 25,
                                "roundsPlayed": 11,
                                "minutesPlayed": 39,
                                "matchesWon": 12,
                                "matchesLost": 13,
                                "roundsWon": 5,
                                "roundsLost": 6,
                                "kills": 7,
                                "assists": 1,
                                "death": 8,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 2,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 1,
                                "distanceTravelled": 2058,
                                "winLossRatio": 0.9231,
                                "killDeathRatio": {
                                    "value": 0.875,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6364,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4545,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0909,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0909,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6364,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2727,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 43.84,
                                "timeDeadPerMatch": 12.96,
                                "distancePerRound": 187.0909
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Sledge",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 30,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 16,
                                "matchesLost": 14,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 1,
                                "assists": 2,
                                "death": 2,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 292,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.6333,
                                "timeDeadPerMatch": 3.9333,
                                "distancePerRound": 146.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Amaru",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 20,
                                "roundsPlayed": 7,
                                "minutesPlayed": 23,
                                "matchesWon": 10,
                                "matchesLost": 10,
                                "roundsWon": 5,
                                "roundsLost": 2,
                                "kills": 4,
                                "assists": 3,
                                "death": 6,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 1,
                                "trades": 2,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1089,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5714,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4286,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.2857,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5714,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 25.85,
                                "timeDeadPerMatch": 14.05,
                                "distancePerRound": 155.5714
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Frost",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 28,
                                "roundsPlayed": 20,
                                "minutesPlayed": 65,
                                "matchesWon": 14,
                                "matchesLost": 14,
                                "roundsWon": 12,
                                "roundsLost": 8,
                                "kills": 21,
                                "assists": 7,
                                "death": 16,
                                "headshots": 9,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 7,
                                "openingDeaths": 3,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 4094,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.3125,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.4286,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.05,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.35,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.15,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 54.4286,
                                "timeDeadPerMatch": 25.0714,
                                "distancePerRound": 204.7
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Oryx",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 2,
                                "minutesPlayed": 6,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 0,
                                "roundsLost": 2,
                                "kills": 1,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 447,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 4.3548,
                                "timeDeadPerMatch": 3.0645,
                                "distancePerRound": 223.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Solis",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 29,
                                "roundsPlayed": 12,
                                "minutesPlayed": 42,
                                "matchesWon": 15,
                                "matchesLost": 14,
                                "roundsWon": 9,
                                "roundsLost": 3,
                                "kills": 10,
                                "assists": 5,
                                "death": 11,
                                "headshots": 7,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 3041,
                                "winLossRatio": 1.0714,
                                "killDeathRatio": {
                                    "value": 0.9091,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.8333,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0833,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0833,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0833,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 34.7586,
                                "timeDeadPerMatch": 18.2069,
                                "distancePerRound": 253.4167
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Kapkan",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 30,
                                "roundsPlayed": 6,
                                "minutesPlayed": 21,
                                "matchesWon": 16,
                                "matchesLost": 14,
                                "roundsWon": 3,
                                "roundsLost": 3,
                                "kills": 3,
                                "assists": 2,
                                "death": 5,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1235,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.8333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 15.5667,
                                "timeDeadPerMatch": 10.7,
                                "distancePerRound": 205.8333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Osa",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 3,
                                "roundsPlayed": 1,
                                "minutesPlayed": 4,
                                "matchesWon": 1,
                                "matchesLost": 2,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 104,
                                "winLossRatio": 0.5,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 27.0,
                                "timeDeadPerMatch": 25.3333,
                                "distancePerRound": 104.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Nokk",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 16,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 8,
                                "matchesLost": 8,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 1,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 206,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 8.0625,
                                "timeDeadPerMatch": 10.5625,
                                "distancePerRound": 103.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Smoke",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 23,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 11,
                                "matchesLost": 12,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 177,
                                "winLossRatio": 0.9167,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 4.8261,
                                "timeDeadPerMatch": 0.913,
                                "distancePerRound": 177.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Flores",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 28,
                                "roundsPlayed": 3,
                                "minutesPlayed": 11,
                                "matchesWon": 14,
                                "matchesLost": 14,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 3,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 466,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.5714,
                                "timeDeadPerMatch": 4.4286,
                                "distancePerRound": 155.3333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Pulse",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 22,
                                "roundsPlayed": 3,
                                "minutesPlayed": 9,
                                "matchesWon": 11,
                                "matchesLost": 11,
                                "roundsWon": 1,
                                "roundsLost": 2,
                                "kills": 3,
                                "assists": 1,
                                "death": 3,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 495,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 9.1818,
                                "timeDeadPerMatch": 5.5909,
                                "distancePerRound": 165.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Jackal",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 8,
                                "minutesPlayed": 30,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 3,
                                "roundsLost": 5,
                                "kills": 9,
                                "assists": 2,
                                "death": 5,
                                "headshots": 7,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1439,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 1.8,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7778,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.125,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.375,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.125,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.375,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 26.9355,
                                "timeDeadPerMatch": 10.129,
                                "distancePerRound": 179.875
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Buck",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 30,
                                "roundsPlayed": 21,
                                "minutesPlayed": 74,
                                "matchesWon": 16,
                                "matchesLost": 14,
                                "roundsWon": 9,
                                "roundsLost": 12,
                                "kills": 10,
                                "assists": 3,
                                "death": 19,
                                "headshots": 6,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 3,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2645,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.5263,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.4762,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.381,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0952,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0476,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.381,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0952,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 44.9667,
                                "timeDeadPerMatch": 43.7,
                                "distancePerRound": 125.9524
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Kali",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 18,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 9,
                                "matchesLost": 9,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 1,
                                "assists": 0,
                                "death": 0,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 109,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 4.0556,
                                "timeDeadPerMatch": 0.0,
                                "distancePerRound": 109.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Doc",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 9,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 5,
                                "matchesLost": 4,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 1,
                                "assists": 0,
                                "death": 1,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 147,
                                "winLossRatio": 1.25,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.6667,
                                "timeDeadPerMatch": 9.7778,
                                "distancePerRound": 147.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Warden",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 16,
                                "roundsPlayed": 2,
                                "minutesPlayed": 6,
                                "matchesWon": 8,
                                "matchesLost": 8,
                                "roundsWon": 1,
                                "roundsLost": 1,
                                "kills": 2,
                                "assists": 2,
                                "death": 2,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 449,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.9375,
                                "timeDeadPerMatch": 4.5625,
                                "distancePerRound": 224.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Maverick",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 8,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 4,
                                "matchesLost": 4,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 64,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.75,
                                "timeDeadPerMatch": 5.875,
                                "distancePerRound": 64.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Caveira",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 23,
                                "roundsPlayed": 9,
                                "minutesPlayed": 33,
                                "matchesWon": 11,
                                "matchesLost": 12,
                                "roundsWon": 5,
                                "roundsLost": 4,
                                "kills": 10,
                                "assists": 2,
                                "death": 7,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 3,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2022,
                                "winLossRatio": 0.9167,
                                "killDeathRatio": {
                                    "value": 1.4286,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.1111,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 32.5217,
                                "timeDeadPerMatch": 20.4348,
                                "distancePerRound": 224.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Zero",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 1,
                                "matchesLost": 1,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 179,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 41.0,
                                "timeDeadPerMatch": 14.5,
                                "distancePerRound": 179.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Tachanka",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 186,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.25,
                                "timeDeadPerMatch": 2.7083,
                                "distancePerRound": 186.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Rook",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 31,
                                "roundsPlayed": 21,
                                "minutesPlayed": 76,
                                "matchesWon": 16,
                                "matchesLost": 15,
                                "roundsWon": 14,
                                "roundsLost": 7,
                                "kills": 18,
                                "assists": 10,
                                "death": 17,
                                "headshots": 13,
                                "meleeKills": 0,
                                "teamKills": 1,
                                "openingKills": 6,
                                "openingDeaths": 5,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 3724,
                                "winLossRatio": 1.0667,
                                "killDeathRatio": {
                                    "value": 1.0588,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7222,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.8571,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4762,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2381,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.2857,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2381,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.4762,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1905,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 52.5484,
                                "timeDeadPerMatch": 38.2903,
                                "distancePerRound": 177.3333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Echo",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 11,
                                "roundsPlayed": 1,
                                "minutesPlayed": 4,
                                "matchesWon": 6,
                                "matchesLost": 5,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 1,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 143,
                                "winLossRatio": 1.2,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 5.1818,
                                "timeDeadPerMatch": 9.3636,
                                "distancePerRound": 143.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Mira",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 18,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 9,
                                "matchesLost": 9,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 1,
                                "revives": 0,
                                "distanceTravelled": 137,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 1.5556,
                                "timeDeadPerMatch": 4.2778,
                                "distancePerRound": 137.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Azami",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 4,
                                "roundsPlayed": 2,
                                "minutesPlayed": 6,
                                "matchesWon": 2,
                                "matchesLost": 2,
                                "roundsWon": 2,
                                "roundsLost": 0,
                                "kills": 2,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 439,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 46.5,
                                "timeDeadPerMatch": 13.5,
                                "distancePerRound": 219.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Bandit",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 15,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 8,
                                "matchesLost": 7,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 238,
                                "winLossRatio": 1.1429,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 6.8667,
                                "timeDeadPerMatch": 1.0667,
                                "distancePerRound": 238.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Thermite",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 12,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 7,
                                "matchesLost": 5,
                                "roundsWon": 1,
                                "roundsLost": 0,
                                "kills": 1,
                                "assists": 1,
                                "death": 0,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 212,
                                "winLossRatio": 1.4,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 10.8333,
                                "timeDeadPerMatch": 0.0,
                                "distancePerRound": 212.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Lesion",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 23,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 11,
                                "matchesLost": 12,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 130,
                                "winLossRatio": 0.9167,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 2.5217,
                                "timeDeadPerMatch": 1.3043,
                                "distancePerRound": 130.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Blitz",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 24,
                                "roundsPlayed": 1,
                                "minutesPlayed": 2,
                                "matchesWon": 11,
                                "matchesLost": 13,
                                "roundsWon": 0,
                                "roundsLost": 1,
                                "kills": 0,
                                "assists": 0,
                                "death": 1,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 133,
                                "winLossRatio": 0.8462,
                                "killDeathRatio": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 1.9583,
                                "timeDeadPerMatch": 1.1667,
                                "distancePerRound": 133.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Ace",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 17,
                                "roundsPlayed": 6,
                                "minutesPlayed": 20,
                                "matchesWon": 8,
                                "matchesLost": 9,
                                "roundsWon": 0,
                                "roundsLost": 6,
                                "kills": 4,
                                "assists": 1,
                                "death": 6,
                                "headshots": 3,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 940,
                                "winLossRatio": 0.8889,
                                "killDeathRatio": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 32.3529,
                                "timeDeadPerMatch": 9.6471,
                                "distancePerRound": 156.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Brava",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 29,
                                "roundsPlayed": 6,
                                "minutesPlayed": 21,
                                "matchesWon": 15,
                                "matchesLost": 14,
                                "roundsWon": 2,
                                "roundsLost": 4,
                                "kills": 3,
                                "assists": 0,
                                "death": 4,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 958,
                                "winLossRatio": 1.0714,
                                "killDeathRatio": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.1667,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 20.7931,
                                "timeDeadPerMatch": 6.2759,
                                "distancePerRound": 159.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "operators",
                                "statsDetail": "Fenrir",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 18,
                                "roundsPlayed": 4,
                                "minutesPlayed": 14,
                                "matchesWon": 9,
                                "matchesLost": 9,
                                "roundsWon": 2,
                                "roundsLost": 2,
                                "kills": 4,
                                "assists": 0,
                                "death": 3,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 2,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 1,
                                "revives": 0,
                                "distanceTravelled": 988,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.3333,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithAnAce": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithClutch": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "timeAlivePerMatch": 22.4444,
                                "timeDeadPerMatch": 6.6111,
                                "distancePerRound": 247.0
                            }
                        ]
                    }
                }
            }
        }
    },
    "executionTime": 296,
    "returnedTime": "2023-08-23 21:36:22.26"
}
     */
}
