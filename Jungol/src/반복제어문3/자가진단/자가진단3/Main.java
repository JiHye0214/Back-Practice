package 반복제어문3.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num = sc.nextInt();
        for(i=num; i>=1; i--){
            for(j=i; j>=1; j--){
                System.out.print('*');
            }
            System.out.println();
        }
        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}