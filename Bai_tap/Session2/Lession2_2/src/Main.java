import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  Scanner sc = new Scanner(System.in);
  // nhập số liệu
    System.out.printf("Nhập một số từ 1 đến 7:");
    int a = sc.nextInt();
  // check số nhập vào 1 đến 7 hay ngoài khoảng đó
    if (a >= 1 &&  a <= 7){
        switch (a){
            case 1 : System.out.printf("%d là Chủ Nhật",a);
                break;
            case 2 : System.out.printf("%d là thứ hai",a);
                break;
            case 3 : System.out.printf("%d là thứ ba",a);
                break;
            case 4 : System.out.printf("%d là thứ tư",a);
                break;
            case 5 : System.out.printf("%d là thứ năm",a);
                break;
            case 6 : System.out.printf("%d là thứ sáu",a);
                break;
            case 7 : System.out.printf("%d là thứ bảy",a);
                break;
        }
    } else {
        System.out.printf("Vui lòng nhập giá trị từ 1 đến 7");
    }
}
