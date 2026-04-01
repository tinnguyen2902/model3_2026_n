package Lession10_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanConverterService service = new RomanConverterService();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHUYỂN ĐỔI SỐ LA MÃ ===");

        try {
            System.out.print("Nhập số nguyên dương trong phạm vi 1-3999: ");
            int input = Integer.parseInt(sc.nextLine());

            String result = service.toRoman(input);
            System.out.println("Kết quả La Mã: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập một số nguyên!");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}