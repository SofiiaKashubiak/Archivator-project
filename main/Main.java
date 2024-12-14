package main;

import adapters.ArchiveAdapter;
import adapters.ZipArchiveAdapter;
import context.FileProcessorContext;
import models.File;
import strategy.ChecksumVerificationStrategy;
import strategy.FileDeletionStrategy;
import utils.FileUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtils.createTestFile("example.txt");
        FileUtils.createTestFile("example2.txt");

        File file = new File();
        file.setFileName("example.txt");
        file.setChecksum("e7cb632359a2be17c1008b50f9ec85691cd5d66834d5fe8f63ef65ceb06682ee");

        FileProcessorContext context = new FileProcessorContext();

        context.setStrategy(new ChecksumVerificationStrategy());
        context.executeStrategy(file);

        context.setStrategy(new FileDeletionStrategy());
        context.executeStrategy(file);

        ArchiveAdapter zipAdapter = new ZipArchiveAdapter();

        String[] filesToArchive = {"example2.txt"};
        zipAdapter.createArchive("archive.zip", filesToArchive);

        zipAdapter.extractArchive("archive.zip", "./output");

        zipAdapter.addFile("archive.zip", "example.txt");

        zipAdapter.deleteFile("archive.zip", "example2.txt");

        System.out.println("Demo completed!");
    }
}