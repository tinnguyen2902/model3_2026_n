import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String text = sc.nextLine().trim();
        // thay thế bằng **
        String change = text.replaceAll("[0-9]","*");
        // in kq
        System.out.print("Chuỗi sau khi thay thế:" + change);
    }
}