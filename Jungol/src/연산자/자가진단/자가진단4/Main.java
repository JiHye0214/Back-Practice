package 연산자.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int num3 = (num1++)*(--num2);
        System.out.printf("%d %d %d", num1,num2,num3);

        sc.close();
    }
}
