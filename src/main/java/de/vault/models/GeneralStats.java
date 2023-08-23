package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GeneralStats extends Stats {
    private GameMode gameMode;
    private TeamRole teamRole;
}
