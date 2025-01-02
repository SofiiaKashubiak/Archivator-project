package main;

import adapters.ZipArchiveAdapter;
import facade.ArchiveFacade;
import factory.ZipArchiveTesterFactory;
import models.Archive;
import models.File;
import models.Folder;
import strategy.ChecksumVerificationStrategy;
import strategy.FileDeletionStrategy;
import utils.FileUtils;
import visitor.InfoVisitor;
import visitor.ObjectStructure;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // Існуючий функціонал
        FileUtils.createTestFile("example.txt");
        FileUtils.createTestFile("example2.txt");

        ArchiveFacade facade = new ArchiveFacade(new ZipArchiveAdapter(), new ZipArchiveTesterFactory());

        File file = new File();
        file.setFileName("example.txt");
        file.setChecksum("e7cb632359a2be17c1008b50f9ec85691cd5d66834d5fe8f63ef65ceb06682ee");

        System.out.println("Verifying file checksum:");
        facade.processFile(file, new ChecksumVerificationStrategy());

        System.out.println("\nDeleting file:");
        facade.processFile(file, new FileDeletionStrategy());

        System.out.println("\nCreating archive:");
        facade.createArchive("archive.zip", new String[]{"example2.txt"});

        System.out.println("\nExtracting archive:");
        facade.extractArchive("archive.zip", "./output");

        System.out.println("\nAdding file to archive:");
        facade.addFileToArchive("archive.zip", "example.txt");

        System.out.println("\nDeleting file from archive:");
        facade.deleteFileFromArchive("archive.zip", "example2.txt");

        System.out.println("\nTesting archive integrity:");
        facade.testArchive("archive.zip");

        System.out.println("\nDemo completed!");

        System.out.println("\n--- Visitor Pattern Demonstration ---");

        File file1 = new File(1L, "example.txt", 1234, "checksum1");
        File file2 = new File(2L, "example2.txt", 5678, "checksum2");

        Folder folder = new Folder();
        folder.setFolderName("MyFolder");
        folder.setFiles(Arrays.asList(file1, file2));

        Archive archive = new Archive();
        archive.setName("MyArchive");
        archive.setFiles(Arrays.asList(file1, file2));
        archive.setFolders(Arrays.asList(folder));

        ObjectStructure structure = new ObjectStructure();
        structure.addElement(file1);
        structure.addElement(file2);
        structure.addElement(folder);
        structure.addElement(archive);

        InfoVisitor visitor = new InfoVisitor();
        structure.accept(visitor);

        System.out.println("\n--- End of Visitor Pattern Demonstration ---");
    }
}