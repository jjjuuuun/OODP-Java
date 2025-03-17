package creation.factory.payment;

public class BankTransferFactory extends PaymentFactory{
    @Override
    Payment createPayment(FinancialInfo info) {
        return new BankTransferPayment(info.bankAccountNumber());
    }
}
