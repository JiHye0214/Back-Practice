package 배열.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [10];
        int i, num, odd=0, even=0;

        for(i=0; i<10; i++) {
            num = sc.nextInt();
            array[i] = num;
            if(i%2==0){
                odd += array[i];
            } else {
                even += array[i];
            }
        }
        System.out.printf("odd : %d", odd);
        System.out.printf("\neven : %d", even);
        sc.close();
    }
}
