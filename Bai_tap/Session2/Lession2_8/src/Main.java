import java.util.Scanner;
void main() {
    // nhập vào
    Scanner sc = new Scanner(System.in);
    System.out.printf("Nhập số từ 100-999:");
    int a = sc.nextInt();
    if (a >= 100 && a <= 999) {
        String[] donVi = {"không","một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        int hundreds = a / 100;
        System.out.print(donVi[hundreds] + " trăm ");
        int tens = (a % 100) / 10;
        int units = a % 10;
        if (tens > 1) {
            System.out.print(donVi[tens] + " mươi ");
        } else if (tens == 1) {
            System.out.print(donVi[tens] + " mười ");
        } else if (tens == 0) {
            System.out.print(" lẻ ");
        }
        if (units > 0) {
            System.out.print(donVi[units]);
        }
        } else {
            System.out.print("Vui lòng nhập lại số trong phạm vi 100-999");
        }
        sc.close();

}