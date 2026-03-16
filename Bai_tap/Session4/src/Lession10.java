import java.util.Arrays;
import java.util.Scanner;

public class Lession10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo biến + mảng
        System.out.print("Nhập size mảng: ");
        int size = sc.nextInt();
        int arr [] = new int[size];
        for (int i = 0; i < size; i++){
            System.out.print("Giá trị thứ " + (i+1) +":");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng ban đầu:" + Arrays.toString(arr));



        // thanh menu
        while (true){
            System.out.println("****CHỨC NĂNG******");
            System.out.println("1.Thêm một phần tử vào mảng:");
            System.out.println("2.Xóa một phần tử trong mảng theo chỉ số(index):");
            System.out.println("3.Hiển thị mảng:");
            System.out.println("4.Sắp xếp mảng theo giá trị giảm dần");
            System.out.println("5.Tìm kiếm phần tử trong mảng:");
            System.out.println("6.Thoát");
            System.out.print("Nhập lựa chọn ");
            int inputNumber = sc.nextInt();
            switch (inputNumber){
                case 1: // Chức năng thêm một phần tử
                    System.out.print("Nhập giá trị cần thêm: ");
                    int valueToAdd = sc.nextInt();
                    System.out.print("Nhập vị trí muốn chèn (0 đến " + arr.length + "): ");
                    int indexToAdd = sc.nextInt();

                    // Kiểm tra vị trí chèn có hợp lệ không
                    if (indexToAdd < 0 || indexToAdd > arr.length) {
                        System.out.println("Vị trí không hợp lệ!");
                    } else {
                        // 1. Tạo mảng mới lớn hơn mảng cũ 1 đơn vị
                        int[] newArr = new int[arr.length + 1];

                        // 2. Sao chép dữ liệu và chèn phần tử mới
                        for (int i = 0; i < newArr.length; i++) {
                            if (i < indexToAdd) {
                                newArr[i] = arr[i]; // Giữ nguyên phần đầu
                            } else if (i == indexToAdd) {
                                newArr[i] = valueToAdd; // Chèn giá trị mới vào vị trí index
                            } else {
                                newArr[i] = arr[i - 1]; // Đẩy các phần tử sau lùi lại
                            }
                        }

                        // 3. QUAN TRỌNG: Cập nhật lại mảng arr để các chức năng khác sử dụng
                        arr = newArr;
                        System.out.println("Đã thêm thành công! Mảng mới là " + Arrays.toString(arr));
                    }
                    break; // Đừng quên break để không bị trôi xuống case 2
                case 2: // Chức năng xóa một phần tử theo index
                    System.out.print("Nhập chỉ số (index) cần xóa: ");
                    int indexToDelete = sc.nextInt();

                    // 1. Kiểm tra index có hợp lệ không (phải nằm trong khoảng từ 0 đến size-1)
                    if (indexToDelete < 0 || indexToDelete >= arr.length) {
                        System.out.println("Chỉ số không tồn tại!");
                    } else {
                        // 2. Tạo mảng mới nhỏ hơn mảng cũ 1 đơn vị
                        int[] newArr = new int[arr.length - 1];

                        // 3. Sao chép dữ liệu, bỏ qua phần tử tại indexToDelete
                        for (int i = 0; i < newArr.length; i++) {
                            if (i < indexToDelete) {
                                // Trước vị trí xóa: copy y hệt
                                newArr[i] = arr[i];
                            } else {
                                // Từ vị trí xóa trở đi: lấy phần tử kế tiếp của mảng cũ (i + 1)
                                newArr[i] = arr[i + 1];
                            }
                        }

                        // 4. Cập nhật lại mảng gốc và in kết quả
                        arr = newArr;
                        System.out.println("Đã xóa thành công!");
                        System.out.println("Mảng hiện tại: " + Arrays.toString(arr));
                    }
                    break;
                case 3: //  hiển thị mảng
                    if (arr.length == 0) {
                        System.out.println("Mảng hiện đang rỗng!");
                    } else {
                        System.out.println("Mảng hiện tại: " + Arrays.toString(arr));
                    }
                    break;
                case 4: // sắp xếp giảm dần
                    if (arr.length == 0) {
                        System.out.println("Mảng rỗng, không thể sắp xếp!");
                    } else {
                        // Thuật toán Selection Sort
                        for (int i = 0; i < arr.length - 1; i++) {
                            for (int j = i + 1; j < arr.length; j++) {
                                // Nếu phần tử đứng sau (j) lớn hơn phần tử hiện tại (i)
                                if (arr[j] > arr[i]) {
                                    // Hoán đổi (Swap)
                                    int temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }
                        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
                    }
                    break;
                case 5: // Chức năng tìm kiếm phần tử
                    if (arr.length == 0) {
                        System.out.println("Mảng rỗng, không có gì để tìm!");
                    } else {
                        System.out.print("Nhập giá trị cần tìm: ");
                        int valueToFind = sc.nextInt();
                        boolean found = false;
                        System.out.print("Kết quả: ");
                        for (int i = 0; i < arr.length; i++) {
                            if (arr[i] == valueToFind) {
                                System.out.print("Tìm thấy " + valueToFind + " tại vị trí (index): " + i + "  ");
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.print("Không tìm thấy giá trị " + valueToFind + " trong mảng.");
                   }
                        else {
                            System.out.println(); // Xuống dòng cho đẹp
                        }
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    return;
                default:
                    System.out.println("Giá trị không hợp lệ!");
            }
        }
        // nhập vào


    }
}