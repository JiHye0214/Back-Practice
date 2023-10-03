package 반복제어문.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        while(true) {
            int num = sc.nextInt();
                sum += num;
                ++count;
            if(num >= 100) {
                System.out.println(sum);
                System.out.printf("%.1f", (double)sum / (double)count);
                break;
            }
        }
        sc.close();
    }
}