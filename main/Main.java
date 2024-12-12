package main;

import context.FileProcessorContext;
import models.File;
import strategy.ChecksumVerificationStrategy;
import strategy.FileDeletionStrategy;
import utils.FileUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileUtils.createTestFile("example.txt");

        File file = new File();
        file.setFileName("example.txt");
        file.setChecksum("e7cb632359a2be17c1008b50f9ec85691cd5d66834d5fe8f63ef65ceb06682ee");

        FileProcessorContext context = new FileProcessorContext();

        context.setStrategy(new ChecksumVerificationStrategy());
        context.executeStrategy(file);

        context.setStrategy(new FileDeletionStrategy());
        context.executeStrategy(file);

    }
}