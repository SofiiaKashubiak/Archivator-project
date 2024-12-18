package facade;

import adapters.ArchiveAdapter;
import factory.ArchiveTesterFactory;
import models.File;
import strategy.FileProcessingStrategy;

import java.io.IOException;

public class ArchiveFacade {
    private final ArchiveAdapter adapter;
    private final ArchiveTesterFactory testerFactory;

    public ArchiveFacade(ArchiveAdapter adapter, ArchiveTesterFactory testerFactory) {
        this.adapter = adapter;
        this.testerFactory = testerFactory;
    }

    public void createArchive(String archiveName, String[] files) throws IOException {
        adapter.createArchive(archiveName, files);
    }

    public void extractArchive(String archiveName, String outputDir) throws IOException {
        adapter.extractArchive(archiveName, outputDir);
    }

    public void addFileToArchive(String archiveName, String filePath) throws IOException {
        adapter.addFile(archiveName, filePath);
    }

    public void deleteFileFromArchive(String archiveName, String fileName) throws IOException {
        adapter.deleteFile(archiveName, fileName);
    }

    public void testArchive(String archiveName) {
        testerFactory.test(archiveName);
    }

    public void processFile(File file, FileProcessingStrategy strategy) {
        strategy.processFile(file);
    }
}
