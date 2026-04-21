package Model;

import java.sql.Timestamp;

public class Order {
   private int o_id;
   private int c_id;
   private String customerName;
   private Timestamp created_at;

    public Order() {
    }

    public Order(int o_id, int c_id, Timestamp created_at) {
        this.o_id = o_id;
        this.c_id = c_id;
        this.created_at = created_at;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

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

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return String.format("ID: %-5d | Khách hàng: %-15s | Ngày tạo: %s",
                o_id,customerName,created_at);
    }
}