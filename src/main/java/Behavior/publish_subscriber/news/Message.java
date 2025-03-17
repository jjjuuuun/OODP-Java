package Behavior.publish_subscriber.news;

public class Message {
    private String content;
    private String topic;

    public Message(String content, String topic) {
        this.content = content;
        this.topic = topic;
    }

    public String getContent() {
        return this.content;
    }

    public String getTopic() {
        return this.topic;
    }
}
