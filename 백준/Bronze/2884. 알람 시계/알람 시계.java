import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H == 0 && M < 45) {
            H = 23;
            M = 15 + M;
        } else if (H == 0 && M >= 45) {
            H = 0;
            M = M - 45;
         
        } else if (H != 0 && M < 45) {
            H = H - 1;
            M = 15 + M;
        } else if (H != 0 && M >= 45) {
            M = M - 45;
        }
        System.out.print(H);
        System.out.print(" ");
        System.out.print(M);
    }
}