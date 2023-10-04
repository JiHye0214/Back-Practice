package 반복제어문3.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num = sc.nextInt();
        for(i=1; i<=num;i++){
            for(j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }

        sc.close();
    }
}
