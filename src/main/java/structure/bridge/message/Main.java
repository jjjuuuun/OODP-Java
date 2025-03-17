package structure.bridge.message;

public class Main {
    public static void main(String[] args) {
        Sender emailSender = new EmailSender();
        Sender smsSender = new SMSSender();

        Message textMessageEmail = new TextMessage(emailSender);
        textMessageEmail.send("Hello World!");

        Message textMessageSMS = new TextMessage(smsSender);
        textMessageSMS.send("Hello World!");

        Message encryptedMessageEmail = new EncryptedMessage(emailSender);
        encryptedMessageEmail.send("Hello World!");

        Message encryptedMessageSMS = new EncryptedMessage(smsSender);
        encryptedMessageSMS.send("Hello World!");
    }
}
