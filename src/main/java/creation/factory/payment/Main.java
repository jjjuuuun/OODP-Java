package creation.factory.payment;

public class Main {
    public static void main(String[] args) {
        FinancialInfo userInfo = new FinancialInfo(
                "1234-5678-9012-3456", "user@example.com", "987654321"
        );

        PaymentFactory factory = new CreditCardFactory();
        Payment payment = factory.createPayment(userInfo);
        payment.processPayment(100.0);

        factory = new PayPalFactory();
        payment = factory.createPayment(userInfo);
        payment.processPayment(200.0);

        factory = new BankTransferFactory();
        payment = factory.createPayment(userInfo);
        payment.processPayment(300.0);
    }
}