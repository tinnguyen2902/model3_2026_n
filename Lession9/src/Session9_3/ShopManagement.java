package Session9_3;

import java.util.Scanner;

public class ShopManagement {
    static Categories[] arrCategories = new Categories[100];
    static int indexCatalog = 0;
    static Product[] arrProduct = new Product[100];
    static int indexProduct = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n******************SHOP MENU*******************");
            System.out.println("1. Quản lý danh mục sản phẩm");
            System.out.println("2. Quản lý sản phẩm");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1: categoryMenu(); break;
                    case 2: productMenu(); break;
                    case 3: System.exit(0);
                    default: System.out.println("Vui lòng chọn 1-3!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số!");
            }
        }
    }

    private static void categoryMenu() {
        while (true) {
            System.out.println("\n********************CATEGORIES MENU***********");
            System.out.println("1. Nhập thông tin các danh mục");
            System.out.println("2. Hiển thị thông tin các danh mục");
            System.out.println("3. Cập nhật thông tin danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Cập nhật trạng thái danh mục");
            System.out.println("6. Quay lại");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 6) break;
            switch (choice) {
                case 1:
                    System.out.print("Số danh mục cần thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        arrCategories[indexCatalog] = new Categories();
                        arrCategories[indexCatalog].inputData(scanner, arrCategories, indexCatalog);
                        indexCatalog++;
                    }
                    break;
                case 2:
                    if (indexCatalog == 0) System.out.println("Danh sách trống!");
                    for (int i = 0; i < indexCatalog; i++) arrCategories[i].displayData();
                    break;
                case 4:
                    System.out.print("Nhập mã danh mục cần xóa: ");
                    int idDel = Integer.parseInt(scanner.nextLine());
                    boolean hasProduct = false;
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getCatalogId() == idDel) { hasProduct = true; break; }
                    }
                    if (hasProduct) {
                        System.out.println("Danh mục có chứa sản phẩm, không thể xóa!");
                    } else {
                        boolean found = false;
                        for (int i = 0; i < indexCatalog; i++) {
                            if (arrCategories[i].getCatalogId() == idDel) {
                                // SỬA: Dịch chuyển mảng và gán null phần tử cuối
                                for (int j = i; j < indexCatalog - 1; j++) {
                                    arrCategories[j] = arrCategories[j + 1];
                                }
                                arrCategories[indexCatalog - 1] = null;
                                indexCatalog--;
                                found = true;
                                System.out.println("Xóa danh mục thành công!");
                                break; // SỬA: Thoát vòng lặp i ngay lập tức
                            }
                        }
                        if (!found) System.out.println("Mã danh mục không tồn tại!");
                    }
                    break;
                // ... (Các case khác giữ nguyên)
            }
        }
    }

    private static void productMenu() {
        while (true) {
            System.out.println("\n*******************PRODUCT MANAGEMENT*****************");
            System.out.println("1. Nhập thông tin các sản phẩm");
            System.out.println("2. Hiển thị thông tin các sản phẩm");
            System.out.println("3. Sắp xếp các sản phẩm theo giá");
            System.out.println("4. Cập nhật thông tin sản phẩm");
            System.out.println("5. Xóa sản phẩm theo mã");
            System.out.println("6. Tìm kiếm sản phẩm theo tên");
            System.out.println("7. Tìm kiếm trong khoảng giá");
            System.out.println("8. Quay lại");
            System.out.print("Lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 8) break;
            switch (choice) {
                case 1:
                    System.out.print("Số sản phẩm cần thêm: ");
                    int n = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < n; i++) {
                        arrProduct[indexProduct] = new Product();
                        arrProduct[indexProduct].inputData(scanner, arrProduct, indexProduct, arrCategories, indexCatalog);
                        indexProduct++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < indexProduct; i++) arrProduct[i].displayData();
                    break;
                case 3: // Sắp xếp giá tăng dần (Thuật toán sủi bọt)
                    for (int i = 0; i < indexProduct - 1; i++) {
                        for (int j = i + 1; j < indexProduct; j++) {
                            if (arrProduct[i].getPrice() > arrProduct[j].getPrice()) {
                                Product temp = arrProduct[i];
                                arrProduct[i] = arrProduct[j];
                                arrProduct[j] = temp;
                            }
                        }
                    }
                    System.out.println("Đã sắp xếp giá tăng dần!");
                    break;
                case 4: // SỬA: Bổ sung code cập nhật sản phẩm
                    System.out.print("Nhập mã SP cần sửa: ");
                    String idUpdate = scanner.nextLine();
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getProductId().equals(idUpdate)) {
                            arrProduct[i].inputData(scanner, arrProduct, indexProduct, arrCategories, indexCatalog);
                            System.out.println("Cập nhật thành công!");
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.print("Nhập mã sản phẩm cần xóa: ");
                    String idDel = scanner.nextLine();
                    boolean foundDel = false;
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getProductId().equals(idDel)) {
                            for (int j = i; j < indexProduct - 1; j++) {
                                arrProduct[j] = arrProduct[j + 1];
                            }
                            arrProduct[indexProduct - 1] = null;
                            indexProduct--;
                            foundDel = true;
                            System.out.println("Xóa sản phẩm thành công!");
                            break;
                        }
                    }
                    if(!foundDel) System.out.println("Mã sản phẩm không tồn tại!");
                    break;
                case 6: // SỬA: Bổ sung code tìm kiếm theo tên
                    System.out.print("Nhập tên cần tìm: ");
                    String searchName = scanner.nextLine();
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getProductName().toLowerCase().contains(searchName.toLowerCase())) {
                            arrProduct[i].displayData();
                        }
                    }
                    break;
                case 7:
                    System.out.print("Giá min: "); float min = Float.parseFloat(scanner.nextLine());
                    System.out.print("Giá max: "); float max = Float.parseFloat(scanner.nextLine());
                    for (int i = 0; i < indexProduct; i++) {
                        if (arrProduct[i].getPrice() >= min && arrProduct[i].getPrice() <= max) arrProduct[i].displayData();
                    }
                    break;
            }
        }
    }
}