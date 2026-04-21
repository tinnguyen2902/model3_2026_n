package Menu;
// thứ tự lấy class để đưa vào menu:DAO=> Service => menu
import Service.ProductService;

import java.util.Scanner;

public class Menu {
    ProductService ps = new ProductService();
    public void loadMenu(){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("******PRODUCT MANAGER*********");
            System.out.println("1. Danh mục sản phẩm:");
            System.out.println("2. Thêm mới sản phẩm:");
            System.out.println("3. Cập nhật sản phẩm:");
            System.out.println("4. Xóa sản phẩm:");
            System.out.println("5. Tìm  kiếm sản phẩm theo tên:");
            System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần:");
            System.out.println("7. Thống kê số lượng sản phẩm theo danh mục:");
            System.out.println("8. Thoát:");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1.Danh mục sản phẩm: ");
                    ps.showAllPro();
                    break;
                case 2:
                    System.out.println("2. Thêm mới sản phẩm:");
                    ps.addPro();
                    break;
                case 3:
                    System.out.println("3. Cập nhật sản phẩm:");
                    ps.updatePro();
                    break;
                case 4:
                    System.out.println("4. Xóa sản phẩm:");
                    ps.deletePro();
                    break;
                case 5:
                    System.out.println("5. Tìm  kiếm sản phẩm theo tên:");
                    ps.searchPro();
                    break;
                case 6:
                    System.out.println("6. Sắp xếp sản phẩm theo giá tăng dần:");
                    ps.showProByPrice();
                    break;
                case 7:
                    System.out.println("7.Thống kê số lượng sản phẩm theo danh mục:");
                    ps.showStatistics();
                    break;
                case 8:
                    System.out.println("Kết thúc chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (true);
    }
}