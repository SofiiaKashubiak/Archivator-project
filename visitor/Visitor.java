package visitor;

import models.Archive;
import models.File;
import models.Folder;

public interface Visitor {
    void visitArchive(Archive archive);
    void visitFile(File file);
    void visitFolder(Folder folder);
}
