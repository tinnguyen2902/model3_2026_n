package Session8_3;
    //square hình vuông
public class Square implements Colorable {
    private double doDai;
    private String color;
        //construction
        public Square(double doDai) {
            this.doDai = doDai;
        }
        // ghi đè
        @Override
        public void setColor(String color){
            this.color = color;
        }

        public double getDoDai() {
            return doDai;
        }

        public String getColor() {
            return color;
        }
    }