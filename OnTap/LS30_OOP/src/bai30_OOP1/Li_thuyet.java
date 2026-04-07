// hướng đối tượng OOP
// constructor: gồm mặc định or đối số
// sau khi tạo constructor ở class rồi thì ở file main => gọi lại constractor đó + tên constractor = new Contractor(đối số_neeus có);
// sinhVien sv1 = new sinhVien(đối số); => viết ở file main
// khai báo biến dùng public
//khi chỉ muốn 1 or 1 nhóm người truy cập + thay đổi giá trị của biến private => get or set
    //get : xem thông tin
    // set: sửa thông tin
//30.4:  phương thức: ví dụ như in, tính điểm TB, tính lương
// 2 loại phương thức: có return or không có return
//******Chú ý thứ tự viết trong class: thuộc tính khai báo =>contructor => get & set => phương thức
// 2 dạng trỉiển khai của phương thức Support Method và Service Method
        // một lớp có nhiều phương thức
            // => chỉ dùng trong lớp đó thì gọi là support method  => dùng từ khóa private
            // => dùng ở ngoài thì gọi là service method   => dùng tư khóa public (công khai)

// tiếp tục từ 30.5





// ở bài 14 JDBC
// kết nối với database  => thêm database vào rồi viết mySQL chứ không phải ngược lại
// copy nguyên đoạn này vào vào file thay link khác vào truowsc ? là ok
//package LS13_5;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//public class Database {
//    public static Connection getConnection(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            // Thêm các tham số cấu hình để tránh lỗi Public Key và SSL
//            String url = "jdbc:mysql://localhost:3306/Movie?createDatabaseIfNotExist=true&useSSL=false&allowPublicKeyRetrieval=true";
//            String user = "root";
//            String password = "123";
//
//            Connection conn = DriverManager.getConnection(url, user, password);
//            if (conn != null) {
//                System.out.println("Kết nối Database thành công! (OK)");
//            }
//            return conn;
//        } catch (ClassNotFoundException | SQLException e) {
//            System.out.println("Kết nối thất bại! (NG)");
//            e.printStackTrace();
//            return null;
//        }
//    }
//}
// thứ tự viết code
// 1. database.sql => nền tảng của dữ liệu
// 2. database.java  => cổng kết nối giữa database với java
// 3. file đối tượng
// 4. validator.java => bộ lọc tránh sai
// 5. file Manager
// 6. file main
// form chung cho file validator
//package DatabaseLS1;  => thay thành tên của mình
//
//import java.util.Scanner;
//
//public class Validator {
//    private static final Scanner sc = new Scanner(System.in);
//
//    // 1. Kiểm tra Chuỗi (Không được để trống)
//    public static String readString(String message) {
//        while (true) {
//            System.out.print(message);
//            String input = sc.nextLine().trim();
//            if (!input.isEmpty()) {
//                return input;
//            }
//            System.err.println(">> Lỗi: Thông tin này không được để trống!");
//        }
//    }
//
//    // 2. Kiểm tra Số nguyên (Xử lý lỗi nhập chữ bằng try-catch)
//    public static int readInt(String message, int min, int max) {
//        while (true) {
//            try {
//                System.out.print(message);
//                int number = Integer.parseInt(sc.nextLine());
//                if (number >= min && number <= max) {
//                    return number;
//                }
//                System.err.println(">> Lỗi: Vui lòng nhập số trong khoảng [" + min + " - " + max + "]");
//            } catch (NumberFormatException e) {
//                System.err.println(">> Lỗi: Sai định dạng! Vui lòng chỉ nhập số nguyên.");
//            }
//        }
//    }
//
//    // 3. Kiểm tra Số thực (Dùng cho Điểm số)
//    public static double readDouble(String message, double min, double max) {
//        while (true) {
//            try {
//                System.out.print(message);
//                double number = Double.parseDouble(sc.nextLine());
//                if (number >= min && number <= max) {
//                    return number;
//                }
//                System.err.println(">> Lỗi: Giá trị phải từ " + min + " đến " + max);
//            } catch (NumberFormatException e) {
//                System.err.println(">> Lỗi: Sai định dạng! Vui lòng nhập số thực (VD: 7.5).");
//            }
//        }
//    }
//}