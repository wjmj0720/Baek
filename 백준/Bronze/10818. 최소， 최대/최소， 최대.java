import java.util.Scanner;


    /*최댓값 최솟값 구하기*/
    public class Main {
        public static void main(String[] args) {
            //N 개의 정수 받기 -> 스캐너를 N번
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int[] arr = new int[a];

            arr[0] = sc.nextInt(); //arr[0]을 써줘야됨
            int max = arr[0];
            int min = arr[0];


           //입력받은 값만큼 배열 생성

          for (int i = 1; i < a; i++) {
              arr[i] = sc.nextInt();
              if(max < arr[i]) {
                  max = arr[i];
              }
              if(min > arr[i]) {
                  min = arr[i];
              }
          }
            //작은 값, 큰 값 출력
            System.out.print(min + " ");
            System.out.print(max);
        }

    }


