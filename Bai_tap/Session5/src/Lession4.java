import java.util.Scanner;

public class Lession4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập email:");
        String email = sc.nextLine().trim();
        // biểu thức chính quy
        String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,6})+$";
        // kiểm tra định dạng
        if (email.matches(emailRegex)){
            System.out.println("Email hợp lệ.");
        }else {
            System.out.println("Email không hợp lệ.");
        }
    }
}