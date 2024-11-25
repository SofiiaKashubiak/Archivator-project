package models;

public class ArchiveSettings {
    private boolean splitEnabled;
    private long maxPartSize;

    public boolean isSplitEnabled() {
        return splitEnabled;
    }

    public void setSplitEnabled(boolean splitEnabled) {
        this.splitEnabled = splitEnabled;
    }

    public long getMaxPartSize() {
        return maxPartSize;
    }

    public void setMaxPartSize(long maxPartSize) {
        this.maxPartSize = maxPartSize;
    }
}
