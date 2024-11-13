package Visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        // Create files
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.txt", 20);
        File file3 = new File("document.txt", 30);

        // Create directories
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("documents");

        // Add files to directories
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);
        dir2.add(dir1); // Nested directory

        // Add directories to root directory
        Directory rootDirectory = new Directory("root");
        rootDirectory.add(dir2);

        // Create visitors
        SizeCalculatorVisitor sizeCalculatorVisitor = new SizeCalculatorVisitor();
        SearchVisitor searchVisitor = new SearchVisitor("doc");

        // Visit the root directory
        for (FileSystemElement element : rootDirectory.getContent()) {
            element.accept(sizeCalculatorVisitor);
            element.accept(searchVisitor);
        }

        // Get results
        int totalSize = sizeCalculatorVisitor.getTotalSize();
        List<FileSystemElement> foundElements = searchVisitor.getFoundElements();

        // Print results
        System.out.println("Total size: " + totalSize + " MB");
        System.out.println("Found: ");
        for (FileSystemElement element : foundElements) {
            System.out.println(element.getName());
        }
    }
}