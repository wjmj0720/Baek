
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*1. 시간 입력
-스캐너
-int a,b
*/
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
/*
2. 시간 계산
if b>60 --> a+1
if a >= 24 --> a=0
*/
        int result = 60*a + (b + c);
        int hour = result / 60;
        int min = result % 60;

        while(hour >= 24) {
            hour = hour - 24;
        }

/*
3. 시간 출력
*/
        System.out.print(hour);
        System.out.print(" ");
        System.out.println(min);

    }

}
