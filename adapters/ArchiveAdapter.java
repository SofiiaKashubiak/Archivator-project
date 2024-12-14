package adapters;

import java.io.IOException;

public interface ArchiveAdapter {
    void createArchive(String archiveName, String[] files) throws IOException;

    void extractArchive(String archiveName, String outputDir) throws IOException;

    void addFile(String archiveName, String filePath) throws IOException;

    void deleteFile(String archiveName, String fileName) throws IOException;
}