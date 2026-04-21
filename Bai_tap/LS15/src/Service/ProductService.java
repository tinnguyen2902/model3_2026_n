package Service;

import DAO.ProductDAO;
import DAO.ProductItemDAO;
import Model.Product;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductService {
    private ProductItemDAO itemDAO = new ProductItemDAO();
    private ProductDAO proDAO = new ProductDAO();
    private Scanner sc = new Scanner(System.in);
    // 1. hiển thị danh sách
    public void showAllPro(){

        List<Product> list = itemDAO.getAllPro();
        if (list.isEmpty()){
            System.out.println("Danh sách trống.");
        } else {
            System.out.println("Danh sách sản phẩm");
            System.out.printf("%-5s | %-20s | %-10s | %-10s | %-10s\n", "ID", "Tên", "Giá", "Danh mục", "Trạng thái");
            for (Product p : list) {
                String statusLabel = p.isStatus() ? "Mở" : "Khóa";
                System.out.printf("%-5d | %-20s | %-10.2f | %-10s | %-10s\n",
                        p.getId(), p.getName(), p.getPrice(), p.getCatalog(), statusLabel);
            }
        }
    }
    // thêm khách hàng
    private ProductDAO proDao = new ProductDAO();
    public void addPro (){
        System.out.println("Nhập thông tin sản phẩm");
        System.out.print("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        Float price = sc.nextFloat();
        sc.nextLine();
        System.out.print("Nhập tiêu đề: ");
        String title = sc.nextLine();
        // mặc định ngaày nhập là hôm nay
        Date created = new Date();
        System.out.print("Nhập danh mục sản phẩm: ");
        String catalog = sc.nextLine();
        System.out.print("Nhập trạng thái(true/false)");
        Boolean status = sc.nextBoolean();
        sc.nextLine();
        // tạo đối tượng
        Product p = new Product(0,name,price,title,created,catalog,status);
        if (proDao.addPro(p)){
            System.out.println("Thêm thành công.");
        } else {
            System.out.println("Thêm thất bại");
        }
    }
    // cập nhật
    public void updatePro() {
        System.out.print("Nhập ID sản phẩm cần cập nhật: ");
        int id = sc.nextInt();
        sc.nextLine();

        // KIỂM TRA TỒN TẠI HAY KHÔNG
        Product existingProduct = proDao.findById(id);

        if (existingProduct == null) {
            System.out.println("Lỗi!!! Không tìm thấy sản phẩm với ID = " + id);
            return;
        }

        // Nếu tồn tại=> hiện thông tin cũ + yêu cầu nhập thông tin mới
        System.out.println("Sản phẩm tìm thấy: " + existingProduct.getName());
        System.out.println("--- NHẬP THÔNG TIN MỚI ---");

        System.out.print("Tên mới: ");
        String name = sc.nextLine();
        System.out.print("Giá mới: ");
        float price = sc.nextFloat();
        sc.nextLine();
        System.out.print("Tiêu đề mới: ");
        String title = sc.nextLine();
        System.out.print("Danh mục mới: ");
        String catalog = sc.nextLine();
        System.out.print("Trạng thái mới (true/false): ");
        boolean status = sc.nextBoolean();
        sc.nextLine();
     //tạo product
        Product p = new Product(id, name, price, title, null, catalog, status);
        if (proDao.updatePro(p)) {
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Cập nhật thất bại.");
        }
    }
    // xóa sp
    public void deletePro() {
        System.out.print("Nhập ID sản phẩm muốn xóa: ");
        int id = sc.nextInt();
        sc.nextLine();
        // 1. Kiểm tra tồn tại
        Product p = proDao.findById(id);
        if (p == null) {
            System.out.println(" Không tìm thấy sản phẩm có ID = " + id);
            return;
        }
        // 2. Xác nhận xóa
        System.out.printf("Bạn có chắc chắn muốn xóa sản phẩm: %s? (Y/N): ", p.getName());
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {
            if (proDao.deletePro(id)) {
                System.out.println("xóa sản phẩm thành công.");
            } else {
                System.out.println("xóa thất bại.");
            }
        } else {
            System.out.println("Hủy thao tác xóa.");
        }
    }
    // tìm kiếm
    public void searchPro() {
        System.out.print("Nhập tên sản phẩm bạn muốn tìm: ");
        String keyword = sc.nextLine();
        List<Product> list = proDao.searchByName(keyword);
        if (list.isEmpty()) {
            System.out.println("Không tìm thấy sản phẩm nào có tên: " + keyword);
        } else {
            System.out.println("\n--- KẾT QUẢ TÌM KIẾM ---");
            System.out.printf("%-5s | %-20s | %-10s | %-15s | %-10s\n", "ID", "Tên", "Giá", "Danh mục", "Trạng thái");
            System.out.println("--------------------------------------------------------------------------");

            for (Product p : list) {
                String statusLabel = p.isStatus() ? "Mở" : "Khóa";
                System.out.printf("%-5d | %-20s | %-10.2f | %-15s | %-10s\n",
                        p.getId(), p.getName(), p.getPrice(), p.getCatalog(), statusLabel);
            }
        }
    }
    // sắp xếp theo giá tăng
    public void showProByPrice() {
        List<Product> list = proDao.getAllProByPrice();

        if (list.isEmpty()) {
            System.out.println(" Không có sản phẩm.");
        } else {
            System.out.println("\n--- DANH SÁCH SẢN PHẨM THEO GIÁ TĂNG DẦN ---");
            System.out.printf("%-5s | %-20s | %-10s | %-15s | %-10s\n", "ID", "Tên", "Giá", "Danh mục", "Trạng thái");
            System.out.println("--------------------------------------------------------------------------");

            for (Product p : list) {
                String statusLabel = p.isStatus() ? "Mở" : "Khóa";
                System.out.printf("%-5d | %-20s | %-10.2f | %-15s | %-10s\n",
                        p.getId(), p.getName(), p.getPrice(), p.getCatalog(), statusLabel);
            }
        }
    }
    // thống kê số lượng theo danh mục
    public void showStatistics() {
        Map<String, Integer> stats = proDao.getCountByCa();

        if (stats.isEmpty()) {
            System.out.println("không có dữ liệu.");
        } else {
            System.out.println("\n--- THỐNG KÊ SẢN PHẨM THEO DANH MỤC ---");
            System.out.printf("%-20s | %-10s\n", "Danh mục", "Số lượng");
            System.out.println("---------------------------------------");

            // Duyệt Map để in kết quả
            for (Map.Entry<String, Integer> entry : stats.entrySet()) {
                System.out.printf("%-20s | %-10d\n", entry.getKey(), entry.getValue());
            }

            // Tính tổng tất cả sản phẩm
            int totalAll = stats.values().stream().mapToInt(Integer::intValue).sum();
            System.out.println("---------------------------------------");
            System.out.println("Tổng cộng tất cả sản phẩm: " + totalAll);
        }
    }
}