package factory;

public class RarArchiveTester implements ArchiveTester {
    @Override
    public boolean testArchive(String archiveName) {
        System.out.println("Testing .rar archive: " + archiveName);
        return true;
    }
}