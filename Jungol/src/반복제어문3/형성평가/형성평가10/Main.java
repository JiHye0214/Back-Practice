package 반복제어문3.형성평가.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt(), num2 = 1;
        for(i=1; i<=num; i++){
            for(j=1; j<=num; j++){
                System.out.print(num2);
                System.out.print(' ');
                num2 += 2;
                if(num2 > 10){
                    num2 = 1;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}