import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập vào chiều dài chiều rộng
        System.out.print("Nhập chiều dài của hình chữ nhật:");
        double width = sc.nextDouble();
        System.out.print("Nhập chiều dài hình chữ nhật:");
        double height = sc.nextDouble();
        // nhập công thức
        double area = width * height;
        double circumference = 2 * (width+height);
        // in ra kết quả
        System.out.printf("Diện tích hình chữ nhật là:%.2f",area);
        System.out.printf("Chu vi hình chữ nhật là:%.2f",circumference);
        sc.close();
    }
}