package LS8;

import java.util.Scanner;

public class LS8_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Student [] listStudend = new Student[100];
        int count = 0;
    do {
        System.out.println("Danh sách chức năng.");
        System.out.println("1.Hiển thị danh sách tất cả sinh viên.");
        System.out.println("2.Thêm mới sinh viên.");
        System.out.println("3.Sửa thông tin sinh viên dựa vào mã sinh viên.");
        System.out.println("4.Xóa sinh viên.");
        System.out.println("5.Thoát.");
        System.out.print("Nhập lựa chọn: ");
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                if (count == 0){
                    System.out.println("Danh sách trống");
                }else {
                    for (int i = 0;i<count;i++){
                        listStudend[i].displayData();
                    }
                }
                break;
            case 2:
                if (count < listStudend.length){
                    Student newStudent = new Student();
                    newStudent.inputData();
                    listStudend[count] = newStudent;
                    count++;
                    System.out.println("Thêm mới thành công.");
                } else {
                    System.out.println("Danh sách đầy");
                }
                break;
            case 3:
                System.out.print("Nhập ID muốn sửa: ");
                int editID = Integer.parseInt(sc.nextLine());
                boolean isFound = true;
                for (int i = 0;i< count;i++){
                    if(listStudend[i].getId() == editID){
                        System.out.println("Nhập thông tin mới: ");
                        listStudend[i].inputData();
                        isFound = true;
                        break;
                    }
                }
                if (!isFound) System.out.println("Không tìm thấp ID!!!");
                break;
            case 4:
                System.out.println("Kết thúc chương trình.");
                break;
            default:
                System.out.println("Vui lòng nhập số trong phạm vi từ 1 đến 4.");
        }
    } while (choice !=5);
    }
}