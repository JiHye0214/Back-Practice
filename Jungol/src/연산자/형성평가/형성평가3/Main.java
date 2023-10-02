package 연산자.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("width = %d", num1 += 5);
        System.out.printf("\nlength = %d", num2 *= 2);
        System.out.printf("\narea = %d", num1*num2);

        sc.close();
    }
}
