package Lession2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AppointmentBusiness bus = new AppointmentBusiness();

        while (true) {
            System.out.println("\n********************* QUẢN LÝ LỊCH HẸN ********************");
            System.out.println("1. Thêm lịch hẹn");
            System.out.println("2. Hiển thị danh sách (Theo ngày tăng dần)");
            System.out.println("3. Tìm kiếm theo tên bệnh nhân");
            System.out.println("4. Cập nhật lịch hẹn");
            System.out.println("5. Xóa lịch hẹn");
            System.out.println("6. Thống kê");
            System.out.println("7. Thoát");
            System.out.print("Lựa chọn: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: bus.add(scanner); break;
                    case 2: bus.display(); break;
                    case 3: bus.search(scanner); break;
                    case 4: bus.update(scanner); break;
                    case 5: bus.delete(scanner); break;
                    case 6: bus.report(); break;
                    case 7: System.exit(0);
                    default: System.out.println("Chọn từ 1-7!");
                }
            } catch (Exception e) {
                System.err.println("Lỗi: Vui lòng nhập số!");
            }
        }
    }
}