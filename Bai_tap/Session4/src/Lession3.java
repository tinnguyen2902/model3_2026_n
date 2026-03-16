import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {
        // khởi tạo mảng
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng:");
        int size = sc.nextInt();
      // nhập giá trị mảng
       int [] ls3 = new int[size];
      for (int i = 0 ; i< size; i++){
          System.out.print("Nhập giá trị " + (i+1)+":");
          ls3[i] = sc.nextInt();
        }
        // in ra giá trị
        bubbleSort(ls3);
        System.out.print("kết quả sau khi sắp xếp là:");
      for (int x : ls3){
          System.out.print( x + " ");
      }
    }
    // sắp xếp
    public static void bubbleSort(int[]arr){
        int n = arr.length;
        boolean swapped;
        // vòng lặp for trong
        for (int i = 0; i < n-1;i++){
            swapped = false;
            for (int j = 0;j<n-1-i;j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

    }
}

