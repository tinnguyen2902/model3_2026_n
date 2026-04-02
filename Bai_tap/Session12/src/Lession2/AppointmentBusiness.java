package Lession2;

import java.util.*;
import java.util.stream.Collectors;

public class AppointmentBusiness {
    private List<Appointment> list = new ArrayList<>();

    public void add(Scanner scanner) {
        Appointment a = new Appointment();
        a.inputData(scanner, list, false);
        list.add(a);
        System.out.println("Thêm lịch hẹn thành công!");
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("Chưa có lịch hẹn nào.");
            return;
        }
        list.stream()
                .sorted(Comparator.comparing(Appointment::getAppointmentDate))
                .forEach(System.out::println);
    }

    public void search(Scanner scanner) {
        System.out.print("Nhập tên bệnh nhân cần tìm: ");
        String name = scanner.nextLine().toLowerCase();
        List<Appointment> result = list.stream()
                .filter(a -> a.getPatientName().toLowerCase().contains(name))
                .collect(Collectors.toList());

        if (result.isEmpty()) System.out.println("Không tìm thấy kết quả.");
        else result.forEach(System.out::println);
    }

    public void update(Scanner scanner) {
        System.out.print("Nhập mã lịch hẹn cần sửa: ");
        String id = scanner.nextLine();
        Optional<Appointment> opt = list.stream()
                .filter(a -> a.getAppointmentId().equals(id))
                .findFirst();

        opt.ifPresentOrElse(
                a -> {
                    a.inputData(scanner, list, true);
                    System.out.println("Cập nhật thành công!");
                },
                () -> System.err.println("Không tìm thấy mã lịch hẹn!")
        );
    }

    public void delete(Scanner scanner) {
        System.out.print("Nhập mã lịch hẹn cần xóa: ");
        String id = scanner.nextLine();
        Optional<Appointment> opt = list.stream().filter(a -> a.getAppointmentId().equals(id)).findFirst();

        if (opt.isPresent()) {
            System.out.print("Bạn có chắc chắn muốn xóa? (Y/N): ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                list.remove(opt.get());
                System.out.println("Đã xóa thành công!");
            }
        } else {
            System.err.println("Mã không tồn tại!");
        }
    }

    public void report() {
        System.out.println("Tổng số lịch hẹn: " + list.size());
        Map<String, Long> stats = list.stream()
                .collect(Collectors.groupingBy(Appointment::getDoctor, Collectors.counting()));

        stats.forEach((doc, count) -> System.out.println("Bác sĩ: " + doc + " | Số lịch hẹn: " + count));
    }
}