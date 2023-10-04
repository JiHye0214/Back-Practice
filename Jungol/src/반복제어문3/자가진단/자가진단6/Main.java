package 반복제어문3.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num = sc.nextInt();
        char what = 65;
        for(i=num; i>=1; i--){
            for(j=1; j<=i; j++){
                System.out.print(what);
                what++;
            }
            System.out.println();
        }
        sc.close();
    }
}