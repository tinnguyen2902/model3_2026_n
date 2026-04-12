package LS6_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo 2 đối tượng
            // đối tượng 1
        System.out.print("Nhập tên người thứ 1: ");
        String name1 = sc.nextLine();
        System.out.print("Nhập tuổi ngươi thứ 1: ");
        int age1 = sc.nextInt();
        sc.nextLine();
        Person person1 = new Person(name1,age1);
        person1.display();
            // đối tượng 2
        System.out.print("Nhập tên người thứ 2: ");
        String name2 = sc.nextLine();
        System.out.print("Nhập tuổi người thứ 2: ");
        int age2 = sc.nextInt();
        Person person2 = new Person(name2,age2);
        person2.display();
        // chạy so sánh
        System.out.println("So sánh tuổi 2 nguời: ");
        sosanh(person1,person2);

    }
    public static void sosanh(Person p1,Person p2 ){
        if (p1.getAge() > p2.getAge()){
            System.out.println(p1.getName() + " lớn tuổi hơn " + p2.getName());
        } else if(p1.getAge() < p2.getAge()) {
            System.out.println(p2.getName() + " lớn tuổi hơn " +p1.getName());
        } else {
            System.out.println("Hai người bằng tuổi nhau");
        }
    }
}