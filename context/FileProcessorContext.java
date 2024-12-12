package context;

import models.File;
import strategy.FileProcessingStrategy;

public class FileProcessorContext {
    private FileProcessingStrategy strategy;

    public void setStrategy(FileProcessingStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(File file) {
        if (strategy != null) {
            strategy.processFile(file);
        } else {
            System.out.println("Strategy is not set!");
        }
    }
}
