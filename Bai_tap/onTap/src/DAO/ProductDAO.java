package DAO;

import Database.dbConnect;
import Model.Customer;
import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductDAO {
    // thêm sản phẩm
    public boolean addPro(Product p){
        String sql = "INSERT INTO product(p_name,price) VALUES(?,?)";
        try (Connection conn = dbConnect.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1,p.getP_name());
            ps.setDouble(2,p.getPrice());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                return true;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return false;
    }
}