package LS6_4;

public class Student {
    private String name;
    private int age;
    private String className;
    private double avgScore;

    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
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

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }
    public void display(){
        System.out.println("***********");
        System.out.printf("| %15s | %-5d | %-10s | %-8.2f| \n",
                name,age,className,avgScore);
    }
}