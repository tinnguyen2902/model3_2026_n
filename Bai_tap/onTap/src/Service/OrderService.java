package Service;

import DAO.CustomerDAO;
import DAO.OrderDAO;
import DAO.OrderItemDAO;
import DAO.ProductDAO;
import Model.Customer;
import Model.Order;
import Model.Product;

import java.util.List;
import java.util.Scanner;

public class OrderService {
    // thêm khách hàng
    // mấy cái hiện ra để thêm khách hàng.
    // tạo hàm trước
   private CustomerDAO cusDAO = new CustomerDAO();
   private Scanner sc = new Scanner(System.in);
   private OrderItemDAO itemDAO = new OrderItemDAO();
   // rồi tạo phương thức sau
   public void addCustomer(){
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập tên khách hàng: ");
       String name = sc.nextLine();

       Customer c = new Customer(name);
       if (cusDAO.addCus(c)){
           System.out.println("Thêm thành công");
       } else {
           System.out.println("Thêm thất bại.");
       }
   }
   // thêm sản phẩm
   private ProductDAO proDAO = new ProductDAO();
    public void addProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm: ");
        String proName = sc.nextLine();
        System.out.print("Nhập giá: ");
        Double price = Double.parseDouble(sc.nextLine());
        Product p = new Product(proName,price);
        if (proDAO.addPro(p)){
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại.");
        }
    }
    // thêm đơn hàng
    private OrderDAO orDAO = new OrderDAO();
    public void addOr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID khách hàng: ");
        int cId = sc.nextInt();
        sc.nextLine();
        Order o = new Order();
        o.setC_id(cId);
        if (orDAO.addOrder(o)){
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại");
        }
    }
    // xem đơn hàng
    public void showAllOrders(){
        List<Order> list = orDAO.getAllOrder();
        if (list.isEmpty()){
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("\n ****DANH SÁCH ĐƠN HÀNG****");
            for (Order o:list){
                System.out.println(o.toString());
            }
        }
    }
    // tính tổng tiền
    public void callOrderTotal(){
        System.out.print("Nhập ID cần tính: ");
        int orderID = sc.nextInt();
        sc.nextLine();  // chống trôi lệnh
        double total = itemDAO.getTotalAmount(orderID);
        if (total>0){
            System.out.println("******************");
            System.out.printf("Tổng đơn hàng ID %d là: %.2f VND\n", orderID,total);
        }else {
            System.out.println("Đơn hàng không tồn tại.");
        }
    }
    // xóa đơn hàng
    public  void delOr(){
        System.out.print("Nhập ID đơn hàng: ");
        int orderID = sc.nextInt();
        sc.nextLine();
        System.out.println("Xác nhận xóa:(Y/N): ");
        String confirm = sc.nextLine();
        if (confirm.equalsIgnoreCase("Y")) {
            if (itemDAO.delOrrder(orderID)) {
                System.out.println("Xóa thành công.");
            } else {
                System.out.println("Xóa thất bại.");
            }
        }else {
            System.out.println("Tạm dừng xóa.");
        }
    }
}