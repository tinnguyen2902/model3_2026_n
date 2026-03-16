import java.util.Arrays;
import java.util.Scanner;

public class Lession8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thuớc mảng n = ");
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("\"Ma trận không hợp lệ\"");
            return;
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị mảng :");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Xoay ma trận 90 độ
        // 1. Chuyển vị
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 2. Đảo ngược hàng
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }

        // In kết quả theo định dạng mảng
        System.out.print("Kết quả sau khi xoay 90 độ: ");
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(matrix[i]).replace(" ", "")); // replace để bỏ dấu cách nếu muốn khít hơn
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}