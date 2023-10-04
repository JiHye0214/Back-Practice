package 반복제어문3.형성평가.형성평가6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num2, num = sc.nextInt();
        for(i=1; i<=num*2-1; i+=2){
            for(k=(num*2-1)-i; k>0; k--){
                System.out.print(' ');
            }
            for(j=1; j<=(i+1)/2; j++){
                System.out.print(j);
                System.out.print(' ');
            }
            System.out.println();
        }
        sc.close();
    }
}
