package Session8_9;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
        System.out.println("Đã thêm xe " + car.getModel() + " vào gara.");
    }

    public void startAll() {
        System.out.println("\n--- Khởi động tất cả xe ---");
        for (Car car : cars) {
            System.out.println(car.start());
        }
    }

    public void stopAll() {
        System.out.println("\n--- Dừng tất cả xe ---");
        for (Car car : cars) {
            System.out.println(car.stop());
        }
    }

    public void refuelAll() {
        System.out.println("\n--- Nạp nhiên liệu cho tất cả xe ---");
        for (Car car : cars) {
            // Kiểm tra xem xe đó có triển khai Refuelable không
            if (car instanceof IRefuelable) {
                ((IRefuelable) car).refuel();
            }
        }
    }
}