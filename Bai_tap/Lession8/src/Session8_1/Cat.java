package Session8_1;
// mặc định sẽ không có extends Amimals nên phải thêm định nghĩa lớp con vào sau
public class Cat extends Animals {
    private String furColor;
    //construction

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    // ghi đè để trả về âm thanh meo meo
            @Override
            public String makeSound(){
            return "MEO MEOO";
            }
    // ghi đè phương thức displayInto để hiển thị thêm màu lông
            @Override
            public void displayInto(){
            super.displayInto();
            System.out.println("Màu lông:" +furColor);
            }
}