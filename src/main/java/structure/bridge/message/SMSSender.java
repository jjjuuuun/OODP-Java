package structure.bridge.message;

class SMSSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS with message | " + message);
    }
}
