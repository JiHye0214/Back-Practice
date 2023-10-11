package 배열2.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {5,8,10,6,4,11,20,1,13,2,7,9,14,22,3};
        int i,j;
        for(i=0;i<array.length;i++){
            if((i+1)%5==0){
                for(j=i-4;j<=i;j++){
                    System.out.printf("%2d   ", array[j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

