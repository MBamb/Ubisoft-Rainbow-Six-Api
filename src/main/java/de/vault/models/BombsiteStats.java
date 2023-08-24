package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BombsiteStats extends Stats {
    private GameMode gameMode;
    private TeamRole teamRole;
    private String bombsite;
    private long seasonYear;
    private long seasonNumber;
}
