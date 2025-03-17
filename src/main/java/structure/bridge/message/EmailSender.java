package structure.bridge.message;

class EmailSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email with message | " + message);
    }
}
