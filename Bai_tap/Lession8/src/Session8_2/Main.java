package Session8_2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota",120);
        Bike bike1 = new Bike("Honda",80);

        // gọi phương thức
        car1.start();
        car1.displayInfo();

        bike1.start();
        bike1.displayInfo();

    }
}