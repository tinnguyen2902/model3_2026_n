import java.util.Scanner;

public class Lession2 {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello,Java World");
        System.out.println("Chuỗi ban đầu:"+text);
        //xóa
        text.delete(5,10);
        System.out.println("Chuỗi sau khi xóa:" +text);
        //thay thế
        int start = text.indexOf("World");
        if (start != -1){
            text.replace(start,start+5,"Universe");
        }
        System.out.println("Chuỗi sau khi thay thế:"+text);

    }
}