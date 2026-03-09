import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Nhập số cần tính:");
    int a = sc.nextInt();
    int sum = 0;
    int b = Math.abs(a);  // chuyển âm thành dương, nếu dương giữ nguyên
    // tách số
    while (b != 0) {
        int tach = b % 10;
        sum = sum + tach;  // cộng vào
        b = b / 10 ;  //bỏ số cuối
    }
    sc.close();
    // in ra
    System.out.printf("Tổng %d là %d",a,sum);
}
