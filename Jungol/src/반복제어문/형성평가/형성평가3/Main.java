package 반복제어문.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;
        int count = 0;

        while(true){
            num = sc.nextInt();
            if(num <= 100 && num >= 0) {
                sum += num;
                ++count;
            } else {
                System.out.println("sum : " + sum);
                System.out.printf("avg : %.1f", (double)sum / (double)count);
                break;
            }
        }
        sc.close();
    }
}
