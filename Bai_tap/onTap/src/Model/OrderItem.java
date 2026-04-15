package Model;

public class OrderItem {
    private int oi_id;
    private int o_id;
    private int p_id;
    private int quantity;

    public OrderItem() {
    }

    public OrderItem(int oi_id, int o_id, int p_id, int quantity) {
        this.oi_id = oi_id;
        this.o_id = o_id;
        this.p_id = p_id;
        this.quantity = quantity;
    }

    public int getOi_id() {
        return oi_id;
    }

    public void setOi_id(int oi_id) {
        this.oi_id = oi_id;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}