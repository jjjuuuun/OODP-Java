package creation.factory.payment;

abstract class PaymentFactory {
    abstract Payment createPayment(FinancialInfo info);
}
