package 반복제어문3.자가진단.자가진단5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt();
        for(i=num*2-1; i>=1; i-=2){
            for(k=num-(i+1)/2; k>0; k--){
                System.out.print(' ');
            }
            for(j=i; j>=1; j--){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
