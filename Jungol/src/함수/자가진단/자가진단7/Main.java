package 함수.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static int[] function(int num1, int num2) {
        int[] array = new int [2];
        if(num1 > num2){
            array[0] = num1 / 2;
            array[1] = num2 * 2;
        } else {
            array[0] = num1 * 2;
            array[1] = num2 / 2;
        }
        // 자바에서 리턴은 하나만 됨.
        // 두 개 해 주고 싶으면 배열 만들어야 됨
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[] result = function(num1, num2);

        // 출력은 메인에서
        System.out.printf("%d %d", result[0], result[1]);
        sc.close();
    }
}
