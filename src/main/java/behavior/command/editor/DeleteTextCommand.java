package behavior.command.editor;

public class DeleteTextCommand implements Command{
    private TextEditor editor;
    private int position;
    private String deletedText;

    public DeleteTextCommand(TextEditor editor, int position, int length) {
        this.editor = editor;
        this.position = position;
        this.deletedText = editor.getTextSubString(
                position, position + length
        );
    }

    @Override
    public void execute() {
        this.editor.deleteText(this.position, this.deletedText.length());
    }

    @Override
    public void undo() {
        this.editor.insertText(this.deletedText, this.position);
    }
}
