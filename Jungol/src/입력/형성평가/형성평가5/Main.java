package 입력.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("yard? ");
        double yard = sc.nextDouble();

        System.out.printf("%.1fyard = %.1fcm", yard, yard*91.44);

        sc.close();
    }
}