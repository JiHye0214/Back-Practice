package 함수2.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static int AbBig(int num1, int num2) {
        int big = (Math.abs(num1) > Math.abs(num2)) ? num1 : num2;
        return big;
    }
    public static double AbSmall(double num3, double num4) {
        double small = (Math.abs(num3) > Math.abs(num4)) ? num4 : num3;
        return small;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int result1 = AbBig(num1, num2);
        System.out.println(result1);

        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double result2 = AbSmall(num3, num4);
        System.out.printf("%.2f", result2);
        sc.close();
    }
}
