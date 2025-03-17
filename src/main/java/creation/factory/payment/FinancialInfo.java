package creation.factory.payment;

public record FinancialInfo(
        String creditCardNumber,
        String payPalEmail,
        String bankAccountNumber
) {}
