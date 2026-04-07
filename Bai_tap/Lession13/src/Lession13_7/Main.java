package Lession13_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- QUẢN LÝ THƯ VIỆN ---");
            System.out.println("1. Thêm sách");
            System.out.println("2. Cập nhật sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm theo tác giả");
            System.out.println("5. Hiển thị tất cả");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Nhập tiêu đề: "); String t = sc.nextLine();
                    System.out.print("Nhập tác giả: "); String a = sc.nextLine();
                    System.out.print("Năm xuất bản: "); int y = Integer.parseInt(sc.nextLine());
                    System.out.print("Giá: "); double p = Double.parseDouble(sc.nextLine());
                    manager.addBook(new Book(t, a, y, p));
                    break;
                case 4:
                    System.out.print("Nhập tên tác giả cần tìm: ");
                    String searchAuth = sc.nextLine();
                    manager.findBooksByAuthor(searchAuth);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}