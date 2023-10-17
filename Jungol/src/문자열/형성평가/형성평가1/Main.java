package 문자열.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char temp1 = sc.next().charAt(0);
        char temp2 = sc.next().charAt(0);

        int num1 = (int)temp1;
        int num2 = (int)temp2;

        int sum = num1 + num2;
        int sub = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.printf("%d %d", sum, sub);
        sc.close();
    }
}
