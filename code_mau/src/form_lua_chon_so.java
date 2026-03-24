import java.util.Scanner;

public class form_lua_chon_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // biến
        int choice;
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

                    break;
                case 2: // chuẩn hóa họ tên

                    break;
                case 3: // kiểm tra email

                    break;
                case 4: // check sđt

                    break;
                case 5: // check pass

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

// relex:
// pass:  String passRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
//                // /^: bắt đầu chuỗi
//                //?= là positive lookahead giúp check xem một mẫu có tồn tại hay không
//                //.* : . 1 kí tự bất kì,* 1 or nhiều kí tự trong ngoặc
//String emailRegex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,6}$";
//String telRegex = "^0[35789][0-9]{8}";
// ví dụ
//case 4: // check sđt
//                   String telRegex = "^0[35789][0-9]{8}";
//                   if (tel.matches(telRegex)){   // dùng matches chứ không được dùng .equals() vì equals chỉ dùng cho trường hợp so sánh 2 chuỗi giống hệt 100% còn matches so sánh cú pháp
//                       System.out.println( tel + " Số điện thoại hợp lệ.");
//                   } else {
//                       System.out.println( tel + " Số điện thooại không hợp lệ.");
//                   }
//                    break;