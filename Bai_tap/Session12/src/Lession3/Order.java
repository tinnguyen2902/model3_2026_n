package Lession3;

import java.util.Scanner;

public class Order {
    private static int nextId = 1;
    private int orderId;
    private String customerName;
    private String phoneNumber;
    private String address;
    private float orderAmount;
    private String status; // Pending, Shipped, Delivered

    public Order() {
        this.orderId = nextId++;
        this.status = "Pending"; // Mặc định khi tạo mới
    }

    public Order(String customerName, String phoneNumber, String address, float orderAmount) {
        this();
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.orderAmount = orderAmount;
    }

    // Getters and Setters
    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public float getOrderAmount() { return orderAmount; }

    public void inputData(Scanner scanner) {
        this.customerName = validateCustomerName(scanner);
        this.phoneNumber = validatePhone(scanner);
        this.address = validateAddress(scanner);
        this.orderAmount = validateAmount(scanner);
    }

    private String validateCustomerName(Scanner scanner) {
        while (true) {
            System.out.print("Nhập tên khách hàng (6-100 ký tự): ");
            String name = scanner.nextLine();
            if (name.length() >= 6 && name.length() <= 100) return name;
            System.err.println("Lỗi: Tên khách hàng không hợp lệ!");
        }
    }

    private String validatePhone(Scanner scanner) {
        String regex = "^(0|84)(3|5|7|8|9)([0-9]{8})$";
        while (true) {
            System.out.print("Nhập số điện thoại: ");
            String phone = scanner.nextLine();
            if (phone.matches(regex)) return phone;
            System.err.println("Lỗi: Số điện thoại không đúng định dạng!");
        }
    }

    private String validateAddress(Scanner scanner) {
        while (true) {
            System.out.print("Nhập địa chỉ giao hàng: ");
            String addr = scanner.nextLine();
            if (!addr.isBlank()) return addr;
            System.err.println("Lỗi: Địa chỉ không được để trống!");
        }
    }

    private float validateAmount(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Nhập giá trị đơn hàng (>0): ");
                float amt = Float.parseFloat(scanner.nextLine());
                if (amt > 0) return amt;
                System.err.println("Lỗi: Giá trị phải lớn hơn 0!");
            } catch (Exception e) { System.err.println("Lỗi: Vui lòng nhập số thực!"); }
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %-3d | Khách: %-15s | SĐT: %-11s | Giá trị: %-10.2f | Trạng thái: %-10s",
                orderId, customerName, phoneNumber, orderAmount, status);
    }
}