import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        // tạo form 123,345,222.23
        DecimalFormat vnd = new DecimalFormat("#,###.00");
        // phần nhập vào
        System.out.println("========NHẬP THÔNG TIN HÓA ĐƠN========");
        System.out.print("Nhập tên khách hàng:");
        Scanner sc = new Scanner(System.in);
        String custom_name = sc.nextLine();
        System.out.print("Nhập tên sản phẩm:");
        String product_name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm:");
        double price = sc.nextDouble();
        System.out.print("Nhập vào số lượng mua:");
        int quantity = sc.nextInt();
        System.out.print("Khách có thẻ thành viên?(true/false):");
        boolean member_card = sc.nextBoolean();
        double total = price*quantity;
        double tax = total*0.08;

 // phần hóa đơn
        System.out.println("=========HÓA ĐƠN=========");
        System.out.println("Khách hàng: " + custom_name);
        System.out.println("Sản phẩm:" + product_name);
        System.out.println("Số lượng:" + quantity);
        System.out.println("Đơn giá:" + vnd.format(price));
        System.out.println("Thành tiền:" + vnd.format(total));
        if(member_card) {
            double member_price = total*0.1;
            double total_member = total*0.9+ tax;
            System.out.println("Giảm giá thành viên(10%):" + vnd.format(member_price));
            System.out.println("Tiền VAT:" + vnd.format(tax));
            System.out.println("Tổng thanh toán:" + vnd.format(total_member));
        } else {
            System.out.println("Giảm giá thành viên(10%): 0 ");
            System.out.println("Tiền VAT:" + vnd.format(tax));
            System.out.println("Tổng thanh toán:" + vnd.format(tax)+vnd.format(total));
        }

    }
}