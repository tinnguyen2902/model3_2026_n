import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {
// tạo biến
        double salary ;
        int tongNhanVien = 0;
        double tongLuong = 0 ;
        double maxSalary = 0;
        double minSalary = 0;
        double bonus = 0;
        double total_bonus = 0;
    // thanh menu sẽ ở trong vòng lặp while với điều kiện true
    while (true){
        System.out.println("*********MENU NHẬP LƯƠNG******");
        System.out.println("1.Nhập lương nhân viên:");
        System.out.println("2.Hiển thị thống kê:");
        System.out.println("3.Tính tổng số tiền thưởng cho nhân viên:");
        System.out.println("4.Thoát:");
        System.out.print("Nhập lựa chọn:");
        Scanner sc = new Scanner(System.in);
        int inPutNumber = sc.nextInt();
    // tạo chức năng dùng switch
        switch (inPutNumber){
            case 1:  // chạy kiểm tra trong vòng lặp while
                    while (true){
                        System.out.print("Nhập số lương của nhân viên(Nhập -1) để thoát:");
                        salary = sc.nextDouble();
                        if ( salary == -1 ){
                            System.out.println("Thoát chương trình");
                            break;
                        } else if (salary < 0 || salary > 500000000){
                            System.out.println("Lương phải nằm trong phạm vi từ 0-500 triệu");
                            continue;
                        } else if (salary < 5000000) {
                            System.out.printf(" %.2f thu nhập thấp.\n",salary);
                        } else if (salary >= 5000000 && salary < 15000000 ) {
                            System.out.printf(" %.2f là thu nhập trung bình.\n",salary);
                        } else if (salary >= 15000000 && salary < 50000000 ) {
                            System.out.printf("%.2f là thu nhập khá. \n",salary);
                        } else if (salary >= 50000000 ) {
                            System.out.printf("%.2f là thu nhập cao. \n",salary);
                        }
                        // thực hiện thống kê
                        if (tongNhanVien == 0){
                            maxSalary = salary;
                            minSalary = salary;
                        } else {
                            if (salary > maxSalary) maxSalary = salary;
                            if (salary < minSalary) minSalary = salary;
                        }
                        // tính thưởng
                        if(salary < 5000000){
                            bonus = salary*0.05;
                        } else if (salary>=5000000 && salary<15000000) {
                            bonus = salary*0.1;
                        } else if (salary>=15000000 && salary < 50000000) {
                            bonus = salary*0.15;
                        } else if (salary >= 50000000 && salary < 100000000) {
                            bonus = salary*0.2;
                        } else {
                            bonus = salary*0.25;
                        }
                        total_bonus += bonus;
                        tongNhanVien ++;
                        tongLuong += salary;
                        System.out.println("Nhập tiếp hoặc -1 để thoát:");
                    }
                    break;
            case 2:
                if (tongNhanVien == 0){
                    System.out.println("Chưa có dữ liệu");
                } else {
                    System.out.println("Tổng số nhân viên:" + tongNhanVien);
                    System.out.println("Tổng lương:" + tongLuong);
                    System.out.println("Lương trung bình:" + (tongLuong/tongNhanVien));
                    System.out.println("Lương cao nhất:" + maxSalary);
                    System.out.println("Lương thấp nhất:" + minSalary);
                }
                break;
            case 3:
                if (tongNhanVien == 0){
                    System.out.println("Chưa có dữ liệu");
                } else {
                    System.out.println("Tổng tiền thưởng cần là:" + total_bonus);
                }
                break;
            case 4:
                System.out.println("Kết thúc chương trình.");
                return;
            default:
                System.out.println("Lựa chọn không phù hợp vui lòng chọn lại từ 1 đến 4.");
        }
    }
    }
}