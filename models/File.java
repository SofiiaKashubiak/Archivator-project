package models;

import visitor.Visitor;

import java.util.Objects;

public class File {
    private Long id;
    private String fileName;
    private long size;
    private String checksum;

    public File() {
    }

    public File(Long id, String fileName, long size, String checksum) {
        this.id = id;
        this.fileName = fileName;
        this.size = size;
        this.checksum = checksum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public String toString() {
        return "File{" +
                "id=" + id +
                ", fileName='" + fileName + '\'' +
                ", size=" + size +
                ", checksum='" + checksum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return size == file.size &&
                Objects.equals(id, file.id) &&
                Objects.equals(fileName, file.fileName) &&
                Objects.equals(checksum, file.checksum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fileName, size, checksum);
    }

    public void accept(Visitor visitor) {
        visitor.visitFile(this);
    }
}