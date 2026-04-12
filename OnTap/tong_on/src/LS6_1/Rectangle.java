package LS6_1;

public class Rectangle {
    // thuộc tính
    private double length;
    private double width;
    private double area;
    private double perimeter;
//    public Rectangle() {
//        this.length = 1;
//        this.width = 1;
//    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    //tính diện tích

    public double getArea() {
        return length*width;
    }
    // tính chu vi

    public double getPerimeter() {
        return (length+width)*2;
    }

    // methor hiển thị ra màn hình
    public void display(){
        System.out.println("chiều dài:" +length);
        System.out.println("chiều rộng: " +width);
        System.out.println("Diện tích: " +getArea());
        System.out.println("Chu vi: "+getPerimeter());
    }

}