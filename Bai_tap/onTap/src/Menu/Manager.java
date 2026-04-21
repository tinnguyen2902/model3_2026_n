package Menu;
// manager = menu
import Service.OrderService;

import java.util.Scanner;

public class Manager {
    OrderService os = new OrderService();
    public void loadMenu (){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("******PRODUCT MANAGERMENT*********");
            System.out.println("1.Thêm khách hàng:");
            System.out.println("2. Thêm mới sản phẩm:");
            System.out.println("3. Cập nhật sản phẩm:");
            System.out.println("4. Xóa sản phẩm:");
            System.out.println("5. Tìm kiếm theo tên sản phẩm:");
            System.out.println("6. Xóa đơn hàng:");
            System.out.println("7. Thoát:");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1.Thêm khách hàng: ");
                   // Manager manager = new Manager();
                    os.addCustomer();
                    break;
                case 2:
                    System.out.println("2. Thêm sản phẩm:");
                    os.addProduct();
                    break;
                case 3:
                    System.out.println("3. Tạo đơn hàng:");
                    os.addOr();
                    break;
                case 4:
                    System.out.println("4. Xem danh sách đơn hàng:");
                    os.showAllOrders();
                    break;
                case 5:
                    System.out.println("5. Tính tổng tiền đơn hàng:");
                    os.callOrderTotal();
                    break;
                case 6:
                    System.out.println("6. Xóa đơn hàng:");
                    os.delOr();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (true);
    }



}
// nếu có nhiều menu thêm nhiều file menu nữa