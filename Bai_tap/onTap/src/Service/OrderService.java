package Service;

import DAO.CustomerDAO;
import DAO.ProductDAO;
import Model.Customer;
import Model.Product;

import java.util.Scanner;

public class OrderService {
    // thêm khách hàng
    // mấy cái hiện ra để thêm khách hàng.
   private CustomerDAO cusDAO = new CustomerDAO();
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
        Product p = new Product();
        if (proDAO.addPro(p)){
            System.out.println("Thêm thành công");
        } else {
            System.out.println("Thêm thất bại.");
        }
    }
}