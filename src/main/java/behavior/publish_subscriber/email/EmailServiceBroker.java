package behavior.publish_subscriber.email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EmailServiceBroker {
    private Map<String, List<Subscriber>> eventTypeGroup = new HashMap<>();
    private ExecutorService executorService = Executors.newCachedThreadPool();

    public void subscribe(String eventType, Subscriber customer) {
        this.eventTypeGroup.computeIfAbsent(
                eventType, k -> new ArrayList<>()
        ).add(customer);
    }

    public void sendEmails(String eventType, String message){
        List<Subscriber> customerList = eventTypeGroup.get(eventType);
        if (customerList != null){
            for (Subscriber customer : customerList){
                this.executorService.submit(
                        () -> customer.receiveEmail((message))
                );
            }
        }
    }
    public void shutdown(){
        this.executorService.shutdown();
    }
}

