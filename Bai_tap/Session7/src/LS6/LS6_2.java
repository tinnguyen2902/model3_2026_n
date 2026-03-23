package LS6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class LS6_2 {
    public static List<Category> categoryList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("******MENU**********");
            System.out.println("1.Thêm mới danh mục.");
            System.out.println("2.Hiển thị danh sách danh mục.");
            System.out.println("3.Cập nhật danh mục.");
            System.out.println("4.Xóa danh mục.");
            System.out.println("5.Tìm kiếm danh mục theo tên.");
            System.out.println("6.Thoát.");
            System.out.print("Nhập lựa chọn:");
            int chose = Integer.parseInt(sc.nextLine());
            switch (chose){
                case 1:// thêm mới
                    System.out.print("Nhập ID sản phẩm:");
                    String idAdd = sc.nextLine();
                    System.out.print("Nhập tên danh mục:");
                    String nameAdd = sc.nextLine();
                    System.out.print("Nhập mô tả danh mục:");
                    String desciptionAdd = sc.nextLine();
                    categoryList.add(new Category(idAdd,nameAdd,desciptionAdd));
                    System.out.println("Đã thêm thành công.");
                    break;
                case 2:// Hiển thị
                    if (categoryList.isEmpty()){
                        System.out.println("Danh mục trống.");
                        break;
                    }else {
                        System.out.println("Danh sách danh mục:");
                        for (Category category :categoryList){
                            System.out.println("1.ID:"+category.getId()
                                            +"\n2.Tên danh mục:"+category.getName()
                                            +"\n3.Miêu tả:"+category.getDescription()
                            );
                        }
                    }
                    break;
                case 3:// Cập nhật
                    System.out.print("Nhập id danh mục cần cập nhật:");
                    String IdUpdate = sc.nextLine();
                    boolean found = false;  // biến đổi tên
                    for (Category category : categoryList){
                        if (category.getId().equals(IdUpdate)){
                            System.out.print("Nhập tên mới:");
                            String newName = sc.nextLine();
                            category.setName(newName);
                            System.out.print("Nhập mô tả mới:");
                            String newDescription = sc.nextLine();
                            category.setDescription(newDescription);
                            found = true;
                            System.out.println("Đã cập nhật xong.");
                            break;
                        }
                    }
                    if (!found){
                            System.out.println("Sản phẩm không tồn tại.");
                        }
                    break;
                case 4:// xóa danh mục
                    System.out.println("Nhập ID danh mục cần xóa:");
                    String idDelete = sc.nextLine();
                    boolean foundDel = false;
                    for (int i = 0;i<categoryList.size();i++){
                        if (categoryList.get(i).getId().equals(idDelete)){
                            categoryList.remove(i);
                            foundDel = true;
                            System.out.println("Xóa thành công.");
                            break;
                        }
                    }if (!foundDel){
                    System.out.println("Sản phẩm không tồn tại.");
                }
                    break;
                case 5:// tìm theo tên
                    System.out.print("Nhập tên danh mục cần tìm.");
                    String seach = sc.nextLine().toLowerCase();  // toLowerCase giúp chuyển về chữ thường
                    boolean isExit = false;   // xác định thời điểm kết thúc
                    int count = 0;
                    System.out.println("KẾT QUẢ TÌM KIẾM:");
                    for (Category category : categoryList){
                        if (category.getName().toLowerCase().contains(seach)){
                            count++;
                            System.out.println("ID: " + category.getId()
                                        + "\nTên:" +category.getName()
                                        +"\nMô tả:" + category.getDescription());
                            isExit = true;
                        }
                    }
                    if (!isExit){
                        System.out.println("Không tìm thấy danh mục" +seach);
                    }else {
                        System.out.println("Tìm thấy " +count +" kết quả.");
                    }
                    break;
                case 6:// thoát
                    System.out.println("Thoát khỏi chương trình.");
                    break;
                default:
                    System.err.println("Giá trị không hợp lệ.");

            }
        }
    }
}