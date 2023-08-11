package de.vault.service;

import de.vault.models.Profile;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class ProfileParser {
    protected static List<Profile> toProfile(String json) {
        final var jsonObject = new JSONObject(json);

        if (jsonObject.isEmpty()) {
            throw new RuntimeException("Failed to get profile. Json is empty");
        }
        final var jsonObjects = new ArrayList<JSONObject>();
        final var jsonArray = jsonObject.getJSONArray("profiles");

        for (int i = 0; i < jsonArray.length(); i++) {
            jsonObjects.add(jsonArray.getJSONObject(i));
        }

        return jsonObjects
                .stream()
                .map(ProfileParser::convertToProfile)
                .toList();
    }

    private static Profile convertToProfile(JSONObject jsonObject) {
        return new Profile()
                .setProfileId(Utils.getJsonString(jsonObject, "profileId"))
                .setUserId(Utils.getJsonString(jsonObject, "userId"))
                .setIdOnPlatform(Utils.getJsonString(jsonObject, "platformType"))
                .setNameOnPlatform(Utils.getJsonString(jsonObject, "idOnPlatform"));
    }
}
