package Lession10_2;

public class Book {
    private String bookname;
    private String tacGia;
    private int namXB;

    public Book(String bookname, String tacGia, int namXB) {
        this.bookname = bookname;
        this.tacGia = tacGia;
        this.namXB = namXB;
    }

    public String getBookname() {
        return bookname;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getNamXB() {
        return namXB;
    }
    @Override
    public String toString(){
        return "Tên Sách" +bookname+",Tác giả" + tacGia+ ",Năm xuất bản:"+namXB;
    }
}