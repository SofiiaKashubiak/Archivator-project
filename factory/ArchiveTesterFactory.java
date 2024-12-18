package factory;

public abstract class ArchiveTesterFactory {
    public abstract ArchiveTester createTester();

    public void test(String archiveName) {
        ArchiveTester tester = createTester();
        boolean result = tester.testArchive(archiveName);
        if (result) {
            System.out.println("Archive " + archiveName + " is valid.");
        } else {
            System.out.println("Archive " + archiveName + " is corrupted.");
        }
    }
}
