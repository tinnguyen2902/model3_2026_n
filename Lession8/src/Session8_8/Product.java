package Session8_8;

public class Product {
    //thuộc tính
    private String name;
    private double price;
    //construction
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // ĐA HÌNH ĐỘNG (Sẽ được các lớp con Overriding)
    public double getDiscount() {
        return 0; // Mặc định sản phẩm chung không chiết khấu
    }

    // ĐA HÌNH TĨNH (Overloading phương thức getDiscount)
    // Tính chiết khấu dựa trên số lượng
    public double getDiscount(int quantity) {
        if (quantity > 100) {
            return 5; // Chiết khấu cố định 5% cho đơn hàng lớn
        }
        return getDiscount(); // Gọi lại chiết khấu mặc định của từng loại
    }

    // Tính giá cuối cùng
    public double getFinalPrice() {
        return price - (price * getDiscount() / 100);
    }

    // --- Overloading tính giá cuối cùng dựa trên số lượng ---
    public double getFinalPrice(int quantity) {
        double discount = getDiscount(quantity);
        double totalPrice = price * quantity;
        return totalPrice - (totalPrice * discount / 100);
    }

    // Getters
    public String getName() { return name; }
    public double getPrice() { return price; }
}