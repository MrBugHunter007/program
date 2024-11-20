import java.io.*;
import java.net.*;

public class SimpleURLDemo {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Display basic information about the URL
            System.out.println("URL: " + url);
            System.out.println("Content Type: " + connection.getContentType());

            // Read and print the content from the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            System.out.println("\nContent:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
