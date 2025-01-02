package visitor;

import models.Archive;
import models.File;
import models.Folder;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private final List<Object> elements = new ArrayList<>();

    public void addElement(Object element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        for (Object element : elements) {
            if (element instanceof Archive) {
                ((Archive) element).accept(visitor);
            } else if (element instanceof File) {
                ((File) element).accept(visitor);
            } else if (element instanceof Folder) {
                ((Folder) element).accept(visitor);
            }
        }
    }
}