package adapters;

import utils.ArchiveUtils;

import java.io.IOException;

public class ZipArchiveAdapter implements ArchiveAdapter {
    @Override
    public void createArchive(String archiveName, String[] files) throws IOException {
        ArchiveUtils.createZipArchive(archiveName, files);
    }

    @Override
    public void extractArchive(String archiveName, String outputDir) throws IOException {
        ArchiveUtils.extractZipArchive(archiveName, outputDir);
    }

    @Override
    public void addFile(String archiveName, String filePath) throws IOException {
        ArchiveUtils.addFileToZip(archiveName, filePath);
    }

    @Override
    public void deleteFile(String archiveName, String fileName) throws IOException {
        ArchiveUtils.deleteFileFromZip(archiveName, fileName);
    }
}