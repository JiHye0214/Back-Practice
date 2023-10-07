package 배열.자가진단.자가진단5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] array = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.printf("%.1f", (array[num1-1] + array[num2-1]));

        sc.close();
    }
}