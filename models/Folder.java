package models;

import visitor.Visitor;

import java.util.List;

public class Folder {
    private Long id;
    private String folderName;
    private List<File> files;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void accept(Visitor visitor) {
        visitor.visitFolder(this);
    }
}
