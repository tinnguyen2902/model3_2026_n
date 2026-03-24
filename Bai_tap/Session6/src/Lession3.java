import java.util.Scanner;

public class Lession3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // biến
        String[] allBsx = new String[1000];  // mảng chứa all biển số xe
        int choice;
        int count = 0;  // biến đếm số lượng
        String bsx = "";
        String maTinh = "";
        // sườn bài
        do {
            System.out.println("**********QUẢN LÝ BIỂN SỐ XE************");
            System.out.println("1.Thêm các biển số xe.");
            System.out.println("2.Hiển thị danh sách biển số xe.");
            System.out.println("3.Tìm kiếm biển số xe.");
            System.out.println("4.Tìm kiếm biển số xe theo mã tỉnh.");
            System.out.println("5.Sắp xếp biển số xe tăng dần.");
            System.out.println("6.Thoát.");
            System.out.print("Nhập giá trị:");
            choice = Integer.parseInt(sc.nextLine());
            boolean isValue = false;
            switch (choice){
                case 1://thêm
                    isValue = false;
                    while (!isValue){
                        System.out.print("Nhập biển số xe: ");
                        bsx = sc.nextLine().trim();
                        String bsxRegex = "^[0-9]{2}[A-Z]-[0-9]{5}$";
                        if(bsx.matches(bsxRegex)){
                            allBsx[count] = bsx;
                            count++;
                            System.out.println("Đã thêm thành công.");
                            break;
                        } else {
                            System.out.println("Định dạng biển số không hợp lệ!!!");
                        }
                    }
                    break;
                case 2://hiển thị danh sách
                    if (count > 0){
                        System.out.println("Danh sách biển số xe: ");
                        for (int i = 0;i<count;i++){
                            System.out.println((i+1) +  ": " + allBsx[i]);
                        }
                    }else {
                        System.out.println("Danh sách rỗng.");
                    }
                    break;
                case 3://tìm kiếm biển
                    System.out.print("Nhập biển số xe cần tìm:");
                    String seach = sc.nextLine();
                    boolean found = false;
                    for (int i = 0;i<count;i++) {
                        if (seach.equals(allBsx[i])) {
                            System.out.println("Đã tìm thấy: " + seach + " tại vị trí " + (i + 1));
                            found = true;
                            break;
                        }
                    }
                        if (!found){
                            System.out.println("Biển số xe chưa được đăng kí.");
                        }
                    break;
                case 4://tìm kiếm theo mã tỉnh
                    System.out.print("Nhập mã tỉnh cần tìm:");
                    String seachTinh = sc.nextLine();
                    boolean found4 = false;
                    System.out.println("Các biển số mang mã tỉnh " +seachTinh +":");
                    for (int i = 0;i <count;i++ ) {
                        maTinh = allBsx[i].substring(0,2);
                        if (maTinh.equals(seachTinh)){
                                System.out.println((i + 1) + "." + allBsx[i]);
                                found4 = true;
                            }
                        }
                    if (!found4){
                            System.out.println("Không tìm thấy.");
                    }
                    break;
                case 5://Sắp xếp tăng
                    if (count >0 ){
                       for (int i = 0;i< count-1;i++){
                           for (int j=i+1;j<count;j++){
                               // tách mã tỉnh
                               String maTinhI = allBsx[i].substring(0,2);
                               String maTinhJ = allBsx[j].substring(0,2);
                               // nếu mã j>i thì đổi chỗ
                               if(maTinhI.compareTo(maTinhJ)>0){
                                   String temp = allBsx[i];
                                   allBsx[i] = allBsx[j];
                                   allBsx[j] = temp;
                               }
                           }
                       }
                        System.out.println("Danh sách sau khi sắp xếp.");
                       for (int i = 0;i<count;i++){
                           System.out.println((i+1)+":"+allBsx[i]);
                       }
                    }else {
                        System.out.println("Dữ liệu không có nên không thể sắp xếp.");
                    }
                    break;
                case 6://thoát
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Vui lòng nhập giá trị trong phạm vi 1-6:");
                    break;
            }
        }while (choice !=6);
    }
}