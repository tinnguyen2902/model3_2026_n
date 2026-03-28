package Session8_10;

public class Cash extends PaymentMethod {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public double calculateFee() {
        return 0; // Tiền mặt không tính phí
    }

    @Override
    public double processPayment() {
        return amount;
    }

    @Override
    public String processPayment(String currency) {
        return "Thanh toán bằng tiền mặt: " + processPayment() + " " + currency;
    }
}