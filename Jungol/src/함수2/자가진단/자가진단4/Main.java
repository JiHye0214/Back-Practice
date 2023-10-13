package 함수2.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static double function(int area) {
        double length = area / 3.14;
        length = Math.sqrt(length); // Math.sqrt() : 루트 씌우기
        return length;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        double result = function(area);
        System.out.printf("%.2f", result);
        sc.close();
    }
}