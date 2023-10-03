package 선택제어문.자가진단.자가진단9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // 삼항연산자 사용하기
        int small = (num1 > num2) ? num2 : num1;
        small = (small > num3) ? num3 : small;
        System.out.println(small);
        sc.close();
    }
}