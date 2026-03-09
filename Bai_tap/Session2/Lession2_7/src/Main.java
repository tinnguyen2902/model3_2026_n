 import java.util.Scanner;
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Nhập chiều dài cạnh thứ nhất:");
    int a = sc.nextInt();
    System.out.printf("Nhập chiều dài cạnh thứ hai:");
    int b = sc.nextInt();
    System.out.printf("Nhập chiều dài cạnh thứ ba:");
    int c = sc.nextInt();
    if(a+b>c && a+c>b && b+c>a){
        if (a==b && a==c && b==c) {
            System.out.printf("Đây là tam giác đều");
        } else if(a==b || a==c || b==c ){
            System.out.printf("Đây là tam giác cân");
        } else if ( a*a == b*b + c*c || b*b == a*a + c*c || c*c == b*b + a*a) {
            System.out.printf("Đây là tam giác vuông");
        } else {
            System.out.printf("Đây là tam giác thường");
        }
    } else {
        System.out.printf("Ba cạnh không tạo thành tam giác");
    }
    sc.close();
}
