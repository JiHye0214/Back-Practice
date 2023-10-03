package 선택제어문.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if(num1 > 0) System.out.println("plus");
        if(num1 == 0) System.out.println("zero");
        if(num1 < 0) System.out.println("minus");
        sc.close();
    }
}
