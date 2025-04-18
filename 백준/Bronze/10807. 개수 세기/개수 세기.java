import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N개의 정수 받기
        int a = sc.nextInt();
        //N개의 정수들을 담기 위한 배열 생성
        int[] numbers = new int[a];

        for(int i=0 ; i < a ; i++) {
            // 숫자 X개
            int b = sc.nextInt();
            //적은 숫자들을 배열에 담음
            numbers[i] = b;
        }
            //배열을 순회하면서 원하는 숫자의 개수를 누적시켜줄 count 선언
        int count = 0;
            //찾는 값
        int c = sc.nextInt();
            //순회하면서 카운트하기
            for(int num : numbers){
                if(num == c){
                    count++;
                }
        }
        System.out.println(count);
    }

}