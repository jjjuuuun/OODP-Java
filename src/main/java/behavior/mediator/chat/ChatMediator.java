package behavior.mediator.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator{
    private List<User> users;

    public ChatMediator() {
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sendUser) {
        for (User receiveUser : this.users){
            if (receiveUser != sendUser){
                receiveUser.receive(message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
