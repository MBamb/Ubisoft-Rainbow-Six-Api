package de.vault.models;

public enum TeamRole {
    ATTACKER, DEFENDER, COMBINED;

    public String getQueryName() {
        return switch (this) {
            case ATTACKER -> "Attacker";
            case DEFENDER -> "Defender";
            default -> "all";
        };
    }
}
