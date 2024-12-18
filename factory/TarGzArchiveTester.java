package factory;

public class TarGzArchiveTester implements ArchiveTester {
    @Override
    public boolean testArchive(String archiveName) {
        System.out.println("Testing .tar.gz archive: " + archiveName);
        return true;
    }
}
