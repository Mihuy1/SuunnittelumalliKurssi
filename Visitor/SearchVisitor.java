package Visitor;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {

    private String searchPattern;
    private List<FileSystemElement> foundElements;

    public SearchVisitor(String searchPattern) {
        this.searchPattern = searchPattern;
        this.foundElements = new ArrayList<>();
    }

    @Override
    public void visit(File file) {
        if (file.getName().contains(searchPattern)) {
            foundElements.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        if (directory.getName().contains(searchPattern)) {
            foundElements.add(directory);
        }

        for (FileSystemElement element : directory.getContent()) {
            element.accept(this);
        }
    }

    public List<FileSystemElement> getFoundElements() {
        return foundElements;
    }
    
}
