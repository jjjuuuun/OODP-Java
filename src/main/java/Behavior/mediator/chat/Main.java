package Behavior.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Mediator chatMediator = new ChatMediator();

        User John = new ChatUser(chatMediator, "John");
        User Jane = new ChatUser(chatMediator, "Jane");
        User Bob = new ChatUser(chatMediator, "Bob");
        User Alice = new ChatUser(chatMediator, "Alice");

        chatMediator.addUser(John);
        chatMediator.addUser(Jane);
        chatMediator.addUser(Bob);
        chatMediator.addUser(Alice);

        John.send("Hi");
    }
}
