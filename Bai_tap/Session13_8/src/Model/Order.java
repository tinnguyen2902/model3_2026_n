package Model;

public class Order {
    private int o_id;
    private int c_id;
    private Customer customer;
    private double order_date;
    private double total_amount;

    public Order() {
    }
// dùng khi tạo mới
    public Order(int c_id,double order_date,double total_amount) {
        this.c_id = c_id;
        this.order_date = order_date;
        this.total_amount = total_amount;
    }
 // construction đầy đủ


    public Order(int o_id, int c_id, Customer customer, double order_date, double total_amount) {
        this.o_id = o_id;
        this.c_id = c_id;
        this.customer = customer;
        this.order_date = order_date;
        this.total_amount = total_amount;
    }
    // get & set

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOrder_date() {
        return order_date;
    }

    public void setOrder_date(double order_date) {
        this.order_date = order_date;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
}