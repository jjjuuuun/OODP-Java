package creation.factory.payment;

public class CreditCardFactory extends PaymentFactory {
    @Override
    Payment createPayment(FinancialInfo info) {
        return new CreditCardPayment(info.creditCardNumber());
    }
}
