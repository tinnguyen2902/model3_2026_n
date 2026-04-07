package LS13_5;

import java.util.Date;

public class Movie {
   // thuộc tính
    private int idPhim;
    private String tieuDe;
    private int namPhatHanh;
   // construction
        // không đối số
    public Movie() {
    }
        // có đối số
    public Movie(int idPhim, String tieuDe, int namPhatHanh) {
        this.idPhim = idPhim;
        this.tieuDe = tieuDe;
        this.namPhatHanh = namPhatHanh;
    }
    // get & set

    public int getIdPhim() {
        return idPhim;
    }

    public void setIdPhim(int idPhim) {
        this.idPhim = idPhim;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public int getNamPhatHanh() {
        return namPhatHanh;
    }

    public void setNamPhatHanh(int namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

    // phương thức display
    public void display() {
        System.out.printf("ID: %d | Tiêu đề: %s | Năm: %d\n", idPhim, tieuDe, namPhatHanh);
    }
}