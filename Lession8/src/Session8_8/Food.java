package Session8_8;
//chiết khấu 5%
public class Food extends Product{
    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return 5;
    }
}