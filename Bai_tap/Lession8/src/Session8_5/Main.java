package Session8_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CategoryManagement manager = new CategoryManagement();
        int choice;
        do {
            System.out.println("********Quản lý danh mục******");
            System.out.println("1.Thêm danh mục");
            System.out.println("2.Hiển thị danh mục");
            System.out.println("3.Cập nhật danh mục");
            System.out.println("4.Xóa danh mục");
            System.out.println("5.Thoát chương trình.");
            System.out.print("Nhập lựa chọn: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("--- Thêm mới danh mục ---");
                    System.out.print("Nhập ID: ");
                    int idAdd = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên danh mục: ");
                    String nameAdd = sc.nextLine();
                    System.out.print("Nhập mô tả: ");
                    String descAdd = sc.nextLine();
                    Category newCat = new Category(idAdd, nameAdd, descAdd);
                    manager.addCategory(newCat);
                    break;
                case 2:
                    Category[] list = manager.findAll();
                    System.out.println("--- Danh sách danh mục hiện có ---");
                    if (list.length == 0) {
                        System.out.println("Chưa có dữ liệu.");
                    } else {
                        for (Category c : list) {
                            System.out.printf("ID: %d | Tên: %s\n", c.getId(), c.getName());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhập ID danh mục cần cập nhật: ");
                    int idUpdate = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhập tên mới: ");
                    String nameUpdate = sc.nextLine();
                    System.out.print("Nhập mô tả mới:");
                    String descUpdate = sc.nextLine();

                    Category updateCat = new Category(idUpdate, nameUpdate,descUpdate);
                    manager.updateCategory(updateCat);
                    break;
                case 4:
                    System.out.print("Nhập ID danh mục cần xóa: ");
                    int idDelete = Integer.parseInt(sc.nextLine());
                    manager.deleteById(idDelete);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Vui lòng nhập số trong phạm vi 1-5.");
            }
        } while (choice != 5);
    }
}