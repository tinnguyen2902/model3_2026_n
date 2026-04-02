package Lession3;

public class User {
   private String userName;
   private String email;

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "User{username='" + userName + "', email='" + email + "'}";
    }
}