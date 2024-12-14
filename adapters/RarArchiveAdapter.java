package adapters;

import java.io.IOException;

public class RarArchiveAdapter implements ArchiveAdapter {
    @Override
    public void createArchive(String archiveName, String[] files) throws IOException {
        System.out.println("Creating .rar archive...");
    }

    @Override
    public void extractArchive(String archiveName, String outputDir) throws IOException {
        System.out.println("Extracting .rar archive...");
    }

    @Override
    public void addFile(String archiveName, String filePath) throws IOException {
        System.out.println("Adding file to .rar archive...");
    }

    @Override
    public void deleteFile(String archiveName, String fileName) throws IOException {
        System.out.println("Deleting file from .rar archive...");
    }
}