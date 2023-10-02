package 입력.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 55;
        int num2 = 10;
        System.out.printf("%d - %d = %d", num1, num2, num1-num2);
        System.out.println();
        System.out.printf("%d - %d = %d", num1+1953, num2+1989, (num1+1953)-(num2+1989));
        sc.close();
    }
}