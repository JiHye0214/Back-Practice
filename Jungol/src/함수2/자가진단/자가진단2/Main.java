package 함수2.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static String function(int num1, int num2) {

        switch (num1) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                for (int i = 1; i <= 31; i++) {
                    if (num2 == i) return "OK!";
                }
            case 4: case 6: case 9: case 11:
                for (int i = 1; i <= 30; i++) {
                    if (num2 == i) return "OK!";
                }
            case 2:
                for (int i = 1; i <= 28; i++) {
                    if (num2 == i) return "OK!";
                }
            default : return "BAD!";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String result = function(num1, num2);
        System.out.println(result);
        sc.close();
    }
}
