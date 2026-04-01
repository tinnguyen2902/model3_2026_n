package Lession10_8;

import java.util.Scanner;

public class Input {
    public static String getString(Scanner sc, String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (input.isEmpty()) System.out.println("Lỗi: Không được để trống!");
        } while (input.isEmpty());
        return input;
    }

    public static int getInt(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên (năm)!");
            }
        }
    }
}