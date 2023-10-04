package 반복제어문3.형성평가.형성평가8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt(), num2=1;
        for(i=num; i>=1; i--){
            for(k=(num-i)*2; k>0; k--){
                System.out.print(' ');
            }
            for(j=i; j>=1; j--){
                System.out.print(num2);
                System.out.print(' ');
                num2++;
            }
            System.out.println();
        }
        sc.close();
    }
}