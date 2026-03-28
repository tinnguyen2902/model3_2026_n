package Session9_1;
import Session9_1.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class StudentManagament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listStudents = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n*********************QUẢN LÝ SINH VIÊN********************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã");
            System.out.println("4. Xóa sinh viên theo mã");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: // Hiển thị
                    if (listStudents.isEmpty()) {
                        System.out.println("Danh sách trống!");
                    } else {
                        System.out.println("--- DANH SÁCH SINH VIÊN ---");
                        for (Student s : listStudents) s.displayData();
                    }
                    break;

                case 2: // Thêm
                    System.out.print("Nhập số lượng sinh viên muốn thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập sinh viên thứ " + (i + 1) + ":");
                        Student s = new Student();
                        s.inputData(scanner);
                        listStudents.add(s);
                    }
                    break;

                case 3: // Cập nhật
                    System.out.print("Nhập mã sinh viên cần sửa: ");
                    String updateId = scanner.nextLine();
                    int updateIndex = -1;
                    for (int i = 0; i < listStudents.size(); i++) {
                        if (listStudents.get(i).getStudentId().equals(updateId)) {
                            updateIndex = i;
                            break;
                        }
                    }
                    if (updateIndex != -1) {
                        System.out.println("Nhập thông tin mới:");
                        listStudents.get(updateIndex).inputData(scanner);
                        System.out.println("Cập nhật thành công!");
                    } else {
                        System.out.println("Mã sinh viên không tồn tại");
                    }
                    break;

                case 4: // Xóa
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    boolean removed = listStudents.removeIf(s -> s.getStudentId().equals(deleteId));
                    if (removed) {
                        System.out.println("Xóa thành công!");
                    } else {
                        System.out.println("Mã sinh viên không tồn tại");
                    }
                    break;

                case 5: // Tìm kiếm
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String searchName = scanner.nextLine();
                    int count = 0;
                    for (Student s : listStudents) {
                        if (s.getStudentName().toLowerCase().contains(searchName.toLowerCase())) {
                            s.displayData();
                            count++;
                        }
                    }
                    System.out.println("Tìm thấy tổng cộng " + count + " sinh viên.");
                    break;

                case 6:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }
}