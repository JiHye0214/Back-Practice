package 반복제어문3.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt();
        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print('*');
            }
            System.out.println();
        }
        for(i=num-1; i>=1; i--){
            for(k=i; k>=1; k--){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
