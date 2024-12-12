package strategy;

import models.File;
import utils.FileUtils;

import java.io.IOException;

public class FileDeletionStrategy implements FileProcessingStrategy {
    @Override
    public void processFile(File file) {
        try {
            if (FileUtils.fileExists(file.getFileName())) {
                FileUtils.deleteFile(file.getFileName());
            } else {
                System.out.println("File already deleted or not found: " + file.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}