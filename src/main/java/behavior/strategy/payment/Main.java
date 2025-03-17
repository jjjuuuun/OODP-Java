package behavior.strategy.payment;

public class Main {
    public static void main(String[] args) {
        Client john = new Client();

        john.setPaymentStrategy(
                new CreditCardPayment(
                        "John",
                        "1234567890123456"
                )
        );
        john.checkout(100);
        //100 paid with credit card

        Client doe = new Client();
        doe.setPaymentStrategy(
                new PayPalPayment(
                        "doe@example.com"
                )
        );
        doe.checkout(200);
        // 200 paid using PayPal
    }
}