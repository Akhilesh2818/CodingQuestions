import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class FileWriters {
    static String[] countries = { "1:India", "2:Germany", "3:America", "4:Japan", "5:Russia" };

    public static void writeToFile(String[] countries, String filename, long targetSizeInMB) throws IOException {
        List<String> collect = Arrays.stream(countries)
                .map(e -> e.substring(e.indexOf(":") + 1))
                .collect(Collectors.toList());

        Random random = new Random();
        long targetSize = targetSizeInMB * 1024 * 1024; // MB → Bytes
        long writtenBytes = 0;

        try (BufferedWriter file = new BufferedWriter(new FileWriter(filename))) {
            while (writtenBytes < targetSize) {
                String country = collect.get(random.nextInt(collect.size()));
                file.write(country);
                file.newLine();

                // Update written size (approx)
                writtenBytes += country.length() + System.lineSeparator().length();
            }
        }

        System.out.println("File generated: " + filename + " (" + writtenBytes + " bytes)");
    }

    public static void main(String[] args) throws IOException {
        writeToFile(countries, "file.txt", 200); // generate 200 MB file
    }
}
