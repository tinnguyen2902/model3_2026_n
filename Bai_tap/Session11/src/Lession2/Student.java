package Lession2;

public class Student {
    private String name;
    private int age;
    private double grate;

    public Student(String name, int age, double grate) {
        this.name = name;
        this.age = age;
        this.grate = grate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrate() {
        return grate;
    }
    // in ra
    public void display(){
        System.out.println("| Name:   "+ name + "|age:  " +age +"| grate:    " +grate);
    }
}