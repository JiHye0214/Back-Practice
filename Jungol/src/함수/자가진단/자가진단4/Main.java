package 함수.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    // 함수 생성
    public static void function(int num1, int num2, int num3){
        int big = (num1 > num2) ? num1 : num2;
        big = (num3 > big) ? num3 : big;
        System.out.println(big);
    }
    // 함수 실행
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt(), num3 = sc.nextInt();
        function(num1, num2, num3);

        sc.close();
    }
}
