package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileUtils {

    public static boolean fileExists(String path) {
        return Files.exists(Paths.get(path));
    }


    public static void addFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destinationPath);

        if (!Files.exists(source)) {
            throw new IOException("Source file does not exist: " + sourcePath);
        }

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }


    public static void deleteFile(String path) throws IOException {
        Path filePath = Paths.get(path);

        if (!Files.exists(filePath)) {
            throw new IOException("File does not exist: " + path);
        }

        Files.delete(filePath);
    }


    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destinationPath);

        if (!Files.exists(source)) {
            throw new IOException("Source file does not exist: " + sourcePath);
        }

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }


    public static long getFileSize(String path) throws IOException {
        Path filePath = Paths.get(path);

        if (!Files.exists(filePath)) {
            throw new IOException("File does not exist: " + path);
        }

        return Files.size(filePath);
    }
}