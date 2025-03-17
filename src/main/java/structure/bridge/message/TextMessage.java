package structure.bridge.message;

class TextMessage extends Message {
    public TextMessage(Sender sender) {
        super(sender);
    }
    @Override
    public void send(String message) {
        this.sender.sendMessage("Text Message: " + message);
    }
}