package Session8_10;

public abstract class PaymentMethod {
    protected double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    // Các phương thức trừu tượng buộc lớp con phải thực thi
    public abstract double calculateFee();
    public abstract double processPayment();

    // Phương thức Overloading (Nạp chồng) để xử lý tiền tệ
    public abstract String processPayment(String currency);
}