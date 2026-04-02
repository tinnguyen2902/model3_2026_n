package Lession9;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1.danh sách người dùng
        User u1 = new User(1, "Quý", "quy@example.com");
        User u2 = new User(2, "Lan", null);
        User u3 = new User(3, "Huyền", "huyen@example.com");
        List<User> userList = List.of(u1, u2, u3);

        // 2.danh sách công việc
        List<Task> tasks = List.of(
                new Task(1, "Viết báo cáo", u1, LocalDate.of(2025, 3, 20), false),
                new Task(2, "Thiết kế slide", u1, LocalDate.of(2025, 4, 25), true),
                new Task(3, "Họp nhóm", u2, LocalDate.of(2025, 4, 18), false),
                new Task(4, "Nộp tài liệu", u3, LocalDate.of(2025, 3, 22), true),
                new Task(5, "Chuẩn bị thuyết trình", u2, LocalDate.of(2025, 4, 19), true)
        );

        // Ngày hiện tại để so sánh
        LocalDate today = LocalDate.of(2025, 4, 4);

        // --- THỰC HIỆN XỬ LÝ ---

        // các công việc QUÁ HẠN và CHƯA HOÀN THÀNH
        System.out.println("--- CÔNG VIỆC QUÁ HẠN & CHƯA XONG ---");
        tasks.stream()
                .filter(t -> !t.isCompleted() && t.getDueDate().isBefore(today))
                .forEach(System.out::println);

        // công việc đã hoàn thành
        long completedCount = tasks.stream()
                .filter(Task::isCompleted)
                .count();
        System.out.println("\nTổng số công việc đã hoàn thành: " + completedCount);

        // In danh sách
        System.out.println("\n--- DANH SÁCH NGƯỜI DÙNG ---");
        userList.forEach(System.out::println);
    }
}