package creation.factory.payment;

public class PayPalFactory extends PaymentFactory{
    @Override
    Payment createPayment(FinancialInfo info) {
        return new PayPalPayment(info.payPalEmail());
    }
}
