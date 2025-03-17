package behavior.mediator.chat;

public interface Mediator {
    void sendMessage(String Message, User user);
    void addUser(User user);
}
