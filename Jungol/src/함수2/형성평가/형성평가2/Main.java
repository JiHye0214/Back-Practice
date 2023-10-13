package 함수2.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static int function(double num1, double num2) {
        double big = (num1 > num2) ? Math.sqrt(num1) : Math.sqrt(num2);
        double small = (num1 > num2) ? Math.sqrt(num2) : Math.sqrt(num1);
        int result = (int)big - (int)small;
        if(small == (int)small) result++;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        int result = function(num1, num2);
        System.out.println(result);
        sc.close();
    }
}
