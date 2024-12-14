package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ArchiveUtils {

    // Метод для створення .zip архіву
    public static void createZipArchive(String archiveName, String[] files) throws IOException {
        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(archiveName))) {
            for (String file : files) {
                if (Files.exists(Paths.get(file))) {
                    ZipEntry zipEntry = new ZipEntry(file);
                    zos.putNextEntry(zipEntry);

                    byte[] bytes = Files.readAllBytes(Paths.get(file));
                    zos.write(bytes, 0, bytes.length);
                    zos.closeEntry();
                } else {
                    System.out.println("File not found: " + file);
                }
            }
        }
        System.out.println("Archive created: " + archiveName);
    }

    // Заглушки для майбутніх функцій
    public static void extractZipArchive(String archiveName, String outputDir) throws IOException {
        System.out.println("Extracting .zip archive: " + archiveName + " to " + outputDir);
        // Реалізуйте тут розпаковку архіву
    }

    public static void addFileToZip(String archiveName, String filePath) throws IOException {
        System.out.println("Adding file: " + filePath + " to archive: " + archiveName);
        // Реалізуйте тут додавання файлу
    }

    public static void deleteFileFromZip(String archiveName, String fileName) throws IOException {
        System.out.println("Deleting file: " + fileName + " from archive: " + archiveName);
        // Реалізуйте тут видалення файлу
    }
}
