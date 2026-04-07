package LS13_5;

import java.util.Scanner;

public class Validator {
    private static final Scanner sc = new Scanner(System.in);

    // 1. Check chuỗi không trống
    public static String readString(String message) {
        while (true) {
            System.out.print(message); // Dùng print để nhập trên cùng 1 dòng
            String input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.err.println(">> Lỗi: Thông tin không được để trống.");
        }
    }

    // 2. Check số nguyên (Dùng cho ID, Năm, Lựa chọn menu)
    public static int readInt(String message, int min, int max) {
        while (true) {
            try {
                System.out.print(message);
                int number = Integer.parseInt(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.err.println(">> Lỗi: Phải nhập số trong khoảng " + min + " đến " + max);
            } catch (NumberFormatException e) {
                System.err.println(">> Lỗi: Định dạng sai, chỉ nhập số nguyên!");
            }
        }
    }

    // 3. Check số thực (Nếu cần dùng cho điểm số hoặc giá vé)
    public static double readDouble(String message, double min, double max) {
        while (true) {
            try {
                System.out.print(message);
                double number = Double.parseDouble(sc.nextLine());
                if (number >= min && number <= max) {
                    return number;
                }
                System.err.println(">> Lỗi: Giá trị phải từ " + min + " đến " + max);
            } catch (NumberFormatException e) {
                System.err.println(">> Lỗi: Định dạng sai, chỉ nhập số thực!");
            }
        }
    }
}