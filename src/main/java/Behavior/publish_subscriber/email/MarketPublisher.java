package Behavior.publish_subscriber.email;

public class MarketPublisher implements Publisher{
    private EmailServiceBroker emailServiceBroker;
    private String eventType;

    public MarketPublisher(EmailServiceBroker emailServiceBroker, String eventType) {
        this.emailServiceBroker = emailServiceBroker;
        this.eventType = eventType;
    }

    @Override
    public void launchCampaign(String message) {
        System.out.println("Launching campaign: " +
                message);
        this.emailServiceBroker.sendEmails(this.eventType, message);
    }
}
