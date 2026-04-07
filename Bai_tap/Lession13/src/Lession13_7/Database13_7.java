package Lession13_7;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database13_7 {
    // Phải tạo phương thức getConnection để Main.java có thể gọi
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Thêm các tham số cấu hình để tránh lỗi Public Key và SSL
            String url = "jdbc:mysql://localhost:3306/Lession13_7?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
            String user = "root";
            String password = "123";
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Kết nối Database thành công! (OK)");
            }
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Kết nối thất bại! (NG)");
            e.printStackTrace();
            return null;
        }
    }
}