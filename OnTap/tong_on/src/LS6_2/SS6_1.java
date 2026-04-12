package LS6_2;

import java.util.Scanner;

public class SS6_1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();
        System.out.print("Nhập giá ban đầu: ");
        Double priceOld = sc.nextDouble();
        book bk = new book(title,author,priceOld);
        bk.display1();
        System.out.print("Nhập giá thay đổi: ");
        Double priceNew = sc.nextDouble();
        bk.setPrice(priceNew); // thay đổi nên dùng set
        System.out.println("Sau khi thay đổi: ");  // lấy ra nên dùng get
        bk.display2();
    }
}