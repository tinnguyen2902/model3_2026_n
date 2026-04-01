package Lession10_5;
// dùng để lưu trữ thông tin
public class Invoice {
    private int id ;
    private String invoiceCode;
    private double amount;

    public Invoice(String invoiceCode, double amount , int id) {
        this.invoiceCode = invoiceCode;
        this.amount = amount;
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID : " + id + " , Mã hóa đơn: " + invoiceCode + ", Số tiền: " + amount;
    }

    public double getAmount() {
        return amount;
    }
    public int getId() {
        return id;
    }


    public String getInvoice() {
        return invoiceCode;
    }
}