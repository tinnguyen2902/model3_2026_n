package Menu;

import Service.OrderService;

import java.util.Scanner;

public class Manager {
    OrderService os = new OrderService();
    public void loadMenu (){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("******Các chức năng*********");
            System.out.println("1. Thêm khách hàng:");
            System.out.println("2. Thêm sản phẩm:");
            System.out.println("3. Tạo đơn hàng:");
            System.out.println("4. Xem danh sách đơn hàng:");
            System.out.println("5. Tính tổng tiền đơn hàng:");
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

                    break;
                case 4:
                    System.out.println("4. Xem danh sách đơn hàng:");

                    break;
                case 5:
                    System.out.println("5. Tính tổng tiền đơn hàng:");

                    break;
                case 6:
                    System.out.println("6. Xóa đơn hàng:");

                    break;
                case 7:
                    System.out.println("Thoát chương trình.");

                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");
            }
        } while (true);
    }



}
// nếu có nhiều menu thêm nhiều file menu nữa