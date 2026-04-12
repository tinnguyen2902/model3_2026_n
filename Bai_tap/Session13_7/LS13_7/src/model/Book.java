package model;
// chức các thuộc tính & các phương thức set, get, contraction, toString,...
// setter : lấy thông tin
// getter : thay đổi thông tin
// connection:hàm khởi tạo để nhét dữ liệu vào
// toString : định hình nội dung hiển thị
public class Book {
    private int bookId;
    private String title;
    private String author;
    private double published_year;
    private double price;

    public Book() {
    }

    public Book(int bookId, String title, String author, double published_year, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.published_year = published_year;
        this.price = price;
    }
    // get & set

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPublished_year() {
        return published_year;
    }

    public void setPublished_year(double published_year) {
        this.published_year = published_year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("| %-5d | %-20s | %-15s | %-10.0f | %-10.2f |",
                bookId, title, author, published_year, price);
    }
}