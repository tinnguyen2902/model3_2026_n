package Lession3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OrderBusiness bus = new OrderBusiness();

        while (true) {
            System.out.println("\n********************* QUẢN LÝ ĐƠN HÀNG ********************");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Hiển thị (Giảm dần theo giá trị)");
            System.out.println("3. Cập nhật trạng thái");
            System.out.println("4. Xóa đơn hàng (Chỉ Pending)");
            System.out.println("5. Tìm kiếm theo tên khách");
            System.out.println("6. Thống kê tổng số đơn");
            System.out.println("7. Doanh thu Delivered");
            System.out.println("8. Thống kê theo trạng thái");
            System.out.println("9. Đơn hàng giá trị cao nhất");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: bus.addOrder(scanner); break;
                    case 2: bus.displaySortedByAmount(); break;
                    case 3: bus.updateStatus(scanner); break;
                    case 4: bus.deleteOrder(scanner); break;
                    case 5: bus.searchByName(scanner); break;
                    case 6: bus.reportTotal(); break;
                    case 7: bus.reportRevenue(); break;
                    case 8: bus.reportByStatus(); break;
                    case 9: bus.findMaxAmount(); break;
                    case 0: System.exit(0);
                    default: System.out.println("Chọn sai!");
                }
            } catch (Exception e) {
                System.err.println("Vui lòng nhập số hợp lệ!");
            }
        }
    }
}