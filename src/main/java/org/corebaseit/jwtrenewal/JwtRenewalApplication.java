package org.corebaseit.jwtrenewal;
import org.json.JSONObject;

public class JwtRenewalApplication {

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

            // Print the whole JSON pretty-printed
            System.out.println("=== Raw JSON (Pretty Printed) ===");
            System.out.println(root.toString(6)); // Indent with 4 spaces

            boolean success = root.getBoolean("success");

            JSONObject data = root.getJSONObject("data");
            String name = data.getString("name");

            JSONObject integration = data.getJSONObject("integration");
            String integrationCode = integration.getString("code");

            JSONObject session = data.getJSONObject("session");

            JSONObject access = session.getJSONObject("access");
            String accessApiKey = access.getString("api_key");
            int accessExpiresIn = access.getInt("expires_in");

            JSONObject refresh = session.getJSONObject("refresh");
            String refreshApiKey = refresh.getString("api_key");
            int refreshExpiresIn = refresh.getInt("expires_in");

            String terminalId = data.getString("terminal_id");
            String apiKey = data.getString("api_key");

            // Output
            System.out.println("Success: " + success);
            System.out.println("Name: " + name);
            System.out.println("Integration Code: " + integrationCode);
            System.out.println("Access Token: " + accessApiKey);
            System.out.println("Access Expires In: " + accessExpiresIn);
            System.out.println("Refresh Token: " + refreshApiKey);
            System.out.println("Refresh Expires In: " + refreshExpiresIn);
            System.out.println("Terminal ID: " + terminalId);
            System.out.println("Main API Key: " + apiKey);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}