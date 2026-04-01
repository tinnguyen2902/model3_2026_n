package Lession10_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n========= QUẢN LÝ SINH VIÊN =========");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách & Phân loại");
            System.out.println("3. Tìm kiếm sinh viên theo tên");
            System.out.println("4. Thoát");

            int choice = InputUtils.getInt(sc, "Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    int n = InputUtils.getInt(sc, "Bạn muốn nhập bao nhiêu sinh viên? ");
                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhập sinh viên thứ " + (i + 1) + ":");
                        int id = InputUtils.getInt(sc, "Mã SV: ");
                        System.out.print("Họ tên: ");
                        String name = sc.nextLine();
                        double gpa = InputUtils.getDouble(sc, "Điểm GPA: ");
                        manager.addStudent(new Student(id, name, gpa));
                    }
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Nhập tên cần tìm: ");
                    String keyword = sc.nextLine();
                    manager.searchByName(keyword);
                    break;

                case 4:
                    System.out.println("Kết thúc chương trình.");
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}