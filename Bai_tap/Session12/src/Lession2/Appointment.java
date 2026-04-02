package Lession2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Appointment {
    private String appointmentId;
    private String patientName;
    private String phoneNumber;
    private LocalDate appointmentDate;
    private String doctor;

    public Appointment() {}

    public Appointment(String appointmentId, String patientName, String phoneNumber, LocalDate appointmentDate, String doctor) {
        this.appointmentId = appointmentId;
        this.patientName = patientName;
        this.phoneNumber = phoneNumber;
        this.appointmentDate = appointmentDate;
        this.doctor = doctor;
    }

    // Getters và Setters
    public String getAppointmentId() { return appointmentId; }
    public String getPatientName() { return patientName; }
    public String getPhoneNumber() { return phoneNumber; }
    public LocalDate getAppointmentDate() { return appointmentDate; }
    public String getDoctor() { return doctor; }

    public void inputData(Scanner scanner, List<Appointment> list, boolean isUpdate) {
        if (!isUpdate) {
            this.appointmentId = validateId(scanner, list);
        }
        this.patientName = validateName(scanner);
        this.phoneNumber = validatePhone(scanner);
        this.appointmentDate = validateDate(scanner);
        this.doctor = validateDoctor(scanner);
    }

    private String validateId(Scanner scanner, List<Appointment> list) {
        while (true) {
            System.out.print("Nhập mã lịch hẹn (6 ký tự): ");
            String id = scanner.nextLine();
            if (id.length() != 6) {
                System.err.println("Lỗi: Mã phải đúng 6 ký tự!");
            } else if (list.stream().anyMatch(a -> a.getAppointmentId().equals(id))) {
                System.err.println("Lỗi: Mã lịch hẹn đã tồn tại!");
            } else return id;
        }
    }

    private String validateName(Scanner scanner) {
        while (true) {
            System.out.print("Tên bệnh nhân (10-50 ký tự): ");
            String name = scanner.nextLine();
            if (name.length() >= 10 && name.length() <= 50) return name;
            System.err.println("Lỗi: Tên không hợp lệ!");
        }
    }

    private String validatePhone(Scanner scanner) {
        String regex = "^(0|84)(3|5|7|8|9)([0-9]{8})$"; // Regex SĐT
        while (true) {
            System.out.print("Số điện thoại: ");
            String phone = scanner.nextLine();
            if (phone.matches(regex)) return phone;
            System.err.println("Lỗi: Định dạng số điện thoại không đúng!");
        }
    }

    private LocalDate validateDate(Scanner scanner) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (true) {
            System.out.print("Ngày hẹn (dd/MM/yyyy): ");
            try {
                return LocalDate.parse(scanner.nextLine(), dtf);
            } catch (Exception e) {
                System.err.println("Lỗi: Định dạng ngày sai (dd/MM/yyyy)!");
            }
        }
    }

    private String validateDoctor(Scanner scanner) {
        while (true) {
            System.out.print("Bác sĩ phụ trách: ");
            String doc = scanner.nextLine();
            if (!doc.isBlank() && doc.length() <= 200) return doc;
            System.err.println("Lỗi: Tên bác sĩ không quá 200 ký tự!");
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("ID: %s | BN: %-15s | SĐT: %-11s | Ngày: %s | BS: %s",
                appointmentId, patientName, phoneNumber, appointmentDate.format(dtf), doctor);
    }
}