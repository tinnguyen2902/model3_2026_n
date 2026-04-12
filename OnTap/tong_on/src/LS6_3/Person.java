package LS6_3;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
    // hiển thị thông tin
    public void display(){
        System.out.println("Tên: " +name);
        System.out.println("Tuổi: " +age);
    }

}