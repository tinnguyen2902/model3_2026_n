package Lession10_3;

public class User {
    private String name;
    private String email;
    private String tel;

    public User(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Tên: " + name + ", Email: " + email + ", Số điện thoại: " + tel;
    }

    public String getEmail() {
        return email;
    }
}