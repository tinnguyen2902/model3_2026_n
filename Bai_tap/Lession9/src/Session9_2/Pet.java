package Session9_2;

import java.util.Scanner;

public abstract class Pet {
    private String id;
    private String name;
    private int age;

    public Pet() {}

    public Pet(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter và Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // Phương thức trừu tượng
    public abstract void speak();

    public void inputData(Scanner scanner) {
        // Nhập ID với Regex: C hoặc D ở đầu, theo sau là 3 chữ số
        while (true) {
            System.out.print("Nhập mã thú cưng (Cxxx hoặc Dxxx): ");
            String inputId = scanner.nextLine();
            if (inputId.matches("^[CD]\\d{3}$")) {
                this.id = inputId;
                break;
            }
            System.out.println("Lỗi: Mã phải bắt đầu bằng C or D và theo sau là 3 chữ số!");
        }

        // Nhập Tên: 20-50 ký tự
        while (true) {
            System.out.print("Nhập tên thú cưng (20-50 ký tự): ");
            String inputName = scanner.nextLine();
            if (inputName.length() >= 20 && inputName.length() <= 50) {
                this.name = inputName;
                break;
            }
            System.out.println("Lỗi: Tên phải từ 20 đến 50 ký tự!");
        }

        // Nhập Tuổi > 0
        while (true) {
            try {
                System.out.print("Nhập tuổi: ");
                int inputAge = Integer.parseInt(scanner.nextLine());
                if (inputAge > 0) {
                    this.age = inputAge;
                    break;
                }
                System.out.println("Lỗi: Tuổi phải lớn hơn 0!");
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            }
        }
    }

    public void displayData() {
        System.out.printf("ID: %-5s | Tên: %-30s | Tuổi: %-3d | Tiếng kêu: ", id, name, age);
        this.speak();
    }
}