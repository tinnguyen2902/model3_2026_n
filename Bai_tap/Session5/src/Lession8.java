import java.util.Scanner;

public class Lession8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi kí tự:");
        String textInput = sc.nextLine().trim();
        //xem kq nhập vào
        System.out.println("Giá trị nhập vào: " +textInput);
        // check chuỗi rỗng
        if (textInput == null){
            System.err.println("Vui lòng nhập giá trị khác rỗng");
        }
        StringBuilder sb = new StringBuilder();
        int n = textInput.length();
        // duyệt qua mảng
        for (int i = 0;i< n;i++){
            int count = 1;
            // tìm trùng
            while (i<n-1 && textInput.charAt(i) == textInput.charAt(i+1)){
                count++;
                i++;
            }
            // nối chuỗi
            sb.append(textInput.charAt(i));  // giá trị a,b,c...
            sb.append(count);   // số đếm phía sau
        }
        // in ra kq
        System.out.println("Giá trị sau khi nén:"+sb.toString());  //toString chuyển sang dạng chuổi
    }
}