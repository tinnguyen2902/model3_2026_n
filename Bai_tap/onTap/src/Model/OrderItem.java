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

}