package Behavior.command.editor;

// Client code
public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        TextEditorInvoker invoker = new TextEditorInvoker();

        Command insertHelloCommand = new InsertTextCommand(editor, "Hello, ", 0);
        invoker.executeCommand(insertHelloCommand);
        System.out.println("Execute(insertHelloCommand): " + editor.getContent());

        Command insertWorldCommand = new InsertTextCommand(editor, "World!", 7);
        invoker.executeCommand(insertWorldCommand);
        System.out.println("Execute(insertWorldCommand): " + editor.getContent());

        invoker.undo();
        System.out.println("Undo(insertWorldCommand): " + editor.getContent());

        invoker.redo();
        System.out.println("Redo(insertWorldCommand): " + editor.getContent());

        Command deleteHelloCommand = new DeleteTextCommand(editor, 0, 7);
        invoker.executeCommand(deleteHelloCommand);
        System.out.println("Execute(deleteHelloCommand): " + editor.getContent());

        invoker.undo();
        System.out.println("Undo(deleteHelloCommand): " + editor.getContent());

        invoker.redo();
        System.out.println("Redo(deleteHelloCommand): " + editor.getContent());
    }
}