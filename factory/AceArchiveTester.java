package factory;

public class AceArchiveTester implements ArchiveTester {
    @Override
    public boolean testArchive(String archiveName) {
        System.out.println("Testing .ace archive: " + archiveName);
        return true;
    }
}
