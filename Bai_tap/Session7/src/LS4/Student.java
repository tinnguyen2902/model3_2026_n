package LS4;

public class Student {
   private String name;
   private int age;
   private String s_Class;
   private double avgScore;

   //contractor
    public Student(String name,int age,String s_Class,double avgScore){
        this.name = name;
        this.age =age;
        this.s_Class = s_Class;
        this.avgScore = avgScore;
    }
    // getter
    public  String getName (){
        return  name;
    }
    public int getAge(){
        return age;
    }
    public  String getS_Class (){
        return s_Class;
    }
    public  double getAvgScore(){
        return avgScore;
    }
    @Override
    public String toString(){
        return "Tên:" +name + ",Tuổi:" + age + ", Lớp" + s_Class + ", Điểm trung bình: " + avgScore;
    }
}