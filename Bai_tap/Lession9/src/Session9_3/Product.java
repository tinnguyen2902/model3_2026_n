package Session9_3;

import java.util.Scanner;
import Session9_3.IShop; // Giả sử bạn dùng Interface IShop như bài trước

public class Product {
    // 1. KHAI BÁO THUỘC TÍNH (Bắt buộc phải có để return)
    private String productId;
    private String productName;
    private float price;
    private String description;
    private int catalogId;
    private int productStatus;

    // Constructor không tham số
    public Product() {
    }

    // 2. SỬA LỖI MISSING RETURN: Trả về giá trị của thuộc tính tương ứng
    public int getCatalogId() {
        return catalogId; // Thêm return
    }

    public float getPrice() {
        return price; // Thêm return
    }

    public String getProductId() { // Đổi Object thành String cho chính xác
        return productId; // Thêm return
    }

    public String getProductName() {
        return productName; // Thêm return
    }

    // 3. CÁC PHƯƠNG THỨC XỬ LÝ (Không cần return vì kiểu là void)
    public void inputData(Scanner scanner, Product[] arrProduct, int indexProduct, Categories[] arrCategories, int indexCatalog) {
        System.out.println("--- Nhập thông tin sản phẩm ---");

        // Logic nhập mã sản phẩm (Ví dụ đơn giản)
        System.out.print("Nhập mã sản phẩm: ");
        this.productId = scanner.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        this.productName = scanner.nextLine();

        System.out.print("Nhập giá: ");
        this.price = Float.parseFloat(scanner.nextLine());

        // Hiển thị danh mục để chọn
        System.out.println("Chọn danh mục:");
        for (int i = 0; i < indexCatalog; i++) {
            System.out.printf("%d. %s\n", arrCategories[i].getCatalogId(), arrCategories[i].getCatalogName());
        }
        System.out.print("Nhập ID danh mục: ");
        this.catalogId = Integer.parseInt(scanner.nextLine());
    }

    public void displayData() {
        System.out.printf("Mã: %s | Tên: %s | Giá: %.2f | Danh mục ID: %d\n",
                productId, productName, price, catalogId);
    }

    // Hàm main thường để ở lớp ShopManagement, không nên để ở đây nếu đây là lớp thực thể
    public static void main(String[] args) {
        // Có thể để trống hoặc xóa đi
    }
}