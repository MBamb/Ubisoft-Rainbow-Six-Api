package de.vault.service;

import de.vault.models.UbisoftTicket;
import org.json.JSONObject;

import java.time.Instant;

class UbisoftTicketParser {
    protected UbisoftTicket toTicket(String json) {
        final var jsonObject = new JSONObject(json);

        if (jsonObject.isEmpty()) {
            throw new RuntimeException("Failed to get ticket. Json is empty");
        }

        return new UbisoftTicket()
                .setPlatformType(Utils.getJsonString(jsonObject, "platformType"))
                .setTicket(Utils.getJsonString(jsonObject, "ticket"))
                .setProfileId(Utils.getJsonString(jsonObject, "profileId"))
                .setUserId(Utils.getJsonString(jsonObject, "userId"))
                .setNameOnPlatform(Utils.getJsonString(jsonObject, "nameOnPlatform"))
                .setEnvironment(Utils.getJsonString(jsonObject, "environment"))
                .setExpiration(Instant.parse(Utils.getJsonString(jsonObject, "expiration")))
                .setSpaceId(Utils.getJsonString(jsonObject, "spaceId"))
                .setClientIp(Utils.getJsonString(jsonObject, "clientIp"))
                .setClientCountry(Utils.getJsonString(jsonObject, "clientIpCountry"))
                .setServerTime(Instant.parse(Utils.getJsonString(jsonObject, "serverTime")))
                .setSessionId(Utils.getJsonString(jsonObject, "sessionId"))
                .setSessionKey(Utils.getJsonString(jsonObject, "sessionKey"));
    }
}
