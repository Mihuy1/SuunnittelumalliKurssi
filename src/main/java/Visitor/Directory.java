package Visitor;

import java.util.ArrayList;

public class Directory implements FileSystemElement {
    private String name;
    private ArrayList<FileSystemElement> content;

    public Directory(String name) {
        this.name = name;
        this.content = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<FileSystemElement> getContent() {
        return content;
    }

    public void add(FileSystemElement element) {
        content.add(element);
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}