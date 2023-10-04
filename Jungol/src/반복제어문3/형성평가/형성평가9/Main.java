package 반복제어문3.형성평가.형성평가9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt();
        for(i=1; i<=num; i++){
            for(j=1; j<=i; j++){
                System.out.print('#');
                System.out.print(' ');
            }
            System.out.println();
        }
        for(i=num-1; i>=1; i--){
            for(k=(num-i)*2; k>0; k--){
                System.out.print(' ');
            }
            for(j=i; j>=1; j--){
                System.out.print('#');
                System.out.print(' ');
            }
            System.out.println();
        }
        sc.close();
    }
}
