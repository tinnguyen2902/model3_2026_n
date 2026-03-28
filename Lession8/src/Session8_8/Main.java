package Session8_8;

public class Main {
    public static void main(String[] args) {
        // Tạo các loại sản phẩm
        Product p1 = new Electronics("Laptop Gaming", 1000); // Chiết khấu 10%
        Product p2 = new Clothing("Áo khoác Jean", 500);     // Chiết khấu 20%
        Product p3 = new Food("Thùng sữa tươi", 200);        // Chiết khấu 5%

        System.out.println("=== KIỂM TRA GIÁ LẺ (Mặc định từng loại) ===");
        printInfo(p1);
        printInfo(p2);
        printInfo(p3);

        System.out.println("\n=== KIỂM TRA MUA SỐ LƯỢNG LỚN (150 sản phẩm - Chiết khấu 5%) ===");
        int bulkQty = 150;
        System.out.printf("%s: Tổng giá sau chiết khấu: %.2f\n", p1.getName(), p1.getFinalPrice(bulkQty));
        System.out.printf("%s: Tổng giá sau chiết khấu: %.2f\n", p2.getName(), p2.getFinalPrice(bulkQty));
        System.out.printf("%s: Tổng giá sau chiết khấu: %.2f\n", p3.getName(), p3.getFinalPrice(bulkQty));
    }

    public static void printInfo(Product p) {
        System.out.printf("Sản phẩm: %s | Giá gốc: %.2f | Chiết khấu: %.0f%% | Giá cuối: %.2f\n",
                p.getName(), p.getPrice(), p.getDiscount(), p.getFinalPrice());
    }
}