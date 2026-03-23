import java.util.Scanner;

public class Lession6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào mật khẩu:");
        String passIn = sc.nextLine().trim();
       // check hợp lệ
        // biểu thức chính quy
        String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
                // /^: bắt đầu chuỗi
                //?= là positive lookahead giúp check xem một mẫu có tồn tại hay không
                //.* : . 1 kí tự bất kì,* 1 or nhiều kí tự trong ngoặc
        if (passIn.matches(passRegex)){
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.err.println("Mật khẩu không hợp lệ");
        }

    }
}