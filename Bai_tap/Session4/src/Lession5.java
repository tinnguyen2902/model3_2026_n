import java.util.Arrays;
import java.util.Scanner;

public class Lession5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập hàng & cột
        System.out.print("Nhập số hàng:");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột:");
        int columns = sc.nextInt();
        // tạo mảng
        int [][] ls5 = new int[rows][columns];
        // nhập giá trị mảng: 2 vòng for => vòng 1 với rows, vòng 2 với columns
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print("Phần tử [" + i +"][" +j+ "]: ");
                ls5[i][j] = sc.nextInt();
            }
        }
        // in ra mảng ban đầu
        System.out.println("Mảng ban đầu:" + Arrays.deepToString(ls5));
        // thực hiện cộng trừ bằng cách duyệt qua mảng
        int sumEven = 0;
        int sumOdd = 0;
        // tương tự như điền giá trị => duyệt qua mảng để cộng
        for (int i = 0;i<rows;i++){
            for(int j = 0; j < columns;j++){
                if (ls5[i][j]%2 == 0){
                    sumEven += ls5[i][j];
                }else {
                    sumOdd += ls5[i][j];
                }
            }
        }
        // in kết quả
        System.out.println("Tổng các số chẳn:" + sumEven);
        System.out.println("Tổng các số lẻ;" + sumOdd);
    }
}