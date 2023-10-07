package 배열.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [5];
        int i, num;

        for(i=0; i<5; i++) {
            num = sc.nextInt();
            array[i] = num;
        }
        System.out.printf("%d", array[0]+array[2]+array[4]);
        sc.close();
    }
}