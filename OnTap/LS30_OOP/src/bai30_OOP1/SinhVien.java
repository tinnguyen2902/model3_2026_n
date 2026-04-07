package bai30_OOP1;

public class SinhVien {
    // khởi tạo thuộc tính
    private String hoTen;
    private double diem;
    // constractor
        // không tham số
    public SinhVien() {
    }
        // có tham số


    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }



    // get & set : public :  mức độ trả về, String => kq trả về
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
    // phương thức
    // không có kiểu trả về
    public void hienThiThongTin(){
        System.out.println(hoTen + " : " +diem);
    }
    // phương thức có kiểu trả về
    public double tinhDiemTB(double diemToan, double diemVan){      // chú ý chỗ này tinhDiemTB = ... là sai không được dùng dấu bằng
        return (diemToan+diemVan)/2;
    }
    // phương thức toString

    @Override
    public String toString() {
        return "{" +
                "hoTen: '" + hoTen + '\'' +
                ", diem: " + diem +
                '}';
    }
    // support methor & service methor
    // support
    // check điểm khi nhập hồ sơ
    private boolean checkDiem(){
        return  this.diem >=24;
    }
    //service methor
    public void checkDiemHopLe(){
        if (checkDiem())
            System.out.println("OK");
    else
        System.out.println("NG");
    }
}