package 배열2.자가진단.자가진단5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[8];
        int[] array2 = new int[8];
        int[] array3 = new int[8];

        System.out.println("first array");
        for(int j=0; j<8; j++){
            int num1 = sc.nextInt();
            array1[j] = num1;
        }
        System.out.println("second array");
        for(int j=0; j<8; j++){
            int num2 = sc.nextInt();
            array2[j] = num2;
        }

        for(int i=0;i<8;i++){
            array3[i] = array1[i] * array2[i];
            if((i+1)%4==0){
                for(int j=i-3;j<=i;j++){
                    System.out.printf("%d ", array3[j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

