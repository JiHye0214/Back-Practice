package 연산자.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = 0;
        // 색깔 왜이래 ;; 안 되는 줄 알았잖아
        System.out.printf("%d > %d --- %d",num1, num2, result = (num1 > num2) ? 1 : 0);
        System.out.printf("\n%d < %d --- %d",num1, num2, result = (num1 < num2) ? 1 : 0);
        System.out.printf("\n%d >= %d --- %d",num1, num2, result = (num1 >= num2) ? 1 : 0);
        System.out.printf("\n%d <= %d --- %d",num1, num2, result = (num1 <= num2) ? 1 : 0);
        sc.close();
    }
}