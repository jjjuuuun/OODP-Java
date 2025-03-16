package Behavior.command.editor;

public class InsertTextCommand implements Command{
    private TextEditor editor;
    private String text;
    private int position;

    public InsertTextCommand(TextEditor editor, String text, int position) {
        this.editor = editor;
        this.text = text;
        this.position = position;
    }

    @Override
    public void execute() {
        this.editor.insertText(this.text, this.position);
    }

    @Override
    public void undo() {
        this.editor.deleteText(this.position, this.text.length());
    }
}
