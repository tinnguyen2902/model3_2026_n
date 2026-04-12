package BookManager;
// tạo menu, giao diện

import BookService.BookService;

import java.util.Scanner;
// tạo menu, nơi chứa cái gì hiện ra ở console
public class BookManager {
   public void loadMenu (){
       Scanner sc = new Scanner(System.in);
        int choice;
    do {
        System.out.println("******Các chức năng*********");
        System.out.println("1. Hiển thị danh sách:");
        System.out.println("2. Thêm mới sách:");
        System.out.println("3. Cập nhật sách:");
        System.out.println("4. Xóa sách:");
        System.out.println("5. Tìm kiếm theo theo tác giả:");
        System.out.println("6. Thoát:");
        System.out.print("Nhập lựa chọn của bạn: ");
        choice = sc.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Danh sách các sản phẩm: ");
                        BookService bs = new BookService();
                        bs.showBookList();
                        break;
                    case 2:
                        System.out.println("Thêm mới sách");
                        BookService add = new BookService();
                        add.addBook();
                        break;
                    case 3:
                        System.out.println("Cập nhật sách");
                        BookService update = new BookService();
                        update.updateBook();
                        break;
                    case 4:
                        System.out.println("Xóa sách");
                        BookService del = new BookService();
                        del.deleteBook();
                        break;
                    case 5:
                        System.out.println("Tìm kiếm theo tên");
                        BookService search = new BookService();
                        search.searchBook();
                        break;
                    case 6:
                        System.out.println("Kết thúc chương trình");
                        break;
                   default:
                       System.out.println("Lựa chọn không phù hợp");
                }
    } while (true);
   }
}