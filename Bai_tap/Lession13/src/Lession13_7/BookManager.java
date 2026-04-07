package Lession13_7;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Lession13_7";
        return DriverManager.getConnection(url, "root", "password_cua_ban");
    }

    public void addBook(Book book) {
        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall("{call addBook(?,?,?,?)}")) {
            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setInt(3, book.getPublishedYear());
            stmt.setDouble(4, book.getPrice());
            stmt.execute();
            System.out.println("Thêm sách thành công!");
        } catch (SQLException e) {
            System.err.println("Lỗi: " + e.getMessage());
        }
    }

    public void findBooksByAuthor(String author) {
        try (Connection conn = getConnection();
             CallableStatement stmt = conn.prepareCall("{call findBooksByAuthor(?)}")) {
            stmt.setString(1, author);
            ResultSet rs = stmt.executeQuery();
            boolean found = false;
            while (rs.next()) {
                System.out.printf("ID: %d | Tên: %s | Tác giả: %s | Năm: %d | Giá: %.2f\n",
                        rs.getInt("id"), rs.getString("title"), rs.getString("author"),
                        rs.getInt("published_year"), rs.getDouble("price"));
                found = true;
            }
            if (!found) System.out.println("Không tìm thấy sách của tác giả này.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Tương tự viết cho updateBook, deleteBook và listAllBooks...
}