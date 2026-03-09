import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Nhập số nguyên dương cần check:");
    int a = sc.nextInt();
// tạo biến ban đầu và tổng
    int banDau = a ;
    int sum = 0 ;
// tạo biaến đếm số chữ số và biến
    int dem = 0; // biến đếm số chữ số
    int temp = a;  // đếm chữ số
    // đếm số chữ số
    while (temp > 0){
        temp /= 10;
        dem++;
    }
    // tìm số armstrong
    while (a > 0 ){
        // lấy từng số
        int tach = a % 10 ;   // tách số
        sum += Math.pow(tach,dem);  // lủy thừa
        a /= 10;  // bỏ số cuối
        }
        if (sum == banDau ){
            System.out.printf("%d là số Armstrong;",banDau);
        } else {
            System.out.printf("%d không phải là số Armstrong;",banDau);
        }t
}
