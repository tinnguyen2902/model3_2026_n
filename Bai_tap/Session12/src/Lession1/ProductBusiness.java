package ls.Lession1;

import java.util.*;

public class ProductBusiness {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Scanner scanner) {
        Product p = new Product();
        p.inputData(scanner, productList);
        productList.add(p);
        System.out.println("Thêm thành công!");
    }

    public void displayAll() {
        if (productList.isEmpty()) System.out.println("Danh sách trống.");
        else productList.forEach(System.out::println);
    }

    public void updateProduct(Scanner scanner) {
        System.out.print("Nhập mã ID cần sửa: ");
        int id = Integer.parseInt(scanner.nextLine());
        productList.stream().filter(p -> p.getProductId() == id).findFirst().ifPresentOrElse(
                p -> {
                    p.inputData(scanner, productList);
                    System.out.println("Cập nhật thành công!");
                },
                () -> System.err.println("Không tìm thấy mã ID này!")
        );
    }

    public void deleteProduct(Scanner scanner) {
        System.out.print("Nhập mã ID cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean removed = productList.removeIf(p -> p.getProductId() == id);
        if (removed) System.out.println("Xóa thành công!");
        else System.err.println("Không tìm thấy mã ID!");
    }

    public void searchByName(Scanner scanner) {
        System.out.print("Nhập tên cần tìm: ");
        String keyword = scanner.nextLine().toLowerCase();
        productList.stream()
                .filter(p -> p.getProductName().toLowerCase().contains(keyword))
                .forEach(System.out::println);
    }

    public void sortByPriceAsc() {
        productList.sort(Comparator.comparingDouble(Product::getPrice));
        System.out.println("Đã sắp xếp giá tăng dần.");
    }

    public void sortByQuantityDesc() {
        productList.sort(Comparator.comparingInt(Product::getQuantity).reversed());
        System.out.println("Đã sắp xếp số lượng giảm dần.");
    }
}