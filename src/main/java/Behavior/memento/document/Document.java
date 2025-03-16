package Behavior.memento.document;

public class Document {
    private StringBuilder content;

    public Document() {
        this.content = new StringBuilder();
    }

    public void write(String text){
        this.content.append(text);
    }

    public String getContent() {
        return this.content.toString();
    }

    public Memento save() {
        return new Memento(this.content.toString());
    }

    public void restore(Memento memento){
        this.content = new StringBuilder(memento.getContent());
    }
}
