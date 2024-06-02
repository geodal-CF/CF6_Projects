package gr.aueb.cf.ch9;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class location {

    public static void main(String[] args) {
        String inputFileName = "locations.txt";
        String outputFileName = "formatted_locations.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            boolean isFirstLine = true;

            // Διαβάστε τις γραμμές του αρχείου
            while ((line = reader.readLine()) != null) {
                // Παράλειψη της πρώτης γραμμής (επικεφαλίδες)
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                // Χωρίστε τη γραμμή στα στοιχεία της
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String location = parts[0].trim();
                    String latitude = parts[1].trim();
                    String longitude = parts[2].trim();

                    // Δημιουργία της μορφής εξόδου
                    String formattedLine = String.format("{ location: '%s', latitude: %s, longitude: %s },", location, latitude, longitude);
                    writer.write(formattedLine);
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
