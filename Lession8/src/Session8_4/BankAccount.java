package Session8_4;

public class BankAccount implements IBank{
    //tạo thuộc tính
    private String accountId;
    private double balance;
    private String userName;
    private String phoneNumber;
    //construction

    public BankAccount(String accountId, String userName, String phoneNumber) {
        this.accountId = accountId;
        this.balance = 0.0; // khởi tại dư bằng 0
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }
    // deposit: cập nhật số dư khi nhận tiền

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Đã nhận: "+amount);
    }
    // withdraw: cập nhật số dư khi rút tiền
    @Override
    public void withdraw(double amount) {
        if (amount <= balance ){
            balance -= amount;
            System.out.println("Rút thành công: " +amount );
        } else {
            System.out.println("Số dư không đủ");
        }
    }
    // displayBalance : hiển thị số dư
    public void displayBalance(){
        System.out.println("Số dư tài khoản: " +accountId +" là " +balance);
    }
    public String getAccountId(){
        return accountId;
    }
}