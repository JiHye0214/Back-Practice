package 함수.자가진단.자가진단8;

import java.util.Scanner;

public class Main {
    public static void function(int num1, int num2) {
        int big = (num1 > num2) ? num1 : num2;
        int small = (num1 > num2) ? num2 : num1;

        for(int i=small; i<=big; i++){
            System.out.printf("== %ddan ==\n", i);
            for(int j=1; j<=9; j++){
                System.out.printf("%d * %d = %2d\n", i, j, i*j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        function(num1,num2);
        sc.close();
    }
}
