package models;

import visitor.Visitor;

import java.util.List;

public class Archive {
    private Long id;
    private String name;
    private List<File> files;
    private List<Folder> folders;
    private ArchiveSettings settings;
    private ArchiveMetadata metadata;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public ArchiveSettings getSettings() {
        return settings;
    }

    public void setSettings(ArchiveSettings settings) {
        this.settings = settings;
    }

    public ArchiveMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ArchiveMetadata metadata) {
        this.metadata = metadata;
    }

    public void accept(Visitor visitor) {
        visitor.visitArchive(this);
    }
}
