import java.util.Scanner;
 void main() {
    Scanner sc = new Scanner(System.in);
    System.out.printf("Nhập số cần check:");
    int a = sc.nextInt();
    int banDau = a;
    int sum = 0;
    int temp = a;
    //

   while (a != 1 && a != 4){
       sum = 0;
       temp = a;
       while (temp > 0){
           int tach = temp % 10;
           sum += tach * tach;
           temp /= 10;
       }
       a = sum;
   } if (a == 1){
       System.out.printf("%d là số happy",banDau);
 } else {
         System.out.printf("%d không là số happy",banDau);
     }

}
