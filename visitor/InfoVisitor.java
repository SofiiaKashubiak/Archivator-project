package visitor;

import models.Archive;
import models.File;
import models.Folder;

public class InfoVisitor implements Visitor {
    @Override
    public void visitArchive(Archive archive) {
        System.out.println("Archive: " + archive.getName());
    }

    @Override
    public void visitFile(File file) {
        System.out.println("File: " + file.getFileName() + ", Size: " + file.getSize());
    }

    @Override
    public void visitFolder(Folder folder) {
        System.out.println("Folder: " + folder.getFolderName() + ", Files: " + folder.getFiles().size());
    }
}