package ls.Lession1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductBusiness business = new ProductBusiness();

        while (true) {
            System.out.println("\n********************* QUẢN LÝ SẢN PHẨM ********************");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Danh sách sản phẩm");
            System.out.println("3. Cập nhật sản phẩm theo mã");
            System.out.println("4. Xóa sản phẩm theo mã");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần");
            System.out.println("7. Sắp xếp sản phẩm theo số lượng giảm dần");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: business.addProduct(scanner); break;
                    case 2: business.displayAll(); break;
                    case 3: business.updateProduct(scanner); break;
                    case 4: business.deleteProduct(scanner); break;
                    case 5: business.searchByName(scanner); break;
                    case 6: business.sortByPriceAsc(); break;
                    case 7: business.sortByQuantityDesc(); break;
                    case 8: System.exit(0);
                    default: System.out.println("Vui lòng chọn từ 1-8!");
                }
            } catch (Exception e) {
                System.err.println("Lỗi: Vui lòng nhập số!");
            }
        }
    }
}