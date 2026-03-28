package Session8_3;

public class Main {
    static void main(String[] args) {
        // tạo đối tượng
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,6);
        Square square = new Square(5);

        // thiết lập màu
        circle.setColor("Red");
        rectangle.setColor("Blue");
        square.setColor("Black");
        // in
        System.out.println("Circle:" +circle.getColor());
        System.out.println("Rectangle:" +rectangle.getColor());
        System.out.println("Square:" +square.getColor());
    }
}