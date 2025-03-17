package Behavior.visitor.file;

import java.util.List;
import java.util.ArrayList;

class Directory implements FileSystem {
    private String name;
    private List<FileSystem> elements;

    public Directory(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public String getName() { return this.name; }

    public void addElement(FileSystem element) {
        this.elements.add(element);
    }
    public List<FileSystem> getElements() {
        return this.elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}