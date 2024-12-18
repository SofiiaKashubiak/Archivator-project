package factory;

public class ZipArchiveTesterFactory extends ArchiveTesterFactory {
    @Override
    public ArchiveTester createTester() {
        return new ZipArchiveTester();
    }
}
