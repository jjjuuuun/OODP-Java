package behavior.publish_subscriber.news;

public class NewsPublisher implements Publisher{
    private Broker broker;

    public NewsPublisher(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void publish(Message message) {
        System.out.println(
                "Publishing: " +
                        message.getContent() +
                        " on topic: " + message.getTopic());
        this.broker.publish(message);
    }
}
