package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MapStats extends Stats {
    private GameMode gameMode;
    private TeamRole teamRole;
    private String map;
    private long seasonYear;
    private long seasonNumber;
    /*
    {
    "profileId": "50a3f29a-e2e6-4ed3-ba6a-a3631a3130f9",
    "region": "all",
    "statType": "maps",
    "platforms": {
        "PC": {
            "gameModes": {
                "ranked": {
                    "teamRoles": {
                        "Defender": [
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "BORDER V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 2,
                                "minutesPlayed": 8,
                                "matchesWon": 1,
                                "matchesLost": 0,
                                "roundsWon": 2,
                                "roundsLost": 0,
                                "kills": 2,
                                "assists": 1,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 320,
                                "winLossRatio": 0.0,
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
                                    "value": 0.5,
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
                                "timeAlivePerMatch": 158.0,
                                "timeDeadPerMatch": 158.0,
                                "distancePerRound": 160.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "OREGON",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 3,
                                "minutesPlayed": 9,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 1,
                                "roundsLost": 2,
                                "kills": 2,
                                "assists": 0,
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
                                "distanceTravelled": 581,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.5,
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
                                    "value": 0.3333,
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
                                "timeAlivePerMatch": 204.0,
                                "timeDeadPerMatch": 131.0,
                                "distancePerRound": 193.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CLUB HOUSE",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 8,
                                "minutesPlayed": 24,
                                "matchesWon": 2,
                                "matchesLost": 0,
                                "roundsWon": 5,
                                "roundsLost": 3,
                                "kills": 16,
                                "assists": 4,
                                "death": 6,
                                "headshots": 8,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 5,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1436,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 2.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 2.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.625,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.625,
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
                                "timeAlivePerMatch": 288.5,
                                "timeDeadPerMatch": 100.0,
                                "distancePerRound": 179.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CHALET V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 4,
                                "minutesPlayed": 15,
                                "matchesWon": 2,
                                "matchesLost": 0,
                                "roundsWon": 4,
                                "roundsLost": 0,
                                "kills": 3,
                                "assists": 2,
                                "death": 4,
                                "headshots": 3,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 817,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
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
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.75,
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
                                "timeAlivePerMatch": 189.0,
                                "timeDeadPerMatch": 100.0,
                                "distancePerRound": 204.25
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "VILLA",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 8,
                                "minutesPlayed": 25,
                                "matchesWon": 0,
                                "matchesLost": 2,
                                "roundsWon": 3,
                                "roundsLost": 5,
                                "kills": 4,
                                "assists": 2,
                                "death": 7,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1619,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.5714,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.25,
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
                                    "value": 0.125,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.125,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.125,
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
                                "timeAlivePerMatch": 303.5,
                                "timeDeadPerMatch": 118.0,
                                "distancePerRound": 202.375
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "COASTLINE",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 3,
                                "minutesPlayed": 8,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 0,
                                "roundsLost": 3,
                                "kills": 0,
                                "assists": 1,
                                "death": 3,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 593,
                                "winLossRatio": 0.0,
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
                                "timeAlivePerMatch": 179.0,
                                "timeDeadPerMatch": 49.0,
                                "distancePerRound": 197.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "EMERALD PLAINS",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 5,
                                "minutesPlayed": 14,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 3,
                                "roundsLost": 2,
                                "kills": 3,
                                "assists": 4,
                                "death": 5,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 989,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6,
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
                                "timeAlivePerMatch": 294.0,
                                "timeDeadPerMatch": 161.0,
                                "distancePerRound": 197.8
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "KANAL",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 2,
                                "minutesPlayed": 8,
                                "matchesWon": 1,
                                "matchesLost": 0,
                                "roundsWon": 2,
                                "roundsLost": 0,
                                "kills": 0,
                                "assists": 0,
                                "death": 2,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 416,
                                "winLossRatio": 0.0,
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
                                "timeAlivePerMatch": 108.0,
                                "timeDeadPerMatch": 220.0,
                                "distancePerRound": 208.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CONSULATE V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 4,
                                "minutesPlayed": 16,
                                "matchesWon": 1,
                                "matchesLost": 1,
                                "roundsWon": 3,
                                "roundsLost": 1,
                                "kills": 5,
                                "assists": 0,
                                "death": 3,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1157,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.4,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.25,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
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
                                    "value": 0.0,
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
                                "timeAlivePerMatch": 185.5,
                                "timeDeadPerMatch": 125.5,
                                "distancePerRound": 289.25
                            }
                        ],
                        "Attacker": [
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "BORDER V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 3,
                                "minutesPlayed": 9,
                                "matchesWon": 1,
                                "matchesLost": 0,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 3,
                                "assists": 1,
                                "death": 3,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 0,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 332,
                                "winLossRatio": 0.0,
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
                                    "value": 0.6667,
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
                                    "value": 0.6667,
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
                                "timeAlivePerMatch": 170.0,
                                "timeDeadPerMatch": 169.0,
                                "distancePerRound": 110.6667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "OREGON",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 2,
                                "minutesPlayed": 7,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 0,
                                "roundsLost": 2,
                                "kills": 0,
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
                                "distanceTravelled": 204,
                                "winLossRatio": 0.0,
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
                                "timeAlivePerMatch": 153.0,
                                "timeDeadPerMatch": 149.0,
                                "distancePerRound": 102.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CLUB HOUSE",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 7,
                                "minutesPlayed": 25,
                                "matchesWon": 2,
                                "matchesLost": 0,
                                "roundsWon": 4,
                                "roundsLost": 3,
                                "kills": 2,
                                "assists": 3,
                                "death": 6,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 3,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 731,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.3333,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.2857,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.1429,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.4286,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.1429,
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
                                "timeAlivePerMatch": 224.0,
                                "timeDeadPerMatch": 239.0,
                                "distancePerRound": 104.4286
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CHALET V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 4,
                                "minutesPlayed": 15,
                                "matchesWon": 2,
                                "matchesLost": 0,
                                "roundsWon": 4,
                                "roundsLost": 0,
                                "kills": 3,
                                "assists": 2,
                                "death": 3,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 1,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 474,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
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
                                "timeAlivePerMatch": 175.5,
                                "timeDeadPerMatch": 120.5,
                                "distancePerRound": 118.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "VILLA",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 6,
                                "minutesPlayed": 22,
                                "matchesWon": 0,
                                "matchesLost": 2,
                                "roundsWon": 2,
                                "roundsLost": 4,
                                "kills": 4,
                                "assists": 1,
                                "death": 5,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 906,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.8,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
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
                                    "value": 0.1667,
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
                                    "value": 0.3333,
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
                                "timeAlivePerMatch": 255.5,
                                "timeDeadPerMatch": 161.0,
                                "distancePerRound": 151.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "COASTLINE",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 1,
                                "minutesPlayed": 3,
                                "matchesWon": 0,
                                "matchesLost": 1,
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
                                "distanceTravelled": 58,
                                "winLossRatio": 0.0,
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
                                "timeAlivePerMatch": 40.0,
                                "timeDeadPerMatch": 89.0,
                                "distancePerRound": 58.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "EMERALD PLAINS",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 4,
                                "minutesPlayed": 13,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 1,
                                "roundsLost": 3,
                                "kills": 4,
                                "assists": 1,
                                "death": 3,
                                "headshots": 4,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 390,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 1.3333,
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
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.25,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5,
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
                                "timeAlivePerMatch": 239.0,
                                "timeDeadPerMatch": 211.0,
                                "distancePerRound": 97.5
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "KANAL",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 3,
                                "minutesPlayed": 10,
                                "matchesWon": 1,
                                "matchesLost": 0,
                                "roundsWon": 2,
                                "roundsLost": 1,
                                "kills": 2,
                                "assists": 0,
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
                                "distanceTravelled": 457,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.6667,
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
                                "timeAlivePerMatch": 219.0,
                                "timeDeadPerMatch": 175.0,
                                "distancePerRound": 152.3333
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CONSULATE V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 6,
                                "minutesPlayed": 22,
                                "matchesWon": 1,
                                "matchesLost": 1,
                                "roundsWon": 1,
                                "roundsLost": 5,
                                "kills": 3,
                                "assists": 1,
                                "death": 5,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1103,
                                "winLossRatio": 1.0,
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
                                    "value": 0.3333,
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
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.3333,
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
                                "timeAlivePerMatch": 329.5,
                                "timeDeadPerMatch": 84.5,
                                "distancePerRound": 183.8333
                            }
                        ],
                        "all": [
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "BORDER V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 5,
                                "minutesPlayed": 21,
                                "matchesWon": 1,
                                "matchesLost": 0,
                                "roundsWon": 4,
                                "roundsLost": 1,
                                "kills": 5,
                                "assists": 2,
                                "death": 5,
                                "headshots": 2,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 1,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 652,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.4,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.8,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.4,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.8,
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
                                "timeAlivePerMatch": 328.0,
                                "timeDeadPerMatch": 327.0,
                                "distancePerRound": 130.4
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "OREGON",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 5,
                                "minutesPlayed": 20,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 1,
                                "roundsLost": 4,
                                "kills": 2,
                                "assists": 0,
                                "death": 4,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 785,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.4,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.2,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.2,
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
                                    "value": 0.2,
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
                                "timeAlivePerMatch": 357.0,
                                "timeDeadPerMatch": 280.0,
                                "distancePerRound": 157.0
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CLUB HOUSE",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 15,
                                "minutesPlayed": 55,
                                "matchesWon": 2,
                                "matchesLost": 0,
                                "roundsWon": 9,
                                "roundsLost": 6,
                                "kills": 18,
                                "assists": 7,
                                "death": 12,
                                "headshots": 9,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 5,
                                "openingDeaths": 5,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2167,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 1.5,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 1.2,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4667,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.4,
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
                                    "value": 0.4667,
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
                                "timeAlivePerMatch": 512.5,
                                "timeDeadPerMatch": 339.0,
                                "distancePerRound": 144.4667
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CHALET V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 8,
                                "minutesPlayed": 36,
                                "matchesWon": 2,
                                "matchesLost": 0,
                                "roundsWon": 8,
                                "roundsLost": 0,
                                "kills": 6,
                                "assists": 4,
                                "death": 7,
                                "headshots": 5,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 2,
                                "openingDeaths": 2,
                                "trades": 1,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1291,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.8571,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.8333,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.75,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.25,
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
                                    "value": 0.125,
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
                                "timeAlivePerMatch": 364.5,
                                "timeDeadPerMatch": 220.5,
                                "distancePerRound": 161.375
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "VILLA",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 14,
                                "minutesPlayed": 53,
                                "matchesWon": 0,
                                "matchesLost": 2,
                                "roundsWon": 5,
                                "roundsLost": 9,
                                "kills": 8,
                                "assists": 3,
                                "death": 12,
                                "headshots": 1,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 3,
                                "trades": 0,
                                "openingKillTrades": 1,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2525,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.6667,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.125,
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
                                    "value": 0.0714,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.0714,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2143,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.4286,
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
                                "timeAlivePerMatch": 559.0,
                                "timeDeadPerMatch": 279.0,
                                "distancePerRound": 180.3571
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "COASTLINE",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 4,
                                "minutesPlayed": 14,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 0,
                                "roundsLost": 4,
                                "kills": 0,
                                "assists": 1,
                                "death": 4,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 651,
                                "winLossRatio": 0.0,
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
                                "timeAlivePerMatch": 219.0,
                                "timeDeadPerMatch": 138.0,
                                "distancePerRound": 162.75
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "EMERALD PLAINS",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 9,
                                "minutesPlayed": 31,
                                "matchesWon": 0,
                                "matchesLost": 1,
                                "roundsWon": 4,
                                "roundsLost": 5,
                                "kills": 7,
                                "assists": 5,
                                "death": 8,
                                "headshots": 5,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 1,
                                "openingDeaths": 2,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 1379,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.875,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.7143,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.7778,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5556,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.1111,
                                    "p": 0.0
                                },
                                "roundsWithOpeningKill": {
                                    "value": 0.1111,
                                    "p": 0.0
                                },
                                "roundsWithOpeningDeath": {
                                    "value": 0.2222,
                                    "p": 0.0
                                },
                                "roundsWithKOST": {
                                    "value": 0.5556,
                                    "p": 0.0
                                },
                                "roundsSurvived": {
                                    "value": 0.1111,
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
                                "timeAlivePerMatch": 533.0,
                                "timeDeadPerMatch": 372.0,
                                "distancePerRound": 153.2222
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "KANAL",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 1,
                                "roundsPlayed": 5,
                                "minutesPlayed": 21,
                                "matchesWon": 1,
                                "matchesLost": 0,
                                "roundsWon": 4,
                                "roundsLost": 1,
                                "kills": 2,
                                "assists": 0,
                                "death": 5,
                                "headshots": 0,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 2,
                                "trades": 1,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 873,
                                "winLossRatio": 0.0,
                                "killDeathRatio": {
                                    "value": 0.4,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.0,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.4,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.4,
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
                                    "value": 0.4,
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
                                "timeAlivePerMatch": 327.0,
                                "timeDeadPerMatch": 395.0,
                                "distancePerRound": 174.6
                            },
                            {
                                "type": "Seasonal",
                                "statsType": "maps",
                                "statsDetail": "CONSULATE V2",
                                "seasonYear": "Y8",
                                "seasonNumber": "S2",
                                "matchesPlayed": 2,
                                "roundsPlayed": 10,
                                "minutesPlayed": 43,
                                "matchesWon": 1,
                                "matchesLost": 1,
                                "roundsWon": 4,
                                "roundsLost": 6,
                                "kills": 8,
                                "assists": 1,
                                "death": 8,
                                "headshots": 4,
                                "meleeKills": 0,
                                "teamKills": 0,
                                "openingKills": 0,
                                "openingDeaths": 0,
                                "trades": 0,
                                "openingKillTrades": 0,
                                "openingDeathTrades": 0,
                                "revives": 0,
                                "distanceTravelled": 2260,
                                "winLossRatio": 1.0,
                                "killDeathRatio": {
                                    "value": 1.0,
                                    "p": 0.0
                                },
                                "headshotAccuracy": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "killsPerRound": {
                                    "value": 0.8,
                                    "p": 0.0
                                },
                                "roundsWithAKill": {
                                    "value": 0.5,
                                    "p": 0.0
                                },
                                "roundsWithMultiKill": {
                                    "value": 0.3,
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
                                "timeAlivePerMatch": 515.0,
                                "timeDeadPerMatch": 210.0,
                                "distancePerRound": 226.0
                            }
                        ]
                    }
                }
            }
        }
    },
    "executionTime": 7,
    "returnedTime": "2023-08-15 18:16:28.743"
}
     */
}
