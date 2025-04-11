
import java.util.Scanner;

/*팩토리얼*/
public class Main {
    public static void main(String[] args) {


    //1. 값 입력 받기

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    //2. 입력 받은 값 = 반복문의 길이
    //3. i=1 부터 sum += i
        int sum = 0;

        for(int i=1; i<a+1 ; i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}
