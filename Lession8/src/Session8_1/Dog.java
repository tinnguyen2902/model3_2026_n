package Session8_1;

public class Dog extends Animals {
    // thêm thuộc tính
    private String breed;
    //contruction
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    //ghi đè phương thức makeSound để trả về âm thanh của chó
    @Override
    public String makeSound (){
        return "WOOF WOOFFF";
    }
    // hiển thị thêm giống chó
    @Override
    public void displayInto(){
        super.displayInto();
        System.out.println("Giống chó:" +breed );
    }
}