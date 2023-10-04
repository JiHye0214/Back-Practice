package 반복제어문2.형성평가.형성평가6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, big, small, num1=sc.nextInt(), num2=sc.nextInt();
        double sum = 0, avg = 0, count = 0;
        big = (num1 > num2) ? num1 : num2;
        small = (num1 > num2) ? num2 : num1;

        for(i=small; i<=big; i++){
            if(i%3==0 || i%5==0){
                sum += i;
                ++count;
            }
        }

        avg = sum / count;
        System.out.println("sum : " + (int)sum);
        System.out.printf("avg : %.1f", avg);
        sc.close();
    }
}

