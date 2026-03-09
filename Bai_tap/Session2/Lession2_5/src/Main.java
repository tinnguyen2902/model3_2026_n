import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    int month ;
    do {
        System.out.printf("Nhập tháng cần check:");
        month = sc.nextInt();
    } while (month < 1 && month > 12);
    switch (month){
        case 1 : System.out.printf("Tháng 1 có 31 ngày");
          break;
        case 2 : System.out.printf("Tháng 2 có 28 hoặc 29 ngày");
            break;
        case 3 : System.out.printf("Tháng 3 có 31 ngày");
            break;
        case 4 : System.out.printf("Tháng 4 có 30 ngày");
            break;
        case 5 : System.out.printf("Tháng 5 có 31 ngày");
            break;
        case 6 : System.out.printf("Tháng 6 có 30 ngày");
            break;
        case 7 : System.out.printf("Tháng 7 có 31 ngày");
            break;
        case 8 : System.out.printf("Tháng 8 có 31 ngày");
            break;
        case 9 : System.out.printf("Tháng 9 có 30 ngày");
            break;
        case 10 : System.out.printf("Tháng 10 có 31 ngày");
            break;
        case 11 : System.out.printf("Tháng 11 có 30 ngày");
            break;
        case 12 : System.out.printf("Tháng 12 có 31 ngày");
            break;
        default: System.out.printf("Tháng không hợp lệ");
    }
    sc.close();
}
