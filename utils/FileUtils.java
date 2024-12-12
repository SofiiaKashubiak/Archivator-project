package utils;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class FileUtils {
    public static boolean fileExists(String filename) {
        return Files.exists(Paths.get(filename));
    }

    public static void createTestFile(String filename) throws IOException {
        if (!fileExists(filename)) {
            String content = "This is an example file.";
            Files.write(Paths.get(filename), content.getBytes());
        }
    }

    public static void deleteFile(String filename) throws IOException {
        if (fileExists(filename)) {
            Files.delete(Paths.get(filename));
            System.out.println("File deleted: " + filename);
        } else {
            System.out.println("File not found: " + filename);
        }
    }
}