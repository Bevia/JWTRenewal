package org.corebaseit.jwtrenewal;

import org.json.JSONObject;

public class JwtSessionParse {
    public static void main(String[] args) {
        String jsonString = "{\n" +
                "  \"success\": true,\n" +
                "  \"data\": {\n" +
                "    \"access\": {\n" +
                "      \"api_key\": \"ACCESS_TOKEN_HERE\",\n" +
                "      \"expires_in\": 3101\n" +
                "    },\n" +
                "    \"refresh\": {\n" +
                "      \"api_key\": \"REFRESH_TOKEN_HERE\",\n" +
                "      \"expires_in\": 2591501\n" +
                "    }\n" +
                "  }\n" +
                "}";

        try {
            JSONObject root = new JSONObject(jsonString);

            System.out.println("=== Raw JSON (Pretty Printed) ===");
            System.out.println(root.toString(4));

            boolean success = root.optBoolean("success", false);
            System.out.println("\nSuccess: " + success);

            if (root.has("data") && !root.isNull("data")) {
                JSONObject data = root.getJSONObject("data");

                // Access
                if (data.has("access") && !data.isNull("access")) {
                    JSONObject access = data.getJSONObject("access");
                    String accessApiKey = access.optString("api_key", null);
                    int accessExpiresIn = access.optInt("expires_in", 0);
                    System.out.println("--- Access ---");
                    System.out.println("Access API Key: " + accessApiKey);
                    System.out.println("Access Expires In: " + accessExpiresIn);
                }

                // Refresh
                if (data.has("refresh") && !data.isNull("refresh")) {
                    JSONObject refresh = data.getJSONObject("refresh");
                    String refreshApiKey = refresh.optString("api_key", null);
                    int refreshExpiresIn = refresh.optInt("expires_in", 0);
                    System.out.println("--- Refresh ---");
                    System.out.println("Refresh API Key: " + refreshApiKey);
                    System.out.println("Refresh Expires In: " + refreshExpiresIn);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}