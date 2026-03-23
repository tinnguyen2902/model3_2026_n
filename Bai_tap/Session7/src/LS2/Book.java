package LS2;

public class Book {
   // thuộc tính
    private String title;
    private String author;
    private double price;
    // phương thức getter
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    // phương thức setter
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        if(price < 0){
            System.err.println("Giá không hợp lệ");
        }else {
            this.price = price;
        }
    }
}