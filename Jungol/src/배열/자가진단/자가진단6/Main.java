package 배열.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [10];
        int i, small = 1000, num;
        
        for(i=0; i<10; i++){
            num = sc.nextInt();
            array[i] = num;
            small = Math.min(array[i], small);
        }
        System.out.println(small);
        sc.close();
    }
}
