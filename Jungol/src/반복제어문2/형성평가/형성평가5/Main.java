package 반복제어문2.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, even=0, odd=0, num;
        for(i=1; i<=10; i++){
            num = sc.nextInt();
            if(num%2==0){
                ++even;
            } else {
                ++odd;
            }
        }
        System.out.println("even : " + even);
        System.out.println("odd : " + odd);
        sc.close();
    }
}
