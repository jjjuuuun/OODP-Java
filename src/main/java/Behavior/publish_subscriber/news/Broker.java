package Behavior.publish_subscriber.news;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Broker {
    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(String topic, Subscriber subscriber) {
        this.subscribers.computeIfAbsent(
                topic, key -> new ArrayList<>()
        ).add(subscriber);
    }

    public void publish(Message message) {
        List<Subscriber> topicSubscribers = this.subscribers.get(message.getTopic());

        if (topicSubscribers != null) {
            for (Subscriber subscriber : topicSubscribers) {
                subscriber.update(message);
            }
        }
    }
}
