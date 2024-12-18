package factory;

public class RarArchiveTesterFactory extends ArchiveTesterFactory {
    @Override
    public ArchiveTester createTester() {
        return new RarArchiveTester();
    }
}
