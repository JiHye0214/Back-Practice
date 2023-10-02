package 연산자.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.printf("sum : %d", num1+num2+num3);
        System.out.printf("\navg : %d", (int)(num1+num2+num3)/3);
        sc.close();
    }
}
