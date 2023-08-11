package de.vault.service;

import org.json.JSONException;
import org.json.JSONObject;

class Utils {
    public static String getJsonString(JSONObject jsonObject, String value) {
        try {
            return jsonObject.getString(value);
        } catch (JSONException e) {
            throw new RuntimeException("Could not get string '" + value + "' from json object with content '" + jsonObject + "'");
        }
    }

    public static int getJsonInt(JSONObject jsonObject, String value) {
        try {
            return jsonObject.getInt(value);
        } catch (JSONException e) {
            throw new RuntimeException("Could not get int '" + value + "' from json object with content '" + jsonObject + "'");
        }
    }
}
