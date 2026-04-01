package Lession10_9;

import java.util.Objects;

public class Contact {
    private static int nextId = 1; // Biến static để tự động tăng ID
    private int id;
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.id = nextId++; // Mỗi khi tạo mới, ID sẽ tăng lên 1
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Quan trọng: Set dựa vào 2 hàm này để kiểm tra trùng lặp
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }

    @Override
    public String toString() {
        return String.format("ID: %-3d | Tên: %-15s | SĐT: %s", id, name, phoneNumber);
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
}