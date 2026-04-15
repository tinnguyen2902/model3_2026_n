package Model;

public class Order {
   private int o_id;
   private int c_id;
   private double created_at;

    public Order() {
    }

    public Order(int o_id, int c_id, double created_at) {
        this.o_id = o_id;
        this.c_id = c_id;
        this.created_at = created_at;
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

    public double getCreated_at() {
        return created_at;
    }

    public void setCreated_at(double created_at) {
        this.created_at = created_at;
    }
}