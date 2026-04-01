package Lession10_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudenManager manager = new StudenManager();
        Scanner scanner = new Scanner(System.in);
        String continueInput;
        do {
            String name = Input.getString(scanner,"Nhập vào tên SV:");
            int age = Input.getInt(scanner,"Nhâp vào tuổi SV:");
            double diemTB = Input.getDouble(scanner, "Nhập vào điểm trung bình:");
            Strudent strudent = new Strudent(name,age,diemTB);
            manager.addStudent(strudent);
            continueInput = Input.getString(scanner,"Bạn có muốn thêm sinh viên khác? (y/n):");
        }while (continueInput.equalsIgnoreCase("y"));
        System.out.println("\nDanh sách SV:");
        manager.hienHS();
        scanner.close();
    }
}