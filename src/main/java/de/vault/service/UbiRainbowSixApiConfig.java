package de.vault.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UbiRainbowSixApiConfig {
    /**
     * App id to be sent with requests concerning seasons SOLAR RAID and newer
     */
    private String ubiAppId = "";
    /**
     * App id to be sent with requests concerning seasons before SOLAR RAID
     */
    private String ubiAppIdOld = "";
}
