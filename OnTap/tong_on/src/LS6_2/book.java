package LS6_2;

public class book {
    private String title;
    private String author;
    private double price;
    private double priceF;
    // contruction

    public book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.priceF = price;
    }

    // setter : thay đổi
    // getter : truy cập, lấy ra

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0){
            System.err.println("Giá không được âm.");
        } else {
            this.price = price;
        }
    }
    // in ra màn hình
    public void display1 (){
        System.out.println("Tên sách:" +title);
        System.out.println("Tác giả: " +author);
        System.out.println("Giá ban đầu: " +price);
    }
    public void display2 (){
        System.out.println("Tên sách:" +title);
        System.out.println("Tác giả: " +author);
        System.out.println("Giá ban đầu: " +priceF);
        System.out.println("Giá sau khi thay đổi:" +getPrice());
    }
}