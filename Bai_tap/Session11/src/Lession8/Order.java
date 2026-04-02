package Lession8;

import java.time.LocalDate;
import java.util.Optional;

public class Order {
    private int id;
    private String customerName;
    private LocalDate createdDate;
    private Optional<LocalDate> deliveryDate;

    public Order() {
        this.deliveryDate = Optional.empty();
    }

    public Order(int id, String customerName, LocalDate createdDate, LocalDate deliveryDate) {
        this.id = id;
        this.customerName = customerName;
        this.createdDate = createdDate;
        // Chuyển đổi giá trị null thành Optional.empty()
        this.deliveryDate = Optional.ofNullable(deliveryDate);
    }

    // Getters và Setters
    public int getId() { return id; }
    public String getCustomerName() { return customerName; }
    public LocalDate getCreatedDate() { return createdDate; }
    public Optional<LocalDate> getDeliveryDate() { return deliveryDate; }

    public String toDisplayString() {
        // Dùng map để biến đổi ngày thành String
        String deliveryStr = deliveryDate
                .map(LocalDate::toString)
                .orElse("Chưa giao");

        return String.format("ID: %-3d | Tên KH: %-10s | Ngày đặt: %s | Ngày giao: %s",
                id, customerName, createdDate, deliveryStr);
    }
}