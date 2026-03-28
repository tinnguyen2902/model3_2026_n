package Session8_10;

public class DebitCard extends PaymentMethod {
    public DebitCard(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return amount * 0.01; // 1% phí
    }

    @Override
    public double processPayment() {
        return amount + calculateFee();
    }

    @Override
    public String processPayment(String currency) {
        return "Thanh toán bằng thẻ Debit: " + processPayment() + " " + currency;
    }
}