package Session8_1;

public class Main {
    public static void main(String[] args) {
        Animals[] animalsArray = new Animals[2];
        // tạo đối tượng cat & dog
        Dog dog1 = new Dog("Buddy", 3, "Golder Retriever");
        Cat cat1 = new Cat("Whiskers", 2, "Ghi");
        // thêm vào mảng
        animalsArray[0] = dog1;
        animalsArray[1] = cat1;
        // hiển thị thông tin và âm thanh của từng đối tượng
        for (Animals animals:animalsArray){
            animals.displayInto();
            System.out.println("Âm thanh: " + animals.makeSound());
            System.out.println();
        }
    }
}