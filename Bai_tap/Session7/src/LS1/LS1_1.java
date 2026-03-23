package LS1;

public class LS1_1 {
    public static void main(String[] args) {
        // đối với giá trị mặc định
        LS1_2 gt1 = new LS1_2();
        System.out.println("Hình chữ nhật 1:");
        gt1.display();
        // đối với tham số
        LS1_2 gt2 = new LS1_2(5.0,3.0);
        System.out.println("================");
        System.out.println("Hình chữ nhật 2:");
        gt2.display();;
    }
}