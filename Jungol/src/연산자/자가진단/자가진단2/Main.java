package 연산자.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        num1 += 100;
        num2 %= 10;
        System.out.printf("%d %d", num1, num2);
        sc.close();
    }
}
