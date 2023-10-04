package 반복제어문2.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int sub, sum=0;
        double avg=0;

        for(int i=1; i<=count; i++){
            sub = sc.nextInt();
            sum += sub;
            avg = (double)sum/(double)count;
        }
        System.out.printf("avg : %.1f", avg);

        if(avg >= 80) {
            System.out.println("\npass");
        } else {
            System.out.println("\nfail");
        }
        sc.close();
    }
}