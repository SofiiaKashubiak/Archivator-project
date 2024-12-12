package strategy;

import models.File;
import utils.ChecksumUtils;

public class ChecksumVerificationStrategy implements FileProcessingStrategy {
    @Override
    public void processFile(File file) {
        try {
            String calculatedChecksum = ChecksumUtils.calculateChecksum(file.getFileName());
            System.out.println("Calculated checksum: " + calculatedChecksum);
            if (calculatedChecksum.equals(file.getChecksum())) {
                System.out.println("File checksum is valid for: " + file.getFileName());
            } else {
                System.out.println("Invalid checksum for: " + file.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}