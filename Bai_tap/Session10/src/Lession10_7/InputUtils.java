package Lession10_7;

import java.util.Scanner;

public class InputUtils {
    public static int getInt(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên!");
            }
        }
    }

    public static double getDouble(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double val = Double.parseDouble(sc.nextLine());
                if (val < 0 || val > 10) {
                    System.out.println("GPA phải nằm trong khoảng 0 - 10!");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số thực (ví dụ: 7.5)!");
            }
        }
    }
}