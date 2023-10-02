package 입력.자가진단.자가진단8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        char what = sc.next().charAt(0); // 문자로 입력 받기
        // String what = sc.nextLine(); // --> 문자열로 입력받기
        System.out.printf("%.2f", num1);
        System.out.printf("\n%.2f", num2);
        System.out.println();
        System.out.println(what);

        sc.close();
    }
}