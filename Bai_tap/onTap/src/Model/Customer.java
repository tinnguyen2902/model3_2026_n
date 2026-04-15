package Model;

public class Customer {
    public static String getC_name;
    private static int c_id;
    private String c_name;

    public Customer() {
    }

    public Customer(String c_name) {
        this.c_name = c_name;
    }

    public Customer(int c_id, String c_name) {
        this.c_id = c_id;
        this.c_name = c_name;
    }

    public static int getC_id() {
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
}