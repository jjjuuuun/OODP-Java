package Behavior.publish_subscriber.news;

class NewsSubscriber implements Subscriber {
    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(
                this.name +
                        " received: " + message.getContent() +
                        " on topic: " + message.getTopic());
    }
}