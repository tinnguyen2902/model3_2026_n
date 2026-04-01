package Lession10_6;

public class Order {
    private int id;
    private String customerName;
    private double totalAmount;

    public Order(int id, String customerName, double totalAmount) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Khách hàng: %-15s | Tổng tiền: %,.2f VNĐ",
                id, customerName, totalAmount);
    }

    // Getters
    public int getId() { return id; }
    public String getCustomerName() { return customerName; }
    public double getTotalAmount() { return totalAmount; }
}