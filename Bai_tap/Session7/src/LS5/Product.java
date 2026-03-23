package LS5;

public class Product {
    // các thuộc tính
    private String id;
    private String name;
    private double price;
    // constractor: khởi tạo mặc định sau thuộc tính
    public Product(String id,String name,double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
 // tạo get & set nhanh: chuột phải => generate => get or set => chọn biến ( ấn giữa shift để chọn nhiều )
    // get : cho xem
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
  // set : cho sửa

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}