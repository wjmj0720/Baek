import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //- 스캐너로 4의 배수 받기 -> 입력값 / 4 = i의 범위

            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();

        //-"long"  > 반복문으로 추가
        for (int i = 0; i < N/4; i++) {
            System.out.print("long ");
        }
            System.out.print("int");
        //- + "long int" 출력
    }

}