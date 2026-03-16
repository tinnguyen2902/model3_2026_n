import java.util.Arrays;
import java.util.Scanner;

public class Lession6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kích thước bảng:");
        int size = sc.nextInt();
        // tạo mảng
        int [] ls6 = new int[size];
        // nhập giá trị mảng
        for (int i = 0; i< size; i++){
            System.out.print("Giá trị " +(i+1) +":");
            ls6[i] = sc.nextInt();
        }
        // in ra bảng
        System.out.println("Mảng nhập vào:" + Arrays.toString(ls6));
        // in ra kq
          selectionSort(ls6);
            System.out.println("Kết quả sau khi săp xếp:" +Arrays.toString(ls6));
        // tìm kiếm
        System.out.print("Nhập số cần tìm:");
        int x = sc.nextInt();
        // tuyến tính
        int linearRes = linearSearch(ls6,x);
        System.out.println("Tìm kiếm tuyến tính:Số " +x+ (linearRes != 1 ? " ở vị trí " + linearRes : "không tồn tại"));
        // nhị phân
        int binaryRes = binarySeeach(ls6,x);
        System.out.println("Tìm kiếm nhị phân:Số " +x+ (binaryRes != 1 ? " ở vị trí" + binaryRes : "không có"));
    }
    // sắp xếp
        public static void selectionSort(int[] arr){
            int n = arr.length;
            // vòng lặp 1
            for (int i = 0;i < n;i++){
                // vị trí nhỏ nhất
                int min_index = i;
                // vòng lặp 2 ở trong vòng 1
                for (int j =i + 1;j < n;j++){
                    if(arr[j]>arr[min_index]){
                        min_index = j;
                    }
                }
                // đổi vị trí
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i]=temp;
            }
        }
    // tìm kiếm tuyến tính
    public static int linearSearch(int[]arr,int x){
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // tìm kiếm nhị phân
    public static int binarySeeach(int[] arr, int x){
        int left = 0,right = arr.length-1;
        while (left<=right){
            int mid = left + (right+ left)/2;
            if (arr[mid] == x) return mid;
            if (arr[mid] <x) left = mid +1;
            else right = mid -1;
        }
        return -1;
    }
}