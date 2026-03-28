package Session8_2;

public class Car extends Vehicle {
    public Car(String name, int speed) {
        super(name, speed);   // gọi contruction của lớp cha
    }
    @Override
    public void displayInfo(){
        System.out.println("Car Name: " + getName()+"Speed: " +getSpeed() +"km/h");
    }
}