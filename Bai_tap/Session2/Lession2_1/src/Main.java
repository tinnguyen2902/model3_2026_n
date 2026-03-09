import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  Scanner sc = new Scanner(System.in);
  // nhập một số nguyên
    System.out.printf("Nhập một số nguyên bất kì:");
    int a = sc.nextInt();
  // sử dụng  câu lệnh if
    if ( a == 0){
        System.out.printf("Số %d không phải số chẵn cũng không phải lẻ",a);
    } else if (a %2 == 0){
        System.out.printf("Số %d là số nguyên chia hết cho 2.",a);
    } else {
        System.out.printf("Số %d không chi hết cho 2", a);
    }
}
