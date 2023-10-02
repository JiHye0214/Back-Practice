package 입력.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("height = ");
        int height = sc.nextInt();
        System.out.printf("Your height is %dcm.", height);
        sc.close();
    }
}

