package org.corebaseit.jwtrenewal;

import org.json.JSONObject;

public class NewJwtRenewalApplication {
    public static void main(String[] args) {

        // Paste your actual JSON here (escaped for Java)
        String jsonString = "{\n" +
                "  \"success\": true,\n" +
                "  \"data\": {\n" +
                "    \"name\": \"Terminal 00000QOU\",\n" +
                "    \"session\": {\n" +
                "      \"access\": {\n" +
                "        \"api_key\": \"eyJraWQiOiJwb3MuMDEiLCJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJzbWFydHBvcyIsInNlc3Npb24iOnsiaWQiOiIxOTE4OTcyYS1mOWI0LTRkNDYtYjkxYS1mYjM5MTg1NjIxYWIiLCJ0eXBlIjoiYWNjZXNzIn0sImdydCI6WyJwb3M6c3RhdHVzIiwicG9zOmNvbmZpZ3VyYXRpb24iLCJtYnVzOnBvcy5wYXltZW50LnB1c2giLCJwb3M6ZmluYWxpemUtb3JkZXIiLCJvcmRlcnM6Y3JlYXRlIl0sIm1pZCI6MTAwMTAwMSwiZXhwIjoxNzU0NDg0NzY2LCJpYXQiOjE3NTQ0ODExNjYsImp0aSI6IjI2NDExIiwidGlkIjoiMDAwMDBRT1UiLCJzaWQiOjU3OTU4fQ.v1aMXf9GYIu7beMPpRRVMfLBXOHYq-LGXWka5aVwbtPi2vfZ6xI2b3KvN2VEwePftENI6Xx2L8p26K9mtLwjkXeC7-0H3m4Cv6PBerXfuJfEXGLr_K58senm1leEwWdLudvplfYwF_OywZc93zelqNEToBloWUzhoKoyZKl1b9MB2ggee1t_7yj94EHw6P5Wnylv4PeWgpfBWcg9Q5LBnvsPbAzn0oGWsjnZBdOy2l_rpkYpugilWT88RSuHI65vZtkdZopfuFDwJ0oF2rYQKc6gPDF8XOw7Axi7yYXMpkPBSzQTo0CTVwkiV_fVUWkW46BksaEfJWc7ePtnmPHF4A\",\n" +
                "        \"expires_in\": 3600\n" +
                "      },\n" +
                "      \"refresh\": {\n" +
                "        \"api_key\": \"eyJraWQiOiJwb3MuMDEiLCJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJzbWFydHBvcyIsInNlc3Npb24iOnsiaWQiOiIxOTE4OTcyYS1mOWI0LTRkNDYtYjkxYS1mYjM5MTg1NjIxYWIiLCJ0eXBlIjoicmVmcmVzaCJ9LCJncnQiOlsicG9zOnN0YXR1cyIsInBvczpjb25maWd1cmF0aW9uIiwibWJ1czpwb3MucGF5bWVudC5wdXNoIiwicG9zOmZpbmFsaXplLW9yZGVyIiwib3JkZXJzOmNyZWF0ZSJdLCJtaWQiOjEwMDEwMDEsImV4cCI6MTc1NzA3MzE2NiwiaWF0IjoxNzU0NDgxMTY2LCJqdGkiOiIyNjQxMCIsInRpZCI6IjAwMDAwUU9VIiwic2lkIjo1Nzk1OH0.QQpDIfWmRiXtSb_sXo2LtD4UnitMGfKduN_g7EGvXGrJamN5hoAbZFvfGlyLaNPRygAiKFHHvf6FRLh0mPAZHPf-7x2jsFmi1PnekgLxdPtJk6wMG9ydmvK2lkT0FjsgAaUfF_EViy9J4RHWTqKYmDkFxj1xFSWBn0rP7nSTWHBGpGsk7OSeSpTczj__k31mE2n8U-x0AWvgsI4FsPij6Xw7z4tutuevF45ozHTT3BXBdNFX9ngwKWO60FTHTEd4XHgvbQUVurTbGxqC5w9jJncY5Kuj94jxDY14aNKKQ5iSim2vn_eMXBlJMwrE5RlsjQxUXTTYwTFHObwryM2fYA\",\n" +
                "        \"expires_in\": 2592000\n" +
                "      }\n" +
                "    },\n" +
                "    \"terminal_id\": \"00000QOU\",\n" +
                "    \"api_key\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzbWFydHBvcyIsImdydCI6WyJwb3M6c3RhdHVzIiwicG9zOmNvbmZpZ3VyYXRpb24iLCJtYnVzOnBvcy5wYXltZW50LnB1c2giLCJwb3M6ZmluYWxpemUtb3JkZXIiLCJvcmRlcnM6Y3JlYXRlIl0sIm1pZCI6MTAwMTAwMSwiaWF0IjoxNzU0NDgxMTY2LCJqdGkiOiIyNjQwOSIsInRpZCI6IjAwMDAwUU9VIiwic2lkIjo1Nzk1OH0.YcRWgX2J2BXQNcqLxWYBqLezKEnsYlc_QPpC2dq-8II\"\n" +
                "  }\n" +
                "}";

        try {
            // Parse root object
            JSONObject root = new JSONObject(jsonString);

            // Print the whole JSON in a pretty format
            System.out.println("=== Full Parsed JSON ===");
            System.out.println(root.toString(4));  // 4 = indent spaces

            boolean success = root.getBoolean("success");
            JSONObject data = root.getJSONObject("data");

            // Extract values from "data"
            String name = data.getString("name");
            String terminalId = data.getString("terminal_id");
            String mainApiKey = data.getString("api_key");

            // Access session object
            JSONObject session = data.getJSONObject("session");

            // Access token
            JSONObject access = session.getJSONObject("access");
            String accessApiKey = access.getString("api_key");
            int accessExpiresIn = access.getInt("expires_in");

            // Refresh token
            JSONObject refresh = session.getJSONObject("refresh");
            String refreshApiKey = refresh.getString("api_key");
            int refreshExpiresIn = refresh.getInt("expires_in");

            // Print everything
            System.out.println("=== Parsed Fields ===");
            System.out.println("Success: " + success);
            System.out.println("Name: " + name);
            System.out.println("Terminal ID: " + terminalId);
            System.out.println();
            System.out.println("--- Main Token ---");
            System.out.println("Main API Key: " + mainApiKey);
            System.out.println();
            System.out.println("--- Access Token ---");
            System.out.println("Access API Key: " + accessApiKey);
            System.out.println("Access Expires In: " + accessExpiresIn);
            System.out.println();
            System.out.println("--- Refresh Token ---");
            System.out.println("Refresh API Key: " + refreshApiKey);
            System.out.println("Refresh Expires In: " + refreshExpiresIn);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}