package 배열.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        int[] array = new int[10];

        for(i=0; i<10; i++){
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
