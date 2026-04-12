package LS6_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng học sinh: ");
        int n = sc.nextInt();
        // xóa bộ nhớ đệm để nhập tên với tuổi không bị bỏ qua tên
        sc.nextLine();
        // tạo mảng
        Student[] dshs = new Student[n];
        // dùng vòng lặp để nhập học sinh
        for (int i = 0;i<n;i++){
            System.out.print("Nhập thông tin người thứ " + (i+1) +":");
            System.out.print("Tên: ");
            // xóa bộ nhớ đệm để nhập tên với tuổi không bị bỏ qua tên
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            System.out.print("Lớp: ");
            String classHS = sc.nextLine();
            System.out.print("Điểm trung bình: ");
            Double avgScore = sc.nextDouble();
            // xóa bộ nhớ đệm để nhập tên với tuổi không bị bỏ qua tên
            sc.nextLine();
            dshs[i] = new Student(name,age,classHS,avgScore);
            System.out.println(dshs);
        }
    }

}