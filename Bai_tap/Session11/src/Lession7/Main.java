package Lession7;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Quý", "IT", 8.5),
                new Student("Lan", "Business", 7.2),
                new Student("Minh", "IT", 9.0),
                new Student("Huyền", "Design", 6.8),
                new Student("Long", "IT", 7.9),
                new Student("Trang", "Business", 8.1),
                new Student("Việt", "IT", 8.0),
                new Student("Tú", "Design", 7.5),
                new Student("Phúc", "Business", 6.9),
                new Student("An", "AI", 9.5)
        );

        // Bước 1: Thống kê số lượng
        Map<String, Long> majorCount = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getMajor,
                        Collectors.counting()
                ));

        // Bước 2: Sắp xếp theo số lượng giảm dần
        System.out.println("--- THỐNG KÊ SINH VIÊN THEO CHUYÊN NGÀNH ---");

        majorCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // Sắp xếp giảm dần theo value
                .forEach(entry -> {
                    System.out.printf("Chuyên ngành: %-15s | Số lượng: %d\n",
                            entry.getKey(), entry.getValue());
                });
    }
}