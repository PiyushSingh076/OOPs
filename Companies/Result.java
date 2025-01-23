import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

class Result {

    public static int getWinnerTotalGoals(String competition, int year) {
        int totalGoals = 0;
        try {
            // Step 1: create the urlGet the winner of the competition
            String encodedCompetition = URLEncoder.encode(competition, "UTF-8");
            String competitionUrl = "https://jsonmock.hackerrank.com/api/football_competitions?name=" + encodedCompetition + "&year=" + year;

            // Get JSON response for the competition
            String jsonResponse = getJsonResponse(competitionUrl);

            // Extract the winner from the response
            String winner = extractWinnerFromJson(jsonResponse);

            // Step 2: Get total goals scored by the winner in that competition
            if (winner != null) {
                // URLs for both home (team1) and away (team2) matches
                String urlTeam1 = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team1=" + URLEncoder.encode(winner, "UTF-8") + "&competition=" + encodedCompetition + "&page=";
                String urlTeam2 = "https://jsonmock.hackerrank.com/api/football_matches?year=" + year + "&team2=" + URLEncoder.encode(winner, "UTF-8") + "&competition=" + encodedCompetition + "&page=";

                // Add goals scored as team1 (home team)
                totalGoals += getGoalsFromUrl(urlTeam1, "team1goals");

                // Add goals scored as team2 (away team)
                totalGoals += getGoalsFromUrl(urlTeam2, "team2goals");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalGoals;
    }

    private static String getJsonResponse(String urlStr) throws IOException {
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        Scanner scanner = new Scanner(conn.getInputStream());
        StringBuilder content = new StringBuilder();

        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine());
        }

        // Close the scanner and disconnect the connection
        scanner.close();
        conn.disconnect();

        return content.toString();
    }

    private static String extractWinnerFromJson(String json) {
        // Find the start of the data array
        int dataIndex = json.indexOf("\"data\":[");
        if (dataIndex == -1) {
            return null;  // Return null if "data" not found
        }

        // Extract the data array
        String data = json.substring(dataIndex + 8);
        int endIndex = data.indexOf("],");
        if (endIndex != -1) {
            data = data.substring(0, endIndex);
        }

        // Extract the winner field
        int winnerIndex = data.indexOf("\"winner\":\"");
        if (winnerIndex != -1) {
            int winnerStart = winnerIndex + 10;
            int winnerEnd = data.indexOf("\"", winnerStart);
            return data.substring(winnerStart, winnerEnd);
        }

        return null;
    }

    private static int getGoalsFromUrl(String urlStr, String goalKey) {
        int goals = 0;
        int page = 1;

        try {
            while (true) {
                URL url = new URL(urlStr + page);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                Scanner scanner = new Scanner(conn.getInputStream());
                StringBuilder content = new StringBuilder();

                while (scanner.hasNextLine()) {
                    content.append(scanner.nextLine());
                }

                // Close the scanner and disconnect the connection
                scanner.close();
                conn.disconnect();

                // Convert the response to a string
                String jsonResponse = content.toString();

                // Manually parse the JSON response
                goals += extractGoalsFromJson(jsonResponse, goalKey);

                // Check if there are more pages
                int totalPages = extractTotalPages(jsonResponse);
                if (page >= totalPages) {
                    break;
                }
                page++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return goals;
    }

    private static int extractGoalsFromJson(String json, String goalKey) {
        int goals = 0;

        // Find the start of the data array
        int dataIndex = json.indexOf("\"data\":[");
        if (dataIndex == -1) {
            return goals;  // Return 0 if "data" not found
        }

        // Extract the data array
        String data = json.substring(dataIndex + 8);
        int endIndex = data.indexOf("],");
        if (endIndex != -1) {
            data = data.substring(0, endIndex);
        }

        // Split data into individual matches
        String[] matches = data.split("\\},\\{");

        // Extract goals from each match
        for (String match : matches) {
            int goalIndex = match.indexOf("\"" + goalKey + "\":\"");
            if (goalIndex != -1) {
                int goalStart = goalIndex + goalKey.length() + 4;
                int goalEnd = match.indexOf("\"", goalStart);
                goals += Integer.parseInt(match.substring(goalStart, goalEnd));
            }
        }

        return goals;
    }

    private static int extractTotalPages(String json) {
        int totalPages = 1;

        // Find the "total_pages" field
        int totalPagesIndex = json.indexOf("\"total_pages\":");
        if (totalPagesIndex != -1) {
            int start = totalPagesIndex + 14;
            int end = json.indexOf(",", start);
            totalPages = Integer.parseInt(json.substring(start, end).trim());
        }

        return totalPages;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String competition = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine().trim());

        int result = Result.getWinnerTotalGoals(competition, year);

        System.out.println(result);
    }
}
