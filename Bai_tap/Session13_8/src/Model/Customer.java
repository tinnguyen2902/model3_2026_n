package Model;

public class Customer {
    private int c_id;
    private String c_name;
    private String email;

    public Customer() {
    }

    public Customer(int c_id, String c_name, String email) {
        this.c_id = c_id;
        this.c_name = c_name;
        this.email = email;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}