package Lession9;

import java.util.Optional;

public class User {
    private int id;
    private String name;
    private Optional<String> email;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = Optional.ofNullable(email); // Chuyển null thành Optional.empty()
    }

    public String getName() { return name; }
    public Optional<String> getEmail() { return email; }

    @Override
    public String toString() {
        // Trả về "N/A" nếu không có email
        return String.format("User: %-10s | Email: %s",
                name, email.orElse("Chưa cập nhật"));
    }
}