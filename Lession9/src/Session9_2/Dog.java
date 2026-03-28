package Session9_2;

public class Dog extends Pet {
    public Dog() {}
    public Dog(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void speak() {
        System.out.println("Gâu gâu");
    }
}