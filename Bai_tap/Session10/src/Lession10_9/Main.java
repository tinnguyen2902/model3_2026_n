package Lession10_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= MENU DANH BẠ =========");
            System.out.println("1. Thêm liên lạc");
            System.out.println("2. Tìm kiếm theo SĐT");
            System.out.println("3. Xóa liên lạc theo SĐT");
            System.out.println("4. Hiển thị tất cả");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Nhập tên: ");
                    String name = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    String phone = sc.nextLine();
                    manager.addContact(new Contact(name, phone));
                    break;

                case "2":
                    System.out.print("Nhập SĐT cần tìm: ");
                    String searchPhone = sc.nextLine();
                    Contact found = manager.findContact(searchPhone);
                    if (found != null) System.out.println("Tìm thấy: " + found);
                    else System.out.println("Không tồn tại!");
                    break;

                case "3":
                    System.out.print("Nhập SĐT cần xóa: ");
                    String delPhone = sc.nextLine();
                    manager.deleteContact(delPhone);
                    break;

                case "4":
                    manager.displayAll();
                    break;

                case "5":
                    System.out.println("Tạm biệt!");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}