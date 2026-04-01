package Lession10_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InvoiceManager manager = new InvoiceManager();
        Scanner scanner = new Scanner(System.in);
        int currentId = 1;

        while (true) {
            System.out.println("\n*************** MENU QUẢN LÝ HÓA ĐƠN ***************");
            System.out.println("1. Thêm hóa đơn");
            System.out.println("2. Sửa hóa đơn");
            System.out.println("3. Xóa hóa đơn");
            System.out.println("4. Hiển thị danh sách hóa đơn");
            System.out.println("5. Thoát");

            int choice = Input.getInt(scanner, "Lựa chọn của bạn: ");

            switch (choice) {
                case 1:
                    String invoiceCode = Input.getString(scanner, "Nhập mã hóa đơn: ");
                    double amount = Input.getDouble(scanner, "Nhập số tiền: ");
                    manager.add(new Invoice(invoiceCode, amount, currentId++));
                    System.out.println("Thêm thành công.");
                    break;

                case 2:
                    manager.display();
                    int idUpdate = Input.getInt(scanner, "Nhập ID cần sửa: ");
                    int indexUpdate = -1;

                    // CHỖ SỬA: Duyệt theo size của List thay vì currentId
                    // CHỖ SỬA: Gọi qua manager.getInvoices() thay vì InvoiceManager.invoices
                    for (int i = 0; i < manager.getInvoices().size(); i++) {
                        if (manager.getInvoices().get(i).getId() == idUpdate) {
                            indexUpdate = i;
                            break;
                        }
                    }

                    if (indexUpdate == -1) {
                        System.out.println("Không tìm thấy hóa đơn ID = " + idUpdate);
                    } else {
                        String newCode = Input.getString(scanner, "Mã mới: ");
                        double newAmount = Input.getDouble(scanner, "Tiền mới: ");
                        manager.update(indexUpdate, new Invoice(newCode, newAmount, idUpdate));
                        System.out.println("Sửa thành công.");
                    }
                    break;

                case 3:
                    manager.display();
                    int idDelete = Input.getInt(scanner, "Nhập ID cần xóa: ");
                    int indexDelete = -1;

                    // CHỖ SỬA: Duyệt theo size thực tế của List
                    for (int i = 0; i < manager.getInvoices().size(); i++) {
                        if (manager.getInvoices().get(i).getId() == idDelete) {
                            indexDelete = i;
                            break;
                        }
                    }

                    if (indexDelete == -1) {
                        System.out.println("Không tìm thấy hóa đơn ID = " + idDelete);
                    } else {
                        manager.delete(indexDelete);
                        System.out.println("Xóa thành công.");
                    }
                    break;

                case 4:
                    manager.display();
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}