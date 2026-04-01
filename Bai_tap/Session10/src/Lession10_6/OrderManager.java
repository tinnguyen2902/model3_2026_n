package Lession10_6;

import java.util.ArrayList;

public class OrderManager implements IManage<Order> {
    private ArrayList<Order> orders = new ArrayList<>();

    @Override
    public void add(Order item) {
        orders.add(item);
        System.out.println("Thêm đơn hàng thành công!");
    }

    @Override
    public void update(int index, Order item) {
        orders.set(index, item);
        System.out.println("Cập nhật đơn hàng thành công!");
    }

    @Override
    public void delete(int index) {
        orders.remove(index);
        System.out.println("Xóa đơn hàng thành công!");
    }

    @Override
    public void display() {
        if (orders.isEmpty()) {
            System.out.println("Danh sách đơn hàng trống.");
        } else {
            System.out.println("--- DANH SÁCH ĐƠN HÀNG ---");
            for (Order o : orders) {
                System.out.println(o);
            }
        }
    }
    public int findIndexById(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}