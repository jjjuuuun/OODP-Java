package structure.bridge.message;

abstract class Message {
    protected Sender sender;

    protected Message(Sender sender) {
        this.sender = sender;
    }

    public abstract void send(String message);
}