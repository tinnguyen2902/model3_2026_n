package BookService;

import dao.BookDAO;
import model.Book;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// tạo từng dịch vụ, chức năng nhỏ như thêm sửa xóa
public class BookService {
    Scanner sc = new Scanner(System.in);
    // liên kết trực tiếp với DAO
   BookDAO bookDAO = new BookDAO();
   // Chức năng 1: in ra danh sách
    public void showBookList(){
        // gọi DAO vào
        try {
            System.out.println(BookDAO.getBookList());
        }catch (Exception e){
            System.out.println("Không thể đọc dữ liệu từ CSDL");
        }
    }
    // chức năng 2: thêm mới
    public void addBook(){
        System.out.print("Nhập tên sách cần thêm: ");
        String addBookName = sc.nextLine();
        // lấy danh sách hiện có trong CSDL
        List<Book> DStrongKHo = BookDAO.getBookList();
        // xem có tồn tại hay chưa
        boolean tonTai = false; // check đã tồn tại hay không=> giả sử ban đầu chưa tồn tại
        // dùng vòng lặp để check
        for (int i = 0;i< DStrongKHo.size();i++){
            // lấy sách ở vị trí i
            Book b = DStrongKHo.get(i);
            if (b.getTitle().equalsIgnoreCase(addBookName)){
                tonTai = true;
                break;
            }
        }
        // xử lý kq so sánh
        if (tonTai){
            System.out.println("Sách đã tồn tại.Thêm thất bại...");
        } else {
            System.out.print("Nhập tên tác giả: ");
            String authorNew = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            double namXBNew = Double.parseDouble(sc.nextLine());
            System.out.print("Nhập giá: ");
            double priceNew = Double.parseDouble(sc.nextLine());
            // tạo đối tượng Book mới
            Book newBook = new Book(0,addBookName,authorNew,namXBNew,priceNew);
            // gọi DAO để lưu
            BookDAO.insertBook(newBook);
            System.out.println("Thêm thành công vào mySQL...");
        }
    }
    // chức năng 3: cập nhật
    public void updateBook (){
        System.out.print("Nhập ID sách cần cập nhật: ");
        int updateID = Integer.parseInt(sc.nextLine());
        // lấy thông tin hiện có => nếu có giữa lại gán vào biến kq
        List<Book> books = BookDAO.getBookList();
        Book ketQua = null;  // giữ lại sách đã tìm ra
        for (int i = 0; i < books.size(); i++){
            Book b = books.get(i);
            if (b.getBookId() == updateID){
                ketQua = b;
                break;
            }
        } if (ketQua == null){
            System.out.println("ID không tồn tại");
        } else {
            System.out.print("Nhập tiêu đề mới: ");
            String newTitle = sc.nextLine();
            System.out.print("Nhập tác giả: ");
            String newAuthor = sc.nextLine();
            System.out.print("Nhập năm xuất bản: ");
            double newYear = Double.parseDouble( sc.nextLine());
            System.out.print("Nhập giá: ");
            double newPrice = Double.parseDouble( sc.nextLine());
            // cập nhật lại
            ketQua.setTitle(newTitle);
            ketQua.setAuthor(newAuthor);
            ketQua.setPublished_year(newYear);
            ketQua.setPrice(newPrice);
            // gọi dao
            BookDAO.updateBook(ketQua);
            // System.out.println("Cập nhật thành công...");
        }
    }
    // chức năng 4: xóa
    public void deleteBook(){
        System.out.print("Nhập id sách cần xóa: ");
        int delId = Integer.parseInt(sc.nextLine());
        // lấy thông tin từ mảng
        List<Book> books = BookDAO.getBookList();
        // gán kq bằng 1 biến
        Book kq = null;
        // chạy vòng lặp để tìm ra id cần xóa
        for (int i = 0;i<books.size();i++){
            Book b = books.get(i);
            if (b.getBookId() == delId){
                kq = b;
                break;
            }
        }
        if (kq == null){
            System.out.println("ID không tồn tại.");
        } else {
            System.out.println("Tầm thấy sách: " +kq.getTitle());
            System.out.println("Bạn có chắc chắn muốn xóa hay không? (Y/N)");
            String xacNhan = sc.nextLine();
            if (xacNhan.equalsIgnoreCase("Y")){
                BookDAO.deleteBook(delId);
                System.out.println("Xóa thành công.");
            } else {
                System.out.println("Hủy => không xóa...");
            }
        }
    }
    // chức năng 5: tìm kiếm theo tên
    public void searchBook() {
        System.out.print("Nhập tên sách hoặc từ khóa muốn tìm: ");
        String keyword = sc.nextLine();

        // Gọi DAO để lấy danh sách kết quả
        List<Book> results = BookDAO.searchByName(keyword);

        // Kiểm tra và in ra
        if (results.isEmpty()) {
            System.out.println("Không tìm thấy cuốn sách nào phù hợp với từ khóa: " + keyword);
        } else {
            System.out.println("--- Kết quả tìm kiếm ---");
            // Dùng vòng lặp for đơn giản để in
            for (Book b : results) {
                System.out.println(b.toString());
            }
            System.out.println("Tìm thấy " + results.size() + " kết quả.");
        }
    }
}