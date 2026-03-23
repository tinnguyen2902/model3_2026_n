package LS3;

public class Person {
    private String name;
    private int age;
    // setter
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    // getter
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        if (age < 0 || age > 120){
            System.err.println("Số tuổi không hợp lệ:");
        } else {
            this.age = age;
        }
    }
}