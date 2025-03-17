package behavior.visitor.file;

public interface FileSystem {
    void accept(Visitor visitor);
}
