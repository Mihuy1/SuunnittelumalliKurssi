package Visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor {

    private int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSizeMB();
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement element : directory.getContent()) {
            element.accept(this);
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
    
}
