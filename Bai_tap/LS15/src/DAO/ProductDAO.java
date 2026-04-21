package DAO;

import Model.Product;
import database.dbcontact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDAO {
   // thêm sp

   public boolean addPro(Product product){
       String sql = "INSERT INTO Product(name,price,title,created,catalog,status) VALUES(?,?,?,?,?,?)";
       try (Connection conn = dbcontact.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
           pstmt.setString(1,product.getName());
           pstmt.setFloat(2,product.getPrice());
           pstmt.setString(3,product.getTitle());
           if (product.getCreated() != null) {
               pstmt.setDate(4, new java.sql.Date(product.getCreated().getTime()));
           } else {
               pstmt.setNull(4, java.sql.Types.DATE);
           }
           pstmt.setString(5,product.getCatalog());
           pstmt.setBoolean(6,product.isStatus());
           int rows = pstmt.executeUpdate();
           if (rows > 0) {
               return true;
           }
       } catch (SQLException e){
           e.printStackTrace();
           System.out.println(e);
       }
       return false;
   }
   // tìm kiếm sản phẩm theo ID => để check sp có tồn tại hay không khi cập nhật
   public Product findById(int id) {
       String sql = "SELECT * FROM Product WHERE id = ?";
       try (Connection conn = dbcontact.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {

           pstmt.setInt(1, id);
           try (ResultSet rs = pstmt.executeQuery()) {
               if (rs.next()) {
                   // Trả về đối tượng Product nếu tìm thấy
                   return new Product(
                           rs.getInt("id"),
                           rs.getString("name"),
                           rs.getFloat("price"),
                           rs.getString("title"),
                           rs.getDate("created"),
                           rs.getString("catalog"),
                           rs.getBoolean("status")
                   );
               }
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
       return null; // Trả về null nếu không tìm thấy
   }
   // cập nhật sp
    public boolean updatePro(Product product){
       String sql = "UPDATE Product SET name=?,price=?, title=?, catalog=?, status=? WHERE id = ?";
        try (Connection conn = dbcontact.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, product.getName());
            pstmt.setFloat(2, product.getPrice());
            pstmt.setString(3, product.getTitle());
            pstmt.setString(4, product.getCatalog());
            pstmt.setBoolean(5, product.isStatus());
            pstmt.setInt(6, product.getId()); // Điều kiện để biết sửa sản phẩm nào

            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    // xóa sp
    public boolean deletePro(int id) {
        String sql = "DELETE FROM Product WHERE id = ?";
        try (Connection conn = dbcontact.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    // timg kiếm theo tên
    public List<Product> searchByName(String keyword) {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM Product WHERE name LIKE ?";
        try (Connection conn = dbcontact.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + keyword + "%"); //  bất kỳ vị trí nào chứa keyword

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    Product p = new Product(
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getFloat("price"),
                            rs.getString("title"),
                            rs.getDate("created"),
                            rs.getString("catalog"),
                            rs.getBoolean("status")
                    );
                    list.add(p);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    // sắp xếp theo giá tăng dần
    public List<Product> getAllProByPrice() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM Product ORDER BY price ASC";
        try (Connection conn = dbcontact.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                Product p = new Product(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getFloat("price"),
                        rs.getString("title"),
                        rs.getDate("created"),
                        rs.getString("catalog"),
                        rs.getBoolean("status")
                );
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    // thống kê số lượng theo danh mục

    public Map<String, Integer> getCountByCa() {
        Map<String, Integer> stats = new HashMap<>();
        // nhóm theo danh mục và đếm số lượng
        String sql = "SELECT catalog, COUNT(*) as total FROM Product GROUP BY catalog";

        try (Connection conn = dbcontact.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                String catalogName = rs.getString("catalog");
                int count = rs.getInt("total");
                stats.put(catalogName, count);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stats;
    }


}