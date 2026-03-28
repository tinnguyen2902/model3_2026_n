package Session8_9;

public abstract class Car {
    protected String model;
    protected int year;
    protected double price;

    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Phương thức trừu tượng
    public abstract String start();
    public abstract String stop();

    // Getter để dùng trong các lớp khác
    public String getModel() { return model; }
}