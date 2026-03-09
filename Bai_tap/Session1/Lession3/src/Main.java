//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
     // nhập bán kính hình tròn
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập bán kính hình tròn:");
    // khai báo biến bán kính
    Double r = sc.nextDouble();
    // khai báo hằng số pi
    final float PI = 3.14f;
    // tính diện tích hình tròn
    double dienTich = PI*r*r;
    // in kq ra màn hình
    System.out.printf("Bán kính : %.2f", r);
    System.out.printf("Diện tích: %.2f",dienTich);
}
