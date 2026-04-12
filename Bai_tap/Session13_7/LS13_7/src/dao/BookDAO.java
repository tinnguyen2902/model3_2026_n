package dao;
// chứa các đối tượng để truy cập vào CSDL
import BookManager.BookDataByte;
import model.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public static List<Book> getBookList() {
        List<Book> result = new ArrayList<>();
        String sql = "SELECT * FROM Book";
        Connection c = BookDataByte.getConnection();
        if (c == null) {
            System.out.println("Lỗi: Không thể kết nối đến Database. Vui lòng kiểm tra lại URL/Server!");
            return result;
        };
        // Gọi hàm từ class BookDataByte
        try (PreparedStatement pt = c.prepareStatement(sql);
             ResultSet rs = pt.executeQuery()) {

            while (rs.next()) {
                Book b = new Book(
                        rs.getInt("bookId"),
                        rs.getString("title"),
                        rs.getString("author"),
                        rs.getDouble("published_year"),
                        rs.getDouble("price")
                );
                result.add(b);
            }
            c.close();
        } catch (Exception e) {
            System.out.println("Lỗi truy vấn: " + e.getMessage());
        }
        return result;
    }
    //chức năng 2:  thêm vào trong mySQL
    public static void insertBook(Book b){
        String sql = "INSERT INTO Book (title, author, published_year, price) VALUES (?, ?, ?, ?)";
        try (Connection c = BookDataByte.getConnection();
            PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1,b.getTitle());
            ps.setString(2,b.getAuthor());
            ps.setDouble(3,b.getPublished_year());
            ps.setDouble(4,b.getPrice());
            ps.executeUpdate(); // lệnh đẩy data vào mySQL
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    // chức năng 3: cập nhât
    public static void updateBook(Book b){
        String sql = "UPDATE Book SET title = ?, author= ?, published_year= ?, price = ? WHERE bookId = ?";
        try (Connection c = BookDataByte.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1,b.getTitle());
            ps.setString(2,b.getAuthor());
            ps.setDouble(3,b.getPublished_year());
            ps.setDouble(4,b.getPrice());
            ps.setInt(5,b.getBookId());
            int hangThayDoi = ps.executeUpdate();
            if (hangThayDoi > 0){
                System.out.println("Cập nhật thành công.");
            }
        } catch (Exception e){
            System.out.println("lỗi cập nhật: "+ e.getMessage());
        }
    }
    // chức năng 4: xóa
    public static void deleteBook(int id){
        String sql = "DELETE FROM Book WHERE bookId = ?";
        try (Connection c = BookDataByte.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1,id);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // chức năng 5 tìm kiếm theo tên
    public static List<Book> searchByName(String name) {
        List<Book> result = new ArrayList<>();
        // SQL: tìm những sách mà title có chứa chuỗi nhập vào
        String sql = "SELECT * FROM Book WHERE title LIKE ?";

        try (Connection c = BookDataByte.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            // Thiết lập tham số: % từ_khóa % để tìm kiếm mọi vị trí
            ps.setString(1, "%" + name + "%");

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Book b = new Book(
                            rs.getInt("bookId"),
                            rs.getString("title"),
                            rs.getString("author"),
                            rs.getDouble("published_year"),
                            rs.getDouble("price")
                    );
                    result.add(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}