package Session8_3;
  //circle : vòng tròn
public class Circle implements Colorable {
      private double banKinh;
      private String color;
      //construction
      public Circle(double banKinh) {
          this.banKinh = banKinh;
      }

      @Override
      public void setColor(String color){
          this.color = color;
      }

      public double getBanKinh() {
          return banKinh;
      }

      public String getColor() {
          return color;
      }
  }