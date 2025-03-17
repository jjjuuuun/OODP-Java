package Behavior.publish_subscriber.email;

public class CustomerSubscriber implements Subscriber{
    private  String name;

    public CustomerSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void receiveEmail(String message) {
        System.out.println(this.name +
                " is receiving email async: " + message);

        // 단순히 출력 과정을 천천히 보기 위함
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println(this.name +
                " finished reading email: " +
                message);
    }
}
