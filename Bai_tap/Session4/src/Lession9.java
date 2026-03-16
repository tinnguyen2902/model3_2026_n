import java.util.Scanner;

public class Lession9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng: ");
        int size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Mảng không hợp lệ!");
            return;
        }

        int[] arr = new int[size];

        // Nhập giá trị cho mảng ---
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Khởi tạo max sau khi đã có dữ liệu mảng
        int maxGlobal = arr[0];
        int maxCurrent = arr[0];
        for (int i = 1; i < size; i++) {
            maxCurrent = Math.max(arr[i], maxCurrent + arr[i]);

            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        // In kết quả
        System.out.println("Tổng dãy con liên tiếp lớn nhất là: " + maxGlobal);
    }
}