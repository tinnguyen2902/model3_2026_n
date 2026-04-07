package DatabaseLS1;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Validator {
    public static String getString(Scanner sc, String msg) {
        System.out.print(msg);
        return sc.nextLine();
    }
    public static int getInt(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số!");
            }
        }
    }
    public static LocalDate getLocalDate(Scanner sc, String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (Exception e) {
                System.out.println("Định dạng ngày sai (dd/mm/yyyy)!");
            }
        }
    }
}