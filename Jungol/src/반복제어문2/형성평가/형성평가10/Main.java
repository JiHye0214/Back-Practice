package 반복제어문2.형성평가.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num1=sc.nextInt(), num2 = sc.nextInt();

        if(num1 > num2){
            for(j=1; j<=9; j++){
                for(i=num1; i>=num2; i--){
                    System.out.printf("%d * %d = %2d   ", i, j, i*j);
                }
                System.out.println();
            }
        } else {
            for(j=1; j<=9; j++){
                for(i=num1; i<=num2; i++){
                    System.out.printf("%d * %d = %2d   ", i, j, i*j);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
