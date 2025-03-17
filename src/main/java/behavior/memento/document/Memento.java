package behavior.memento.document;

public class Memento {
    private final String content;

    public Memento(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}
