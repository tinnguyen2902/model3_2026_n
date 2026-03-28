package Session8_9;

public class Main {
    public static void main(String[] args) {
        Garage myGarage = new Garage();

        // Thêm xe
        myGarage.addCar(new ElectricCar("Tesla Model 3", 2023, 45000));
        myGarage.addCar(new GasCar("Toyota Camry", 2022, 30000));

        // Thực hiện các hành động hàng loạt
        myGarage.startAll();
        myGarage.refuelAll();
        myGarage.stopAll();
    }
}