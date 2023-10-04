package 반복제어문2.형성평가.형성평가8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, row=sc.nextInt(), col=sc.nextInt();

        for(i=1; i<=row; i++){
            for(j=1; j<=col; j++){
                System.out.printf("%d ", i*j);
            }
            System.out.println();
        }
        sc.close();
    }
}
