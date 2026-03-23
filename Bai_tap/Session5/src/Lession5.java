public class Lession5 {
    public static void main(String[] args) {
        // số lần lặp = a
        int a = 1000000;  // 1 tr dài quá không chạy
        // tạo chuỗi ban đầu
        String text = "Hello";
        String textAdd = "World";
        //TH string
        long startTimeStr = System.currentTimeMillis();
        for (int i = 0;i< a;i++){
            text += textAdd;
        }
        long endTimeStr = System.currentTimeMillis();
        System.out.println("Thời gian thực hiện với string:"+(endTimeStr-startTimeStr)+"ms");
        //TH StringBuilder
        StringBuilder textSB = new StringBuilder("Hello");
        long startTimeSB = System.currentTimeMillis();
        long endTimeSB = System.currentTimeMillis();
        for (int i = 0;i<a;i++){
            textSB.append(textAdd);
        }
        System.out.println("Thời gian thực hiện với StringBuilder:" +(endTimeSB-startTimeSB)+ "ms");
        // TH StringBuffer:
        StringBuffer textSBf = new StringBuffer("Hello");
        long startTimeSBf = System.currentTimeMillis();
        long endTimeSBf = System.currentTimeMillis();
        for (int i = 0;i<a;i++){
            textSBf.append(textAdd);
        }
        System.out.println("Thời gian thực hiện với StringBuffer:"+(endTimeSBf-startTimeSBf)+"ms");
        //Nhận xét
        System.out.println("String nối chậm,thời gian chờ lâu hơn tới 111951ms  ");
        System.out.println("StringBuilder nối nhanh hơn gấp nhiều lần hầu như 0 tốn");
        System.out.println("StringBuffer tốc độ bằng nhau với StringBuilder  hầu như không tốn");
    }
}