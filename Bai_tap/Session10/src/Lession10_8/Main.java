package Lession10_8;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= MENU QUẢN LÝ THƯ VIỆN =========");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Hiển thị toàn bộ kho sách");
            System.out.println("3. Lọc sách theo năm & Sắp xếp");
            System.out.println("4. Thoát");

            int choice = Input.getInt(sc, "Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    System.out.println("\n--- NHẬP THÔNG TIN SÁCH ---");
                    String id = Input.getString(sc, "Nhập mã số sách (ID): ");
                    String title = Input.getString(sc, "Nhập tên sách: ");
                    String author = Input.getString(sc, "Nhập tác giả: ");
                    int year = Input.getInt(sc, "Nhập năm xuất bản: ");

                    // Thêm vào Set (Set sẽ tự kiểm tra trùng ID qua equals/hashCode)
                    library.addBook(new Book(id, title, author, year));
                    break;

                case 2:
                    library.displayAll();
                    break;

                case 3:
                    int filterYear = Input.getInt(sc, "Lọc sách xuất bản sau năm ? ");
                    List<Book> result = library.filterAndSort(filterYear);

                    System.out.println("\n--- KẾT QUẢ LỌC VÀ SẮP XẾP ---");
                    if (result.isEmpty()) {
                        System.out.println("Không có sách nào xuất bản sau năm " + filterYear);
                    } else {
                        for (Book b : result) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}