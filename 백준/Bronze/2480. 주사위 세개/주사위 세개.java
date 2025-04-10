import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;
        int total = 0;

        //1. 세 눈이 모두 똑같은 경우
        if(a == b && a == c){
            result = a;
            total = 10000+1000*result;
        }
        //2. 두 개의 눈만 같은 경우 >> 같은 눈 두 개
        else if(a == b || b == c ){
            result = b;
            total = 1000 + 100*result;
        }else if(a == c){
            result = c;
            total = 1000 + 100*result;
        }

        //3. 세 눈이 모두 다른 경우 >> 제일 큰 눈
        else if(a != b && a != c){
            result = Math.max(Math.max(a, b),c);
            total = 100*result;
        }
        System.out.println(total);
    }
}