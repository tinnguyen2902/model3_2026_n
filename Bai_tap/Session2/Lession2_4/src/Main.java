import java.util.Scanner;
void main() {
   Scanner sc = new Scanner(System.in);
   System.out.print("Nhập số tuổi của bạn:");
   int age ;

   while (!sc.hasNextInt()) {
       System.out.printf("vui lòng nhập số nguyên lớn hơn 0");
       sc.next();
   }
    age = sc.nextInt();
       if(age >0){
           System.out.printf("Tuổi của bạn là %d", age);
       } else {
           System.out.printf("vui lòng nhập số nguyên lớn hơn 0");
       }
       }

