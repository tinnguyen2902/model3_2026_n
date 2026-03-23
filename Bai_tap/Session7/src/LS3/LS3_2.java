package LS3;

import java.util.Scanner;

public class LS3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // đối tượng 1
        Person person1 = new Person();
        System.out.println("Nhập thông tin người thứ 1:");
        System.out.print("Nhập họ và tên:");
        person1.setName(sc.nextLine());
        System.out.print("Nhập tuổi:");
        person1.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("==================");
        // đối tượng 2
        Person person2 = new Person();
        System.out.println("Nhập thông tin người thứ 2:");
        System.out.print("Nhập họ và tên:");
        person2.setName(sc.nextLine());
        System.out.print("Nhập tuổi:");
        person2.setAge(sc.nextInt());

        // so sánh
        if (person1.getAge()> person2.getAge()){
            System.out.println(person1.getName()+ " lớn hơn "+ person2.getName());
        } else if (person1.getAge() < person2.getAge()) {
            System.out.println(person2.getName() + " lớn hơn " + person1.getName());
        } else {
            System.out.println("Hai người cùng tuổi.");
        }
    }
}