package 반복제어문3.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt(), num2=1;
        char what = 65;
        for(i=1; i<=num; i++){
            for(k=num-i+1; k>=1; k--){
                System.out.print(num2);
                System.out.print(' ');
                num2++;
            }
            for(j=1; j<=i; j++){
                System.out.print(what);
                System.out.print(' ');
                what++;
            }
            System.out.println();
        }
        sc.close();
    }
}
