import java.util.Scanner;

public class Lession2 {
    public static void main(String[] args) {
        // khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int size = sc.nextInt();
        // tạo mảng
        int [] ls2 = new int[size];
        // nhập đầu vào mảng
        System.out.println("Nhập giá trị của mảng");
        for (int i = 0;i<size;i++){
            System.out.print("giá trị thứ " + (i+1)+": ");
            ls2[i] = sc.nextInt();
        }
        // tính tổng
        int sum = 0;
        for (int v : ls2){
            sum += v ;
        }
// viết kết quả ở đây : trong main
        System.out.println("Tổng giá trị của mảng:" + sum);
    }
 // viết sắp xếp ở đây ngoài main (nếu có)
}