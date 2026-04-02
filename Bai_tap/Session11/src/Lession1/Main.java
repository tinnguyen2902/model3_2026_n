package Lession1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Tạo danh sách
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Sử dụng Lambda
        System.out.println("Các số chẵn trong danh sách:");
        numbers.forEach(number->{
            if (number % 2 == 0){
                System.out.println(number);
            }
        });
        // tham chiếu tính tổng
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Tổng của tất cả các số trong danh sách:" +sum);
    }
}