package Lession13_6;
import DatabaseLS1.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TaskManament {

    public void addTask(String taskName, String status) {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call add_task(?, ?)}")) {
            cs.setString(1, taskName);
            cs.setString(2, status);
            if (cs.executeUpdate() > 0) System.out.println(">> Thêm công việc thành công!");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void listTasks() {
        System.out.println("-".repeat(55));
        System.out.printf("| %-4s | %-25s | %-18s |\n", "ID", "TÊN CÔNG VIỆC", "TRẠNG THÁI");
        System.out.println("-".repeat(55));
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call list_tasks()}")) {
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                new Task(rs.getInt("id"), rs.getString("task_name"), rs.getString("status")).display();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void updateTaskStatus(int taskId, String status) {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call update_task_status(?, ?)}")) {
            cs.setInt(1, taskId);
            cs.setString(2, status);
            if (cs.executeUpdate() > 0) System.out.println(">> Cập nhật trạng thái thành công!");
            else System.out.println(">> Không tìm thấy ID công việc.");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void deleteTask(int taskId) {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call delete_task(?)}")) {
            cs.setInt(1, taskId);
            if (cs.executeUpdate() > 0) System.out.println(">> Đã xóa công việc.");
            else System.out.println(">> Không tìm thấy ID.");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void searchTaskByName(String taskName) {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call search_task_by_name(?)}")) {
            cs.setString(1, taskName);
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                new Task(rs.getInt("id"), rs.getString("task_name"), rs.getString("status")).display();
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public void taskStatistics() {
        try (Connection conn = Database.getConnection();
             CallableStatement cs = conn.prepareCall("{call task_statistics()}")) {
            ResultSet rs = cs.executeQuery();
            System.out.println("\n--- THỐNG KÊ CÔNG VIỆC ---");
            while (rs.next()) {
                System.out.println(rs.getString("status") + ": " + rs.getInt("count"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
}