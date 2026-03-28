package Session8_3;
  // rectangle:  hình chữ nhật
public class Rectangle implements Colorable {
    private double dai;
    private double rong;
    private String color;
    //construction
    public Rectangle(double dai,double rong){
      this.dai = dai;
      this.rong = rong;
    }
    // ghi đè
    @Override
    public void setColor(String color){
      this.color = color;
    }

    public double getDai() {
      return dai;
    }

    public double getRong() {
      return rong;
    }

    public String getColor() {
      return color;
    }
  }