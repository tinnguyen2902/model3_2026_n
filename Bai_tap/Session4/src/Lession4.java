import java.util.Arrays;
import java.util.Scanner;

public class Lession4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // khởi tạo
        System.out.print("Nhập độ dài của mảng: ");
        int size = sc.nextInt();
        // nếu giá trị nhập vào k hợp lệ
        if (size <= 0){
            System.out.println("Kích thước mảng không hợp lệ hoặc rỗng. ");
        }
        // tạo mảng
        int [] ls4 = new int[size];
        // nhập giá trị mảng
        for (int i = 0;i < size;i++){
            System.out.print("Nhập giá trị thứ " +(i+1) + ":");
            ls4[i] = sc.nextInt();
        }
        System.out.println("Giá trị nhập vào của mảng là: " + Arrays.toString(ls4));
        // thực hiện đảo ngược
        for (int j = 0; j < size/2; j++){
            // gán biến temp để tránh thất lạc mảng
            int temp = ls4[j];
            // đảo ngược: lấy giá trị bên phải đè sang bên trái
            ls4[j] = ls4[size-1-j];
            // gán lại gt
            ls4[size-1-j] = temp;

        }
        // in ra kq
        System.out.println("Giá trị mảng sau khi đảo vị trí" + Arrays.toString(ls4));
    }
}
