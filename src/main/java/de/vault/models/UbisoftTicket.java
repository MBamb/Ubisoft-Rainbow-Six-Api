package de.vault.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UbisoftTicket {
    private String platformType;
    private String ticket;
    private String profileId;
    private String userId;
    private String nameOnPlatform;
    private String environment;
    private String expiration;
    private String spaceId;
    private String clientIp;
    private String clientCountry;
    private String serverTime;
    private String sessionId;
    private String sessionKey;
}
