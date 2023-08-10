package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SeasonStats {
    private String id;
    private long maxRank;
    private long maxRankPoints;
    private long rank;
    private long rankPoints;
    private long seasonId;
    private long topRankPosition;
    private long deaths;
    private long kills;
    private long matchesWon;
    private long matchesLost;
    private long matchesAbandoned;
}
