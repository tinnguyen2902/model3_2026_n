package Lession10_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        Scanner sc = new Scanner(System.in);
        int autoId = 100; // ID tự động tăng

        while (true) {
            System.out.println("\n========= MENU QUẢN LÝ ĐƠN HÀNG =========");
            System.out.println("1. Thêm đơn hàng");
            System.out.println("2. Sửa đơn hàng");
            System.out.println("3. Xóa đơn hàng");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("5. Thoát");

            int choice = Input.getInt(sc, "Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên khách hàng: ");
                    String name = sc.nextLine();
                    double amount = Input.getDouble(sc, "Nhập tổng tiền: ");
                    manager.add(new Order(autoId++, name, amount));
                    break;

                case 2:
                    manager.display();
                    int idUpdate = Input.getInt(sc, "Nhập ID đơn hàng cần sửa: ");
                    int idxUpdate = manager.findIndexById(idUpdate);

                    if (idxUpdate != -1) {
                        System.out.print("Tên khách hàng mới: ");
                        String newName = sc.nextLine();
                        double newAmount = Input.getDouble(sc, "Tổng tiền mới: ");
                        manager.update(idxUpdate, new Order(idUpdate, newName, newAmount));
                    } else {
                        System.out.println("Lỗi: Không tìm thấy mã đơn hàng " + idUpdate);
                    }
                    break;

                case 3:
                    manager.display();
                    int idDel = Input.getInt(sc, "Nhập ID đơn hàng cần xóa: ");
                    int idxDel = manager.findIndexById(idDel);

                    if (idxDel != -1) {
                        manager.delete(idxDel);
                    } else {
                        System.out.println("Không tìm thấy mã đơn hàng " + idDel);
                    }
                    break;

                case 4:
                    manager.display();
                    break;

                case 5:
                    System.out.println("Kết thúc chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}