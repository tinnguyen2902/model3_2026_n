package Session8_10;

public class CreditCard extends PaymentMethod {
    public CreditCard(double amount) {
        super(amount);
    }
    @Override
    public double calculateFee() {
        return amount * 0.02; // 2% phí
    }
    @Override
    public double processPayment() {
        return amount + calculateFee();
    }
    @Override
    public String processPayment(String currency) {
        return "Thanh toán bằng thẻ Credit: " + processPayment() + " " + currency;
    }
}