
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        //총 금액
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        // 총 물건 개수
        int object = sc.nextInt();

        //물건, 개수  --> 곱하고 더한 값 = 총 금액 -> Yes
        for (int i = 0; i < object; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum += (a * b);
        }


        if(sum == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }

}