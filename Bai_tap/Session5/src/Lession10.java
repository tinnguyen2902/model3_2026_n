import java.util.Scanner;

public class Lession10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi kí tự:");
        String text = sc.nextLine().trim();
        if (text.isEmpty()){   // kiểm tra có rỗng hay k dùng isEmpty
            System.err.println("Không có văn bản hợp lệ.");
        }else {
            // tách chuỗi
            String alphabet = text.replaceAll("[^a-zA-Z]",""); // loại bỏ số
            String number = text.replaceAll("[^0-9]","");  // loại bỏ chữ
            System.out.println("Chuỗi ban đầu:" +text);
            System.out.println("Chuỗi chỉ chứa chữ: " +alphabet);
            System.out.println("Chuỗi chỉ chứa số: " +number);
        }
    }
}