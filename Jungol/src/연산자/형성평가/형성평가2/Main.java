package 연산자.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d / %d = %d...%d", num1, num2, num1/num2, num1%num2);
        sc.close();
    }
}