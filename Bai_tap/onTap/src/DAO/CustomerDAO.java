package DAO;

import Database.dbConnect;
import Model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CustomerDAO {
    // thêm khách hàng
    public boolean addCus(Customer customer){
        String sql = "INSERT INTO customer(c_name) VALUES(?)";
        try (Connection conn = dbConnect.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1,customer.getC_name());
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
}