package Behavior.mediator.chat;

public abstract class User {
    protected Mediator chatMediator;
    protected String name;

    public User(Mediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}
