package 반복제어문.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            ++i;
        }
        System.out.println(sum);
        sc.close();
    }
}