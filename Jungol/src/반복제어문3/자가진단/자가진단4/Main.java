package 반복제어문3.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, k, num = sc.nextInt();
        for(i=num; i>=1; i--){
            // 스페이스바를 먼저 누르고 별을 누르는 걸 생각해 이놈시끼야
            for(k=num-i; k>0; k--){
                System.out.print(' ');
            }
            for(j=i; j>=1; j--){
                System.out.print('*');
            }
            System.out.println();
        }
        sc.close();
    }
}
