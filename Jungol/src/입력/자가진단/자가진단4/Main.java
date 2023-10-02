package 입력.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chu = 49;
        double gravity = 0.2683;
        System.out.printf("%d * %.6f = %.6f", chu, gravity, chu*gravity);
        sc.close();
    }
}