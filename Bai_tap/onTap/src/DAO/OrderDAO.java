package DAO;

import Database.dbConnect;
import Model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
        // tạo đơn hàng
        public boolean addOrder(Order o) {
                String sql = "INSERT INTO orders(c_id) VALUES(?)";
                try (Connection c = dbConnect.getConnection();
                     PreparedStatement ps = c.prepareStatement(sql)) {
                        ps.setInt(1, o.getC_id());
                        int rows = ps.executeUpdate();
                        if (rows > 0) {
                                return true;
                        }
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                return false;
        }
        // hiển thị danh sách đơn hàng
        // dùng join để lấy tên khách
        public List<Order> getAllOrder(){
        List<Order> list = new ArrayList<>();
        String sql = "SELECT orders.o_id, orders.c_id, customer.c_name, orders.created_at "+
                "FROM orders "+
                "JOIN customer ON orders.c_id = customer.c_id ";
        try(Connection c = dbConnect.getConnection();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                        Order o = new Order();
                        o.setO_id(rs.getInt("o_id"));
                        o.setC_id(rs.getInt("c_id"));
                        o.setCustomerName(rs.getString("c_name"));
                        o.setCreated_at(rs.getTimestamp("created_at"));
                        list.add(o);
                }
        } catch (SQLException e){
                        e.printStackTrace();
                }
        return list;
        }
//        // tính tổng tiền đơn hàng
//        public double getTotalAmount (int o_id){
//                double total = 0;
//                // join vào bảng order_item và product để lấy giá tiền
//                String sql = "SELECT SUM(oi.quantity * p.price) AS total_money "+
//                        "FROM order_item oi "+
//                        "JOIN product p ON oi.p_id = p.p_id " +
//                        "WHERE oi.o_id = ? ";
//                try (Connection c = dbConnect.getConnection();
//                PreparedStatement ps = c.prepareStatement(sql)){
//                        ps.setInt(1,o_id);
//                        try (ResultSet rs = ps.executeQuery()){
//                                if (rs.next()){
//                                        total = rs.getDouble("total_money");
//                                }
//                        }
//                } catch (SQLException e){
//                        e.printStackTrace();
//                }
//                return total;
//        }
//        // xóa đơn hàng
//        public boolean delOrrder(int o_id){
//                // xóa giá trị bên trong
//                String sqlDelItem = "DELETE FROM order_item WHERE o_id = ?";
//                // xóa đơn
//                String sqlDelOr = "DELETE FROM orders WHERE o_id = ? ";
//                try (Connection c = dbConnect.getConnection()) {
//                        c.setAutoCommit(false);
//                        try(PreparedStatement ps1 = c.prepareStatement(sqlDelItem);
//                            PreparedStatement ps2 = c.prepareStatement(sqlDelOr)) {
//                             // xóa bên trong
//                             ps1.setInt(1,o_id);
//                             ps1.executeUpdate();
//                             ps2.setInt(1,o_id);
//                             int rows = ps2.executeUpdate();
//                             c.commit();
//                             return rows > 0;
//                        }catch (SQLException e){
//                                e.printStackTrace();
//                        }
//                        return false;
//                } catch (SQLException e){
//                        e.printStackTrace();
//                        return false;
//                }
//        }
}
