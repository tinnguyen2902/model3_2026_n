package LS1;

public class LS1_2 {
    // thuộc tính chiiều dài, chiều rộng
    private double dai;
    private double rong;

    // khởi tạo mặc định
    public LS1_2(){
        this.dai = 1;
        this.rong = 1;
    }
    // khởi tạo tham số
    public LS1_2(double dai,double rong){
        this.dai = dai;
        this.rong = rong;
    }
    // tính diện tích
    public double dienTich(){
        return dai*rong;
    }
    // tính chu vi
    public double chuVi(){
        return (dai+rong)*2;
    }
   // in ra màn hình
   public void display(){
       System.out.println("Chiều dài:" + dai);
       System.out.println("Chiều rộng:" + rong);
       System.out.println("Diện tích:" + dienTich());
       System.out.println("Chu vi:" + chuVi());
   }
}