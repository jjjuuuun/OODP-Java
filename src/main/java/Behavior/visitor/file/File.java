package Behavior.visitor.file;

class File implements FileSystem {
    private String name;
    private long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() { return this.name; }
    public long getSize() { return this.size; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}