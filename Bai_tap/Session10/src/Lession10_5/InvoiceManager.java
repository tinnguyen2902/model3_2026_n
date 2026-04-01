package Lession10_5;
// thực thi logic quản lý
import java.util.ArrayList;

public class InvoiceManager implements Manage<Invoice> {
    // Nên để private để đảm bảo tính đóng gói (Encapsulation)
    private ArrayList<Invoice> invoices;

    public InvoiceManager() {
        invoices = new ArrayList<>();
    }
    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }
    @Override
    public void add(Invoice invoice) {
        invoices.add(invoice);
    }

    @Override
    public void update(int index, Invoice invoice) {
        // Kiểm tra index cẩn thận
        if (index >= 0 && index < invoices.size()) {
            invoices.set(index, invoice);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < invoices.size()) {
            invoices.remove(index);
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ.");
        }
    }

    @Override
    public void display() {
        if (invoices.isEmpty()) {
            System.out.println("Chưa có hóa đơn nào trong danh sách.");
        } else {
            System.out.println("--- DANH SÁCH HÓA ĐƠN ---");
            for (int i = 0; i < invoices.size(); i++) {
                // Hiển thị i để người dùng biết index cần nhập khi muốn sửa/xóa
                System.out.println("Vị trí " + i + ": " + invoices.get(i));
            }
        }
    }
}