import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Vui lòng nhập số nguyên:");
    int a = sc.nextInt();
    int sum = 0;

    if (a >= 1) {
        for (int i = 1; i <= a; i++) {
            sum += i;
        }
        System.out.printf("Tổng =%d",sum);
    } else {
        System.out.println("Vui lòng nhập số lớn hơn 1");
    }

}
