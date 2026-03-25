package LS7;

import java.util.Scanner;

public class LS7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử của phân số 1:");
        int a = sc.nextInt();
        System.out.print("Nhập mẫu của phân số 1:");
        int b = sc.nextInt();
        System.out.print("Nhập tử của phân số 2:");
        int c = sc.nextInt();
        System.out.print("Nhập mẫu của phân số 2:");
        int d = sc.nextInt();

        Fraction f1 = new Fraction(a,b);
        Fraction f2 = new Fraction(c,d);
        Fraction sum = f1.add(f2);
        System.out.println("Tổng : " +f1 + "+" +f2+ "=" +sum);
        Fraction hieu = f1.subtract(f2);
        System.out.println("Hiệu : " +f1 + "-" +f2 + "=" +hieu);
        Fraction tich = f1.multiply(f2);
        System.out.println("Tích : "+f1 + "*" +f2 + "=" +tich);
        Fraction thuong = f1.divide(f2);
        System.out.println("Tích : "+f1 + ":" +f2 + "=" +thuong);
        // tối giản
        f1.simplify();
        f2.simplify();
        System.out.println("Phân số 1 sau tối giản:" + f1);
        System.out.println("Phân số 2 sau tối giản:" + f2);
    }
}