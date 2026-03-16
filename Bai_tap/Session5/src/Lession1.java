import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhập chuỗi
        System.out.print("Nhập chuỗi:");
        String input = sc.nextLine().trim();  // trim dùng để loại bỏ khoảng trống trước sau chuỗi
        // nhập từ cần tìm
        System.out.print("Nhập từ cần tìm:");
        String seach = sc.nextLine().trim();
        // tìm vị trí của từ trong chuỗi
        int index = input.indexOf(seach);
        // check + đưa ra kq
        if (index != -1){
            System.out.println("Từ \"" + seach + "\" xuất hiện tại vị trí:" + index);
        }else {
            System.out.println("Từ \""+seach+"\" không xuất hiện trong chuỗi.");
        }
    }
}