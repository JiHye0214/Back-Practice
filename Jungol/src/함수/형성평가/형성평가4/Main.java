package 함수.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static int function(int num1, int num2) {
        int big = (num1 > num2) ? num1*num1 : num2*num2;
        int small = (num1 > num2) ? num2*num2 : num1*num1;
        int result = big - small;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result = function(num1, num2);

        System.out.println(result);
        sc.close();
    }
}