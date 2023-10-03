package 반복제어문.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        while(true){
            int num = sc.nextInt();
            if(num > 0){
            if(num % 2 ==0) {
                ++even;
            } else {
                ++odd;
            }
            } else {
                System.out.printf("odd : %d", odd);
                System.out.printf("\neven : %d", even);
                break;
            }
        }
        sc.close();
    }
}