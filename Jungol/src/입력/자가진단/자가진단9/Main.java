package 입력.자가진단.자가진단9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        System.out.printf("%.3f", num1);
        System.out.printf("\n%.3f", num2);
        System.out.printf("\n%.3f", num3);

        sc.close();
    }
}
