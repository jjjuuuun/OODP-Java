package Behavior.visitor.file;

class SizeVisitor implements Visitor {
    private long totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystem element : directory.getElements()) {
            element.accept(this);
        }
    }

    public long getTotalSize() {
        return this.totalSize;
    }
}