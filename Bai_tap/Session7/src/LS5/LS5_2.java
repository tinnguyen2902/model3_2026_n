package LS5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LS5_2 {
    private static List<Product> productList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Menu:");
            System.out.println("1:Thêm mới sản phẩm:");
            System.out.println("2:Hiển thị danh sách sản phẩm:");
            System.out.println("3:Cập nhật sản phẩm:");
            System.out.println("4:Xóa sản phẩm:");
            System.out.println("5:Thoát.");
            System.out.print("Nhập lựa chọn: ");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose){
            case 1: // Nhập sản phẩm
                System.out.print("Nhập ID sản phẩm:");
                String id = sc.nextLine();
                System.out.print("Nhập tên sản phẩm:");
                String name = sc.nextLine();
                System.out.print("Nhập giá sản phẩm:");
                double price = Double.parseDouble(sc.nextLine());
                productList.add(new Product(id,name,price));
                System.out.println("Sản phẩm đã được thêm.");
                break;
            case 2: // hiển thị danh sách sản phẩm
                // check trống
                if (productList.isEmpty()){
                    System.err.println("Danh sách trống.");
                    break;
                }
                System.out.println("Danh sách sản phẩm:");
                for (Product product : productList){
                    System.out.println("1.ID: " + product.getId()
                            + "\n2.Tên sản phẩm:" +product.getName()
                            + "\n3.Giá sản phẩm:" +product.getPrice());
                }
                break;
            case 3: // cập nhật sản phẩm
                System.out.print("Nhập ID sản phẩm cần sửa:");
                String upDateId = sc.nextLine();
                boolean foundUpdate = false;
                for (Product product : productList){
                    if (product.getId().equals(upDateId)){
                        System.out.print("Nhập tên mới:");
                        product.setName(sc.nextLine());
                        System.out.print("Nhập giá mới:");
                        product.setPrice(Double.parseDouble(sc.nextLine()));
                        foundUpdate = true;
                        System.out.println("Đã cập nhật xong.");
                        break;
                    }
                }
                if (!foundUpdate){
                System.err.println("Sản phẩm không tồn tại.");
            }
                break;
            case 4: // xóa sản phẩm
                System.out.print("Nhập ID sản phẩm cần xóa:");
                String deleteID = sc.nextLine();
                boolean foundDel = false;
                for (int i = 0;i< productList.size();i++){
                    if (productList.get(i).getId().equals(deleteID)){
                        productList.remove(i);
                        foundDel = true;
                        System.out.println("Xóa thành công.");
                        break;
                    }
                } if (!foundDel){
                System.out.println("Sản phẩm không tồn tại.");
            }
                break;
            case 5:
                System.out.println("Kết thúc chương trình.");
                return;
                default:
                System.err.println("Giá trị không hợp lệ.");
            }
        }
    }
}