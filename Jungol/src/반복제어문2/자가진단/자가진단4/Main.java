package 반복제어문2.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum=0;
        for(int i=num; i<=100; i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}