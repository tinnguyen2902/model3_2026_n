package LS13_5;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    // 1. Liệt kê
    public void listMovies() {
        List<Movie> movies = new ArrayList<>();
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call list_movies()}")) { // Sửa tên procedure

            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                Movie m = new Movie();
                m.setIdPhim(rs.getInt("id")); // Tên cột trong SQL thường là id
                m.setTieuDe(rs.getString("title"));
                m.setNamPhatHanh(rs.getInt("release_year"));
                movies.add(m);
            }
        } catch (Exception e) {
            System.out.println("Lỗi lấy danh sách: " + e.getMessage());
        }

        if (movies.isEmpty()) {
            System.out.println("Danh sách trống!");
        } else {
            for (Movie m : movies) m.display();
        }
    }

    // 2. Thêm mới (Sửa logic lấy dữ liệu bên ngoài, Manager chỉ xử lý DB)
    public void addMovie(String title, String director, int year) {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call add_movie(?,?,?)}")) {
            cs.setString(1, title);
            cs.setString(2, director);
            cs.setInt(3, year);
            if (cs.executeUpdate() > 0) System.out.println("Thêm thành công!");
        } catch (Exception e) {
            System.out.println("Lỗi thêm: " + e.getMessage());
        }
    }
    // 3. cập nhật
    public void updateMovie(int id, String title, String director, int year) {
        try (Connection conn = Database.getConnection();
             // Procedure update_movie cần nhận đúng 4 tham số: ID, Title, Director, Year
             CallableStatement cs = conn.prepareCall("{call update_movie(?,?,?,?)}")) {

            cs.setInt(1, id);
            cs.setString(2, title);
            cs.setString(3, director);
            cs.setInt(4, year);

            if (cs.executeUpdate() > 0) {
                System.out.println(">> Cập nhật phim thành công!");
            } else {
                System.out.println(">> Không tìm thấy phim có ID: " + id);
            }
        } catch (Exception e) {
            System.out.println("Lỗi cập nhật: " + e.getMessage());
        }
    }

    // 4. Xóa (Sử dụng CallableStatement cho đúng yêu cầu)
    public void deleteMovie(int id) {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call delete_movie(?)}")) {
            cs.setInt(1, id);
            if (cs.executeUpdate() > 0) System.out.println("Xóa thành công!");
            else System.out.println("Không tìm thấy ID.");
        } catch (Exception e) {
            System.out.println("Lỗi xóa: " + e.getMessage());
        }
    }
}