package structure.bridge.message;

class EncryptedMessage extends Message {
    public EncryptedMessage(Sender sender) {
        super(sender);
    }
    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        this.sender.sendMessage(
                "Encrypted Message: " + encryptedMessage);
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}