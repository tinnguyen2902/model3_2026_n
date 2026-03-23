package LS2;

public class LS2_2 {
    public static void main(String[] args) {
        // khởi tạo đối tượng
        Book myBook = new Book();
        // thiết lập thuộc tính
        myBook.setTitle("Java");
        myBook.setAuthor("Nguyen");
        // thiết lập giá
        myBook.setPrice(30.00);
        //in thông tin
        System.out.println("Tên sách:" +myBook.getTitle());
        System.out.println("Tên tác giả:" +myBook.getAuthor());
        System.out.println("Giá:"+myBook.getPrice());
        // đổi giá
        myBook.setPrice(100.0);
        System.out.println("Giá mới:"+myBook.getPrice());
        // giá không hợp lệ
        myBook.setPrice(-190);
        System.err.println("Giá mới:" +myBook.getPrice());
    }
}