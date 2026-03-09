import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo Scanner để nhập dữ liệu từ bàn phím
        Scanner sc = new Scanner(System.in);
        // 2. Nhập dữ liệu
        System.out.print("Nhập số thực a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập số thực b: ");
        double b = sc.nextDouble();

        // 3. Thực hiện phép tính (Sử dụng double để giữ độ chính xác)
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        double quotient = a / b;
        double remainder = a % b;

        // 4. In kết quả ra màn hình (%.2f để lấy 2 chữ số thập phân)
        System.out.printf("Tổng của 2 số là: %.2f\n", sum);
        System.out.printf("Hiệu của 2 số là: %.2f\n", difference);
        System.out.printf("Tích của 2 số là: %.2f\n", product);
        System.out.printf("Thương của 2 số là: %.2f\n", quotient);
        System.out.printf("Phần dư khi chia 2 số là: %.2f\n", remainder);

        sc.close();
    }
}