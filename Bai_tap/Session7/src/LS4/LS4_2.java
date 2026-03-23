package LS4;

import java.util.Scanner;

public class LS4_2 {
    public static void main(String[] args) {
        // tạo mảng
        Student[] studentArr = new Student[5];
        // điền giá trị
        studentArr[0] = new Student("Nguyen Van A",20,"A1",7.6);
        studentArr[1] = new Student("Nguyen Van A1",22,"A2",6.6);
        studentArr[2] = new Student("Nguyen Van A2",21,"A3",8.6);
        studentArr[3] = new Student("Nguyen Van A3",22,"A1",9.6);
        studentArr[4] = new Student("Nguyen Van A4",20,"A5",4.6);

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm min:");
        double min = sc.nextDouble();
        System.out.print("Nhập điểm max:");
        double max = sc.nextDouble();
        // lọc kq điểm trong khoảng min-max
        for (Student s : studentArr){
            if (s.getAvgScore()>=min && s.getAvgScore()<=max){
                System.out.println(s);
            }
        }
    }
}