package Session8_7;

public class Main {
    public static void main(String[] args) {
       // 1. Tạo đối tượng cho mỗi lớp
        Employee emp = new Employee("Nguyễn Văn A", "EMP01", 1000);
        Manager man = new Manager("Trần Thị B", "MAN01", 2000, 500);
        Developer dev = new Developer("Lê Văn C", "DEV01", 1500, "Java");

        // 2. In lương của mỗi người bằng getSalary()
        System.out.println("--- Lương thực nhận ---");
        System.out.println(emp.getName() + ": " + emp.getSalary());
        System.out.println(man.getName() + " (Quản lý): " + man.getSalary());
        System.out.println(dev.getName() + " (Lập trình viên): " + dev.getSalary());

        // 3. In thông tin chi tiết bằng toString()
        System.out.println("\n--- Thông tin chi tiết ---");
        System.out.println(emp.toString());
        System.out.println(man.toString());
        System.out.println(dev.toString());

        // 4. Tăng lương cho nhân viên A và hiển thị lại
        System.out.println("\n--- Sau khi tăng lương cho nhân viên A ---");
        emp.increaseSalary(200);
        System.out.println(emp.toString());
    }
}