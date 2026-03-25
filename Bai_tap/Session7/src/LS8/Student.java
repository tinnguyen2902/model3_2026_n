package LS8;

import java.util.Scanner;

public class Student {
    // các thuộc tính trong class
    private int id;
    private String name;
    private int age;
    private boolean gender;
    private String address;
    private String phoneNumber;
    // constructor: không tham số
    public Student() {
    }
    //phương thức
        // set & get
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // phương thức input
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập id học sinh: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên học sinh ");
        this.name = sc.nextLine();
        System.out.print("Nhập tuổi học sinh: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập giới tính học sinh(true = nam; nữ = false): ");
        this.gender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Nhập địa chỉ học sinh: ");
        this.address = sc.nextLine();
        System.out.print("Nhập số điện thoại học sinh ");
        String phone = sc.nextLine();
    }
    public void displayData(){
        System.out.println("ID sinh viên: " +id);
        System.out.println("Họ và tên học sinh : "+name );
        System.out.println("Tuổi sinh viên" +age);
        System.out.println("Giới tính: "+(gender ? "Nam" : "Nữ"));
        System.out.println("Địa chỉ: " +address);
        System.out.println("Số điện thoại: " +phoneNumber);
    }
}