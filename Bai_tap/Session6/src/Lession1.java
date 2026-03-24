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
            System.out.println("\n********QUẢN LÝ ĐIỂM SINH VIÊN**************");
            System.out.println("1.Nhập danh sách điểm sinh viên.");
            System.out.println("2.In danh sách điểm.");
            System.out.println("3.Tính điểm trung bình các sinh viên.");
            System.out.println("4.Tìm điểm cao nhất & thấp nhất");
            System.out.println("5.Đếm số lượng sinh viên đạt và trược");
            System.out.println("6.Sắp xếp điểm tăng dần.");
            System.out.println("7.Thống kê số lượng sinh viên giỏi và xuất sắc.");
            System.out.println("8.Thoát.");
            System.out.printf("Nhập lựa chọn: ");
            int choice = Integer.parseInt(sc.nextLine());
            // chức năng
            switch (choice){
                case 1: // 1
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n= Integer.parseInt(sc.nextLine());
                    for (int i = 0;i<n;i++){
                        System.out.print("Nhập điểm sinh viên:");
                        marks[currentIndex] = Float.parseFloat(sc.nextLine());
                        currentIndex++;
                    }
                    break;
                case 2: // 2
                    System.out.println("Danh sách điểm sinh viên:");
                    for (int i = 0;i < currentIndex;i++){
                        System.out.printf("%.1f\t",marks[i]);
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
                    if (currentIndex == 0){
                        System.out.println("Chưa có điểm.");
                        break;
                }
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
                    System.out.printf("Điểm cao nhất : %.1f - Điểm thấp nhất : %.1f",max,min);
                    break;
                case 5: // 5
                    int countPass = 0;
                    int countFail = 0;
                    for (int i = 0;i<currentIndex;i++){
                        if (marks[i]>= 5){
                            countPass++;
                        } else {
                            countFail++;
                        }
                    }
                    System.out.println("Số lượng đậu: " +countPass);
                    System.out.println("Số lượng không đậu: "+countFail);
                    break;
                case 6: // sắp xếp điểm tăng dần
                   if (currentIndex == 0){
                       System.out.println("Danh sách trống.");
                   } else {
                       for (int i = 0;i<currentIndex-1;i++){
                           for (int j=i+1;j<currentIndex;j++){
                               if (marks[i] > marks[j]){
                                   float temp = marks[i];
                                   marks[i] = marks[j];
                                   marks[j] = temp;
                               }
                           }
                       }
                       System.out.println("Sắp xếp thành công. Chọn 2 để xem kết quả.");
                   }
                    break;
                case 7: // Thống kê số lượng sinh viên giỏi và xuất sắc
                    if (currentIndex == 0) {
                        System.out.println("Danh sách trống, không có dữ liệu để thống kê!");
                    } else {
                        int countGioi = 0;
                        int countXuatSac = 0;

                        for (int i = 0; i < currentIndex; i++) {
                            if (marks[i] >= 9.0) {
                                countXuatSac++;
                            } else if (marks[i] >= 8.0) {
                                countGioi++;
                            }
                        }

                        System.out.println("--- KẾT QUẢ THỐNG KÊ ---");
                        System.out.println("Số lượng sinh viên Xuất sắc (>= 9.0): " + countXuatSac);
                        System.out.println("Số lượng sinh viên Giỏi (8.0 - < 9.0): " + countGioi);
                    }
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