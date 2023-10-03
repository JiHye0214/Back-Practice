package 선택제어문.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 삼항연산자로 절댓값 만들기 --> 안 까먹었군
        int minus = (num1 > num2) ? (num1 - num2) : (num2 - num1);
        System.out.println(minus);
        sc.close();
    }
}