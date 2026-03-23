import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lession9 {
    public static void main(String[] args) {
        //Nhập vào link
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào link:");
        String link = sc.nextLine();
    // check link
        String regex = "^(https?)://([\\w.-]+\\.[a-z]{2,12})(/.*)?$";
        if (link.matches(regex)){
            System.out.println("Link hợp lệ");
        } else {
            System.out.println("Link không hợp lệ.");
        }
        // tách link
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(link);
        if (matcher.find()){
            String protocol = matcher.group(1);
            String domain = matcher.group(2);
            String path = matcher.group(3);
            // in
            System.out.println("Giao thức: " + protocol);
            System.out.println("Tên miền:" + domain);
            System.out.println("Đường dẫn: " + (path != null ? path: "Không có"));
        }

    }
}