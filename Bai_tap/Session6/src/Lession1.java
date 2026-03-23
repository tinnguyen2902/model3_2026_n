import java.util.Scanner;

public class Lession1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // biến
        // mảng chứa điểm sinh viên => không biết độ dài => ghi độ dài nhiều lên (1000)
        float[] marks = new float[1000];
        // khai báo và khởi tạo phần tử min chưa lưu điểm
        int currentIndex = 0;
        // HIỂN THỊ ra màn hình
        while (true){
            System.out.println("********QUẢN LÝ ĐIỂM SINH VIÊN");
            System.out.println("1.Nhập danh sách điểm sinh viên.");
            System.out.println("2.In danh sách điểm.");
            System.out.println("3.Tính điểm trung bình các sinh viên.");
            System.out.println("4.Tìm điểm cao nhất & thấp nhất");
            System.out.println("5.Đếm số lượng sinh viên đạt và trược");
            System.out.println("6.Sắp xếp điểm tăng dần.");
            System.out.println("7.Thống kê số lượng sinh viên giỏi và xuất sắc.");
            System.out.println("8.Thoát.");
            System.out.printf("Nhập lựa chọn: ");
            int choice = sc.nextInt();
            // chức năng
            switch (choice){
                case 1: // 1
                    System.out.println("Nhập số lượng sinh viên: ");
                    int n= Integer.parseInt(sc.nextLine());
                    for (int i = 0;i<n;i++){
                        System.out.println("Nhập điểm sinh viên:");
                        marks[i] = Float.parseFloat(sc.nextLine());
                        currentIndex++;
                    }
                    break;
                case 2: // 2
                    System.out.println("Danh sách điểm sinh viên:");
                    for (int i = 0;i < currentIndex;i++){
                        System.out.println("%.f\t",marks[i]);
                    }
                    System.out.println();
                    break;
                case 3: // 3
                    float sumMarks = 0;
                    for (int i = 0;i<currentIndex;i++){
                        sumMarks += marks[i];
                    }
                    System.out.println("Điểm trung bình :"+(sumMarks/currentIndex));
                    break;
                case 4: // 4
                    float min = marks[0];
                    float max = marks[0];
                    for (int i = 0;i < currentIndex;i++){
                        if(min > marks[i]){
                            min = marks[i];
                        }
                        if (max < marks[i] ){
                            max = marks[i];
                        }
                    }
                    System.out.println("Điểm cao nhất : %.1f - Điểm thấp nhất : %.1f",max,min);
                    break;
                case 5: // 5
                    int countPass = 0;
                    int countFail = 0;
                    for (int i = 0;i<currentIndex;i++){
                        if (marks[i]> 5){
                            countPass++;
                        } else {
                            countFail++;
                        }
                    }
                    System.out.println("Số lượng đậu:", +countPass);
                    System.out.println("Số lượng không đậu:",+countFail);

                    break;
                case 6: // 6

                    break;
                case 7: // 7

                    break;
                case 8: // 8
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.err.println("Lựa chọn không phù hợp!!! chọn lại.");
            }
        }

    }
}