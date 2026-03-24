import java.util.Scanner;

public class Lession2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // biến
        int choice;
        String name = "";
        String email = "";
        String tel = "";
        String pass = "";
        // sườn bài
        do {
            System.out.println("******QUẢN LÝ NGƯỜI DÙNG******");
            System.out.println("1.Nhập thông tin người dùng: ");
            System.out.println("2.Chuẩn hóa họ và tên: ");
            System.out.println("3.Kiểm tra email hợp lệ: ");
            System.out.println("4.Kiểm tra số điện thoại hợp lệ: ");
            System.out.println("5.Kiểm tra mật khẩu hợp lệ: ");
            System.out.println("6.Thoát : ");
            System.out.print("Nhập giá trị cần thực hiện: ");
            choice = Integer.parseInt(sc.nextLine());
            // chức năng
            switch (choice){
                case 1: // nhập thông tin người dùng
                    System.out.print("Nhập họ và tên: ");
                    name = sc.nextLine();
                    System.out.print("Nhập email: ");
                    email = sc.nextLine();
                    System.out.print("Nhập số điện thoại: ");
                    tel = sc.nextLine();
                    System.out.print("Nhập mật khẩu: ");
                    pass = sc.nextLine();
                    break;
                case 2: // chuẩn hóa họ tên
                // lấy name vào --> toLowerCase giúp biến đổi toàn bộ chuỗi sang chữ thường
                    name = name.toLowerCase().trim();
                 // tách từ dựa trên khoảng trắng relex "\\s+" trong đó \s = khoảng trắng. +: xuất hịene 1 or nhiều lần
                String[] words = name.split("\\s+");
                StringBuilder sb = new StringBuilder(); // tạo biến để lưu giá trị mới
                //dùng for để lặp
               for (String word : words){
                   sb.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1))
                           .append(" ");
                    }
               name = sb.toString().trim();
                    System.out.println("Tên sau chuẩn hóa là:" +name);
                    break;
                case 3: // kiểm tra email
                // regex của mail
                    String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
                    if (email.matches(emailRegex)){
                        System.out.println("Email hợp lệ.");
                    } else {
                        System.out.println("Email không hợp lệ.");
                    }
                    break;
                case 4: // check sđt
                   String telRegex = "^0[35789][0-9]{8}";
                   if (tel.matches(telRegex)){
                       System.out.println( tel + " Số điện thoại hợp lệ.");
                   } else {
                       System.out.println( tel + " Số điện thooại không hợp lệ.");
                   }
                    break;
                case 5: // check pass
                    String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
                    if (pass.matches(passRegex)){
                        System.out.println("Pass hợp lệ.");
                    } else {
                        System.out.println("Pass không hợp lệ.");
                    }
                    break;
                case 6: // thoát
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Vui lòng nhập giá trị trong phạm vi tư 1-6.");
            }
        } while (choice != 6);
    }
}