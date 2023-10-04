package 반복제어문3.형성평가.형성평가7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt(), num2=0;
        char what = 65;
        for(i=num; i>=1; i--){

            for(j=i; j>=1; j--){
                System.out.print(what);
                System.out.print(' ');
                what++;
            }
            for(k=num-i; k>=1; k--){
                System.out.print(num2);
                System.out.print(' ');
                num2++;
            }
            System.out.println();
        }
        sc.close();
    }
}