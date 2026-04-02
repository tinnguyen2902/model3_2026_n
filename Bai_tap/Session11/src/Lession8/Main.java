package Lession8;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(1, "Quý", LocalDate.of(2025, 3, 20), LocalDate.of(2025, 3, 25)),
                new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),
                new Order(3, "Minh", LocalDate.of(2025, 3, 22), LocalDate.of(2025, 3, 23)),
                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),
                new Order(5, "Việt", LocalDate.of(2025, 3, 23), LocalDate.of(2025, 3, 30))
        );

        // 1.các đơn hàng đã được giao
        System.out.println("--- ĐƠN HÀNG ĐÃ GIAO ---");
        orders.stream()
                .filter(o -> o.getDeliveryDate().isPresent())
                .map(Order::toDisplayString)
                .forEach(System.out::println);

        // 2.các đơn chưa được giao
        System.out.println("\n--- ĐƠN HÀNG CHƯA GIAO ---");
        orders.stream()
                .filter(o -> o.getDeliveryDate().isEmpty())
                .map(Order::toDisplayString)
                .forEach(System.out::println);

        // 3. Đếm số đơn hàng đã giao trong khoảng từ 17-23/03/2025
        LocalDate start = LocalDate.of(2025, 3, 17);
        LocalDate end = LocalDate.of(2025, 3, 23);

        long count = orders.stream()
                .filter(o -> o.getDeliveryDate().isPresent()) // Phải giao rồi mới kiểm tra ngày
                .filter(o -> {
                    LocalDate dDate = o.getDeliveryDate().get();
                    return !dDate.isBefore(start) && !dDate.isAfter(end);
                })
                .count();

        System.out.println("\nSố đơn đã giao từ " + start + " đến " + end + " là: " + count);
    }
}