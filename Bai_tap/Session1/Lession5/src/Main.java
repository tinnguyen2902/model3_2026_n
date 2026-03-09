import java.util.Scanner; // Import thư viện để nhập dữ liệu

public class Main { // Phải khai báo Class tên là Main
    public static void main(String[] args) { // Phải có hàm main chuẩn
        Scanner sc = new Scanner(System.in); // Khởi tạo Scanner chuẩn
        // nhập 2 số vào
        System.out.printf("nhập phân số thứ 1:");
        System.out.printf("Tử số a:");
        int a = sc.nextInt();
        System.out.printf("Mẫu số b:");
        int b = sc.nextInt();
        System.out.printf("Nhập phân số thứ 2:");
        System.out.printf("Tử số c:");
        int c = sc.nextInt();
        System.out.printf("Mẫu số d:");
        int d = sc.nextInt();
        // kiểm tra mẫu khác 0 hay k
        if (b == 0 || d == 0){
            System.out.println("Lỗi !!! mẫu phải khác 0");
        } else {
            // nhập công thức
            int tuTong = a*d+b*c;
            int mauTong = b*d;
            // in kq ra man hinh
        System.out.printf("Tổng hai phân số %d/%d + %d/%d = %d/%d",a,b,c,b,tuTong,mauTong);
        }
        sc.close();
    }
}