package 배열.형성평가.형성평가8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [100];
        int i, num, five=0, sum=0;

        for(i=0; i<array.length; i++) {
            num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num%5==0){
                ++five;
                sum += num;
            }
            array[i] = num;
        }

        System.out.println("Multiples of 5 : " + five);
        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (double)sum / (double)five);

        sc.close();
    }
}