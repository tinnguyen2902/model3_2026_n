package Session8_6;

public class Book {

        // thuộc tính
        private String title;
        private String author;
        private String isbn;
        private int year;

        //construction có tham số

    public Book(String title, String author, String isbn, int year) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.year = year;
    }
        //phương thức getDetails
    public String getDetails(){
        return "\n-Tiêu đề :" +title+ "\n-Tác giả : " + author + "\n-Mã ISBN " + isbn + "\n-Năm xuất bản: " +year;
    }
    public String getIsbn(){
        return "Năm xuất bản: " +isbn;
    }

}