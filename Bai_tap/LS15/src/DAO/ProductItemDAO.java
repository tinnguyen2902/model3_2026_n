package DAO;

import Model.Product;
import database.dbcontact;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductItemDAO {
    public List<Product>getAllPro(){
        List<Product> list = new ArrayList<>();
        String sql = "SELECT*FROM Product";
        try (Connection conn = dbcontact.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()){
            while (rs.next()){
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
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}