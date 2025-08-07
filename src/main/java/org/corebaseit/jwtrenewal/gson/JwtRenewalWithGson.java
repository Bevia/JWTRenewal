package org.corebaseit.jwtrenewal.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JwtRenewalWithGson {
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

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // Deserialize
        Root root = gson.fromJson(jsonString, Root.class);

        // Print raw parsed object
        System.out.println("\n=== Raw Parsed Object with GSON ===");
        System.out.println(gson.toJson(root));

        // Access fields safely
        System.out.println("\n=== Parsed Fields ===");
        System.out.println("\nSuccess: " + root.success);

        if (root.data != null) {
            System.out.println("Name: " + root.data.name);
            if (root.data.integration != null)
                System.out.println("Integration Code: " + root.data.integration.code);

            if (root.data.session != null) {
                if (root.data.session.access != null) {
                    System.out.println("Access Token: " + root.data.session.access.api_key);
                    System.out.println("Access Expires In: " + root.data.session.access.expires_in);
                }
                if (root.data.session.refresh != null) {
                    System.out.println("Refresh Token: " + root.data.session.refresh.api_key);
                    System.out.println("Refresh Expires In: " + root.data.session.refresh.expires_in);
                }
            }

            System.out.println("Terminal ID: " + root.data.terminal_id);
            System.out.println("Main API Key: " + root.data.api_key);
        }
    }
}