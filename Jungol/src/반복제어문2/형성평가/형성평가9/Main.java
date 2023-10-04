package 반복제어문2.형성평가.형성평가9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num=sc.nextInt();

        for(i=1; i<=num; i++){
            for(j=1; j<=num; j++){
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }
        sc.close();
    }
}
