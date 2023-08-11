package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Profile {
    private String profileId;
    private String userId;
    private String idOnPlatform;
    private String nameOnPlatform;
}
