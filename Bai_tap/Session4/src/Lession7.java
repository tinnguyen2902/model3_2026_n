import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
public class Lession7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng:");
        int size = sc.nextInt();
        int [] ls7 = new int[size];
        if (size <= 0){
            System.out.println("Mảng không hợp lệ");
        } else {
            for (int i = 0;i<size;i++){
                System.out.print("Nhập giá trị " +(i+1) +":");
                ls7[i] = sc.nextInt();
            }
            System.out.println("Giá trị mảng nhập vào:" + Arrays.toString(ls7));
        }
        // lọc giá trị lặp
        System.out.print("Các giá trị xuất hiện 1 lần:");
        boolean found = false;
        for (int j =0;j<size;j++){
            int count = 0;
            // đếm số lần lặp trong mảng
            for (int k = 0; k<size;k++){
                if (ls7[j] == ls7[k] ){
                    count++;
                }
            }
            if (count==1){
                System.out.print(ls7[j] + " ");
                found = true;
            }
        }
        if (!found){
            System.out.print("Không có phần tử nào duy nhất trong mảng");
        }
    }


}