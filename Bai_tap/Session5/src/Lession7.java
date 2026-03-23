import java.util.Random;
import java.util.Scanner;

public class Lession7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập vào số lượng n:");
        int n;
        // check n_ hàm sc.hasNextInt xác định n là số nguyên hay không
        if (sc.hasNextInt()){
            n = sc.nextInt();
        } else {
            System.out.println("Vui lòng nhập số nguyên dương.");
            return;
        }
        // check điều kiện n
        if (n < 0 || n > 1000){
            System.out.println("Giá trị nhập vào ngoài phạm vi.");
        } else {
            // khai báo tập hợp kí tự
            String alphabet = "ABCDEFGHIJKLMNPQRSTUVWXYZ"
                    +"abcdefghijklmnpqertuwxys"
                    +"1234567890";
            StringBuilder sb = new StringBuilder(n);
            for (int i = 0;i<n;i++){
                // lấy một giá trị bất kì
                int index = rd.nextInt(alphabet.length());
                sb.append(alphabet.charAt(index));   // nối chuỗi
            }
            // trả về kq
            String finalResult = sb.toString();
            System.out.println("Chuỗi ngẫu nhiên có độ dài "+n + " là");
            System.out.println(finalResult);
            // check bằng regex
            if (finalResult.matches("^[a-zA-Z0-9]+$")){
                System.out.println("Trạng thái hợp lệ");
        }

        }
    }
}