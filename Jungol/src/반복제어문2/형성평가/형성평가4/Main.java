package 반복제어문2.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, sum=0, count = sc.nextInt(), num1;
        double avg=0;
        for(i=1; i<=count; i++){
            num1 = sc.nextInt();
            sum += num1;
        }
        avg = (double)sum / (double) count;
        System.out.printf("%.2f", avg);
        sc.close();
    }
}
