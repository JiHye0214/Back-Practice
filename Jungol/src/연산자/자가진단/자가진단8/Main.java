package 연산자.자가진단.자가진단8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // 논리곱(and) 논리합(or)
        if(num1 > num2 && num1 > num3){
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        if(num1 == num2 && num1 == num3){
            System.out.print("1 ");
        } else {
            System.out.print("0 ");
        }
        sc.close();
    }
}