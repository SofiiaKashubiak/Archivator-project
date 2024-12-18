package factory;

public class TarGzArchiveTesterFactory extends ArchiveTesterFactory {
    @Override
    public ArchiveTester createTester() {
        return new TarGzArchiveTester();
    }
}