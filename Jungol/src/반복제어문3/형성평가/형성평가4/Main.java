package 반복제어문3.형성평가.형성평가4;

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
        for(i=3; i<=num*2-1; i+=2){
            for(k=0; k<num-(i+1)/2; k++){
                System.out.print(' ');
            }
            for(j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
