package org.corebaseit.jwtrenewal;

import org.json.JSONObject;

public class JwtRenewalWithValidation {

    public static void main(String[] args) {
        String jsonString = "{\n" +
                "   \"success\":true,\n" +
                "   \"data\":{\n" +
                "      \"name\":\"Terminal 00000QOV\",\n" +
                "      \"integration\":{\n" +
                "         \"code\":\"9178579692061\"\n" +
                "      },\n" +
                "      \"session\":{\n" +
                "         \"access\":{\n" +
                "            \"api_key\":\"ACCESS_TOKEN_HERE\",\n" +
                "            \"expires_in\":3600\n" +
                "         },\n" +
                "         \"refresh\":{\n" +
                "            \"api_key\":\"REFRESH_TOKEN_HERE\",\n" +
                "            \"expires_in\":2592000\n" +
                "         }\n" +
                "      },\n" +
                "      \"terminal_id\":\"00000QOV\",\n" +
                "      \"api_key\":\"MAIN_API_KEY\"\n" +
                "   }\n" +
                "}";

        try {
            JSONObject root = new JSONObject(jsonString);

            System.out.println("========= Raw JSON (Pretty Printed) =========");
            System.out.println(root.toString(4));

            boolean success = root.optBoolean("success", false);
            System.out.println("\nSuccess: " + success);

            if (root.has("data") && !root.isNull("data")) {
                JSONObject data = root.getJSONObject("data");

                String name = data.has("name") && !data.isNull("name") ? data.getString("name") : null;
                System.out.println("Name: " + name);

                if (data.has("integration") && !data.isNull("integration")) {
                    JSONObject integration = data.getJSONObject("integration");
                    String integrationCode = integration.has("code") && !integration.isNull("code")
                            ? integration.getString("code") : null;
                    System.out.println("Integration Code: " + integrationCode);
                }

                if (data.has("session") && !data.isNull("session")) {
                    JSONObject session = data.getJSONObject("session");

                    if (session.has("access") && !session.isNull("access")) {
                        JSONObject access = session.getJSONObject("access");
                        String accessApiKey = access.optString("api_key", null);
                        int accessExpiresIn = access.optInt("expires_in", 0);
                        System.out.println("Access Token: " + accessApiKey);
                        System.out.println("Access Expires In: " + accessExpiresIn);
                    }

                    if (session.has("refresh") && !session.isNull("refresh")) {
                        JSONObject refresh = session.getJSONObject("refresh");
                        String refreshApiKey = refresh.optString("api_key", null);
                        int refreshExpiresIn = refresh.optInt("expires_in", 0);
                        System.out.println("Refresh Token: " + refreshApiKey);
                        System.out.println("Refresh Expires In: " + refreshExpiresIn);
                    }
                }

                String terminalId = data.optString("terminal_id", null);
                System.out.println("Terminal ID: " + terminalId);

                String apiKey = data.optString("api_key", null);
                System.out.println("Main API Key: " + apiKey);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}