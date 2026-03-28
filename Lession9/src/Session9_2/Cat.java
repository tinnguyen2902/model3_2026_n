package Session9_2;

public class Cat extends Pet {
    public Cat() {}
    public Cat(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void speak() {
        System.out.println("Meo meo");
    }
}