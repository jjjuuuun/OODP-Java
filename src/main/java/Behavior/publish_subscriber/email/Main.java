package Behavior.publish_subscriber.email;

public class Main {
    public static void main(String[] args) {
        EmailServiceBroker emailServiceBroker = new EmailServiceBroker();

        MarketPublisher marketPublisher = new MarketPublisher(emailServiceBroker, "ProductLaunch");

        Subscriber customer1 = new CustomerSubscriber("Customer 1");
        Subscriber customer2 = new CustomerSubscriber("Customer 2");

        emailServiceBroker.subscribe("ProductLaunch", customer1);
        emailServiceBroker.subscribe("ProductLaunch", customer2);

        marketPublisher.launchCampaign("New Product");

        Subscriber customer3 = new CustomerSubscriber("Customer 3");
        emailServiceBroker.subscribe("ProductLaunch", customer3);

        marketPublisher.launchCampaign("Update");

        emailServiceBroker.shutdown();
    }
}
