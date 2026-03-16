import java.util.Scanner;

public class Lession_2 {
    public static void main(String[] args) {
        // tạo biến
        int tongHS = 0;
        double tongDiem = 0;
        double maxCore = -1;
        double minCore = 11;
        while (true){
            System.out.println("********MENU NHẬP ĐIỂM********");
            System.out.println("1.Nhập điểm học viên:");
            System.out.println("2.Hiển thị thống kê:");
            System.out.println("3.Thoát");
            System.out.print("Nhập lựa chọn của bạn:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            // tạo chức năng
            switch (choice){
                case 1:
                    System.out.print("Nhập điểm (Nhấn -1 để thoát):");
                    while (true){
                        double core = sc.nextDouble();  // biến điểm
                        if(core == -1){
                            System.out.println("Thoát chương trình.");
                            break;
                        } else if (core < 0 || core > 10) {
                            System.out.println("Điểm không hợp lệ !!! Vui lòng nhập từ 1 đến 10");
                            continue;
                        } else if (core < 5) {
                            System.out.println("Học lực yếu");
                        } else if (core >=5 && core <7) {
                            System.out.println("Học lực trung bình");
                        } else if (core >=7 && core <8) {
                            System.out.println("Học lực khá");
                        } else if (core >=8 && core <9) {
                            System.out.println("Học lực giỏi");
                        } else if (core >=9) {
                            System.out.println("Học lực xuất sắc");
                        }
                        // thống kê
                        tongHS++;
                        tongDiem += core;
                        if (core > maxCore){
                            maxCore = core;
                        } else if (core < minCore){
                            minCore = core;
                        }
                    }
                    break;
                case 2:
                    if (tongHS == 0){
                        System.out.println("Chưa có dữ liệu.");
                    } else {
                        System.out.println("Tổng số học sinh:" + tongHS);
                        System.out.println("Điểm trung bình:" + (tongDiem/tongHS));
                        System.out.println("Điểm cao nhất:" + maxCore);
                        System.out.println("Điểm thấp nhất:" + minCore);
                    }

                    break;
                case 3:
                    // chức năng 3 ok
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không phù hợp!!!Vui lòng chọn lại.");
        }
        }
    }
}