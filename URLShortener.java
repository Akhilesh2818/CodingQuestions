import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class URLShortener {
    // Map to store shortURL -> originalURL mapping
    private HashMap<String, String> urlMap = new HashMap<>();
    private String domain = "http://short.ly/";

    // Characters to generate short URL
    private String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private Random random = new Random();

    // Method to generate random short key
    private String generateKey(int length) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

    // Method to shorten URL
    public String shortenURL(String originalURL) {
        String key = generateKey(6); // Short URL key length 6
        while(urlMap.containsKey(key)) {
            key = generateKey(6); // Ensure key is unique
        }
        urlMap.put(key, originalURL);
        return domain + key;
    }

    // Method to get original URL
    public String getOriginalURL(String shortURL) {
        String key = shortURL.trim().replace(domain, "");
        return urlMap.getOrDefault(key, "URL not found");
    }

    public static void main(String[] args) {
        URLShortener shortener = new URLShortener();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("\n1. Shorten URL");
            System.out.println("2. Get Original URL");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice) {
                case 1:
                    System.out.print("Enter URL to shorten: ");
                    String url = sc.nextLine();
                    String shortURL = shortener.shortenURL(url);
                    System.out.println("Short URL: " + shortURL);
                    break;
                case 2:
                    System.out.print("Enter short URL: ");
                    String sURL = sc.nextLine();
                    System.out.println("Original URL: " + shortener.getOriginalURL(sURL));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
