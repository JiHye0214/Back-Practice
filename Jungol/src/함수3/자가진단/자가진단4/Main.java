package 함수3.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static int function(int num) {
        if(num%10==0) return 0;
        int num2 = (num%10)*(num%10);
        return  num2 += function(num/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(function(num));
        sc.close();
    }
}