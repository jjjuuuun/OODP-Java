package Behavior.strategy.payment;

public class Client {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        this.paymentStrategy.pay(amount);
    }
}
