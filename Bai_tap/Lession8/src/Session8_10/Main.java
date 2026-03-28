package Session8_10;

public class Main {
    public static void main(String[] args) {
        double bill = 1000.0;

        // Tạo danh sách các phương thức thanh toán khác nhau
        PaymentMethod credit = new CreditCard(bill);
        PaymentMethod debit = new DebitCard(bill);
        PaymentMethod cash = new Cash(bill);

        System.out.println("=== CHI TIẾT GIAO DỊCH ===");

        displayTransaction(credit, "VND");
        displayTransaction(debit, "VND");
        displayTransaction(cash, "VND");
    }

    // Phương thức sử dụng tính Đa hình để in thông tin
    public static void displayTransaction(PaymentMethod pm, String currency) {
        System.out.println("----------------------------------");
        System.out.println("Số tiền gốc: " + pm.amount);
        System.out.println("Phí giao dịch: " + pm.calculateFee());
        System.out.println("Tổng cộng: " + pm.processPayment());
        System.out.println(pm.processPayment(currency));
    }
}