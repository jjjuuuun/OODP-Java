package structure.adapter.message;

class Adapter implements ModernMessageSender {
    private OldMessageSender oldSystem;

    public Adapter(OldMessageSender oldSystem) {
        this.oldSystem = oldSystem;
    }

    @Override
    public void sendMessage(String message, String recipient) {
        String[] messageData = {message, recipient};
        int result = oldSystem.send(messageData);
        if (result != 1) {
            System.out.println("Failed to send message");
        }
    }
}