package factory;

public class AceArchiveTesterFactory extends ArchiveTesterFactory {
    @Override
    public ArchiveTester createTester() {
        return new AceArchiveTester();
    }
}
