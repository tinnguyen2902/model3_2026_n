package ls.Lession1;

import java.util.List;
import java.util.Scanner;

public class Product {
    private static int nextId = 1;
    private int productId;
    private String productName;
    private float price;
    private String category;
    private int quantity;

    public Product() {
        this.productId = nextId++;
    }

    public Product(String productName, float price, String category, int quantity) {
        this();
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getProductId() { return productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public void inputData(Scanner scanner, List<Product> list) {
        this.productName = validateProductName(scanner, list);
        this.price = validatePrice(scanner);
        this.category = validateCategory(scanner);
        this.quantity = validateQuantity(scanner);
    }

    // Các hàm Validate nội bộ
    private String validateProductName(Scanner scanner, List<Product> list) {
        while (true) {
            System.out.print("Nhập tên sản phẩm (10-50 ký tự): ");
            String name = scanner.nextLine();
            if (name.length() < 10 || name.length() > 50) {
                System.err.println("Lỗi: Tên phải từ 10-50 ký tự!");
            } else if (list.stream().anyMatch(p -> p.getProductName().equalsIgnoreCase(name))) {
                System.err.println("Lỗi: Tên sản phẩm đã tồn tại!");
            } else return name;
        }
    }

    private float validatePrice(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Nhập giá sản phẩm (>0): ");
                float p = Float.parseFloat(scanner.nextLine());
                if (p > 0) return p;
                System.err.println("Lỗi: Giá phải lớn hơn 0!");
            } catch (Exception e) { System.err.println("Lỗi: Vui lòng nhập số thực!"); }
        }
    }

    private String validateCategory(Scanner scanner) {
        while (true) {
            System.out.print("Nhập loại sản phẩm: ");
            String cat = scanner.nextLine();
            if (!cat.isBlank() && cat.length() <= 200) return cat;
            System.err.println("Lỗi: Loại SP không được để trống và tối đa 200 ký tự!");
        }
    }

    private int validateQuantity(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Nhập số lượng tồn kho (>=0): ");
                int q = Integer.parseInt(scanner.nextLine());
                if (q >= 0) return q;
                System.err.println("Lỗi: Số lượng không được âm!");
            } catch (Exception e) { System.err.println("Lỗi: Vui lòng nhập số nguyên!"); }
        }
    }

    @Override
    public String toString() {
        return String.format("ID: %-3d | Tên: %-20s | Giá: %-8.2f | Loại: %-10s | Kho: %d",
                productId, productName, price, category, quantity);
    }
}