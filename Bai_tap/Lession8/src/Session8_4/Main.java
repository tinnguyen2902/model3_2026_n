package Session8_4;

public class Main  {
    static void main(String[] args) {
        // khởi tạo tài khoảng
        BankAccount bankAccount1 = new BankAccount("121211","Nguyễn Van A","012-121-2211");
        BankAccount bankAccount2 = new BankAccount("A12222","Lê Văn B","090-111-2121");
        // nạp vào tk 1
        bankAccount1.deposit(100);
        // chuyển từ 1 sang 2
        bankAccount1.withdraw(20);
        bankAccount2.deposit(20);
        // in số dư
        bankAccount1.displayBalance();
        bankAccount2.displayBalance();
    }
}