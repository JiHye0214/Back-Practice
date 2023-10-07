package 배열.자가진단.자가진단8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [10];
        int i, num, odd=0, even=0;

        for(i=0; i<10; i++) {
            num = sc.nextInt();
            array[i] = num;

            if((i+1)%2==0){
                even+=array[i];
            } else{
                odd+=array[i];
            }
        }

        System.out.printf("sum : %d", even);
        System.out.printf("\navg : %.1f", (double)odd/5);
        sc.close();
    }
}
