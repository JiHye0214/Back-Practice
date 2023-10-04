package 반복제어문2.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num1 = sc.nextInt(), num2 = sc.nextInt();
        int small = (num1 > num2) ? num2 : num1;
        int big = (num1 > num2) ? num1 : num2;
        for(i=small; i<=big; i++){
            System.out.printf("%d ", i);
        }
        sc.close();
    }
}