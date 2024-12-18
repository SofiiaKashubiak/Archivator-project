package factory;

public class ZipArchiveTester implements ArchiveTester {
    @Override
    public boolean testArchive(String archiveName) {
        System.out.println("Testing .zip archive: " + archiveName);
        return true;
    }
}
