package bai30_OOP1;

public class Main {
    public static void main(String[] args) {
    // khởi tạo đối tượng thuộc class sv
        SinhVien sv1 = new SinhVien();  // tạo đối tượng sv1 là 1 đối tượng cụ thể
        SinhVien sv2 = new SinhVien();  // tạo đối tượng sv1 là 1 đối tượng cụ thể
        SinhVien sv3 = new SinhVien("Le va a",7);  // tạo đối tượng sv1 là 1 đối tượng cụ thể
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        sv3.hienThiThongTin();
      // xem thông tin bằng get
        System.out.println(sv3.getDiem());  // lấy ra điểm của sv3
        System.out.println(sv3.getHoTen());  // lấy ra họ tên của sv3
    // thay đổi tên or điểm or cả 2 bằng set
        // thay đổi tên sv3
        sv3.setHoTen("Nguyen van a");
        sv3.hienThiThongTin();  // hiển thị
        // thay đổi họ tên & điểm sv1
        sv1.setHoTen("Đã đổi tên");
        sv1.setDiem(8);
        sv1.hienThiThongTin();
    // text phương thức có kiểu trả về
        double diemTBsv3 = sv3.tinhDiemTB(5,7);
        System.out.println(diemTBsv3);
    // phương thức toString
        System.out.println(sv3);
    // methor
        // support -> chỉ phục vụ trong nội tại class đó nên không cần gọi từ bên ngoài
        // service methor
        sv3.checkDiemHopLe();

    }
}