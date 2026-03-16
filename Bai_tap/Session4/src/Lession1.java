import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    // khởi tạo mảng
        System.out.print("Nhập kích thước mảng:");
        // nhập vào length
        int size = sc.nextInt();
        int [] ls1 = new int[size];
        // nhập vào giá trị trong mảng
        System.out.println("Nhập vào giá trị mảng");
        for (int i = 0;i < size;i++){
            System.out.print("Giá trị thứ " + (i + 1) + ": ");
            ls1[i] = sc.nextInt();
        }
      // gọi lại sx trong main
        bubbleStort(ls1);

      // in kết quả
        System.out.println("kết quả mảng sau sắp xếp");
        for(int x : ls1){
            System.out.print(x + " ");
        }
        // in ra giaá trị lớn nhất
        System.out.println("\nGiá trị lớn nhất của mảng:" + ls1[0]);
    }
    // sắp xếp mảng -- sx nổi bọt bubble sort => viết ngoài main , kết quả cho vòng trong main
        public static void bubbleStort(int[] arr){
            int n = arr.length;
            boolean swapped;
            // dùng vòng lặp đi qua từng phần tử của mảng
            for (int h = 0;h < n-1 ;h++){
                swapped = false;
                // dùng for để so sánh phẩn tử
                for (int k = 0;k <n-1-h;k++){
                    if (arr[k] < arr[k+1]){
                        // hoán đỏi vị trí
                        int temp = arr[k];
                        arr[k] = arr[k+1];
                        arr[k+1]= temp;
                        swapped = true;
                    }
                }
                // nếu khôbg có hoán đổ xảy ra => thoát
                if (!swapped) break;
            }
        }

}