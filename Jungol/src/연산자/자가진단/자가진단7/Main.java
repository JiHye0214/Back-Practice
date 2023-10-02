package 연산자.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // 논리곱(and) 논리합(or)
        if(num1 != 0 && num2 !=0){
            System.out.print("true ");
        } else {
            System.out.print("false ");
        }
        if(num1 != 0 || num2 != 0) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
        sc.close();
    }
}
