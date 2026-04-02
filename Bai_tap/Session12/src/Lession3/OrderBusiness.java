package Lession3;


import java.util.*;
import java.util.stream.Collectors;

public class OrderBusiness {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Scanner scanner) {
        Order order = new Order();
        order.inputData(scanner);
        orderList.add(order);
        System.out.println("Thêm đơn hàng thành công!");
    }

    public void displaySortedByAmount() {
        orderList.stream()
                .sorted(Comparator.comparingDouble(Order::getOrderAmount).reversed())
                .forEach(System.out::println);
    }

    public void updateStatus(Scanner scanner) {
        System.out.print("Nhập mã đơn hàng cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        Optional<Order> opt = orderList.stream().filter(o -> o.getOrderId() == id).findFirst();

        opt.ifPresentOrElse(order -> {
            String current = order.getStatus();
            if (current.equals("Pending")) {
                order.setStatus("Shipped");
                System.out.println("Đã chuyển trạng thái sang Shipped.");
            } else if (current.equals("Shipped")) {
                order.setStatus("Delivered");
                System.out.println("Đã chuyển trạng thái sang Delivered.");
            } else {
                System.out.println("Đơn hàng đã ở trạng thái cuối cùng (Delivered).");
            }
        }, () -> System.err.println("Không tìm thấy mã đơn hàng!"));
    }

    public void deleteOrder(Scanner scanner) {
        System.out.print("Nhập mã đơn hàng cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean removed = orderList.removeIf(o -> o.getOrderId() == id && o.getStatus().equals("Pending"));
        if (removed) System.out.println("Xóa thành công đơn hàng Pending.");
        else System.err.println("Không thể xóa (Mã sai hoặc trạng thái không phải Pending)!");
    }

    public void searchByName(Scanner scanner) {
        System.out.print("Nhập tên khách hàng: ");
        String name = scanner.nextLine().toLowerCase();
        orderList.stream()
                .filter(o -> o.getCustomerName().toLowerCase().contains(name))
                .forEach(System.out::println);
    }

    public void reportTotal() {
        System.out.println("Tổng số đơn hàng: " + orderList.size());
    }

    public void reportRevenue() {
        double revenue = orderList.stream()
                .filter(o -> o.getStatus().equals("Delivered"))
                .mapToDouble(Order::getOrderAmount).sum();
        System.out.println("Tổng doanh thu đơn Delivered: " + revenue);
    }

    public void reportByStatus() {
        Map<String, Long> stats = orderList.stream()
                .collect(Collectors.groupingBy(Order::getStatus, Collectors.counting()));
        stats.forEach((status, count) -> System.out.println(status + ": " + count));
    }

    public void findMaxAmount() {
        orderList.stream()
                .max(Comparator.comparingDouble(Order::getOrderAmount))
                .ifPresentOrElse(System.out::println, () -> System.out.println("Danh sách trống."));
    }
}