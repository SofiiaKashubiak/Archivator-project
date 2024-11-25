package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class FileUtils {

    // Перевіряє існування файлу
    public static boolean fileExists(String path) {
        return Files.exists(Paths.get(path));
    }

    // Додає файл у вказаний каталог
    public static void addFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destinationPath);

        if (!Files.exists(source)) {
            throw new IOException("Source file does not exist: " + sourcePath);
        }

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }

    // Видаляє файл
    public static void deleteFile(String path) throws IOException {
        Path filePath = Paths.get(path);

        if (!Files.exists(filePath)) {
            throw new IOException("File does not exist: " + path);
        }

        Files.delete(filePath);
    }

    // Копіює файл
    public static void copyFile(String sourcePath, String destinationPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destinationPath);

        if (!Files.exists(source)) {
            throw new IOException("Source file does not exist: " + sourcePath);
        }

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
    }

    // Отримує розмір файлу
    public static long getFileSize(String path) throws IOException {
        Path filePath = Paths.get(path);

        if (!Files.exists(filePath)) {
            throw new IOException("File does not exist: " + path);
        }

        return Files.size(filePath);
    }
}