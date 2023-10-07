package 배열.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [10];
        int i, under = 0, up = 1000, num;

        for(i=0; i<10; i++){
            num = sc.nextInt();
            array[i] = num;
            if(array[i] < 100){
                under = Math.max(under, array[i]); }
            if(array[i] > 100) {
                up = Math.min(up, array[i]); }
        }
        if(under==0) under = 100;
        if(up==1000) up = 100;

        System.out.println(under + " " + up);
        sc.close();
    }
}

