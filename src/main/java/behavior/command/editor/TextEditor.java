package behavior.command.editor;

public class TextEditor {
    private StringBuilder content = new StringBuilder();
    
    public void insertText(String text, int position) {
        content.insert(position, text);
    }

    public void deleteText(int position, int length){
        content.delete(position, position + length);
    }

    public String getTextSubString(int start, int end){
        return content.substring(start, end);
    }

    public String getContent() {
        return content.toString();
    }
}
