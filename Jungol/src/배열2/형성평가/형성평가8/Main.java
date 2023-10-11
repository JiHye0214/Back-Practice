package 배열2.형성평가.형성평가8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[4][2];
        int[] Rsum = new int[4];
        int[] Csum = new int[2];
        int Tsum = 0;

        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                array[i][j] += sc.nextInt();
                Tsum += array[i][j];
            }
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<2; j++){
                Rsum[i] += array[i][j];
            }
            System.out.print(Rsum[i]/2 + " ");
        }

        System.out.println();
        for(int j=0; j<2; j++){
            for(int i=0; i<4; i++){
                Csum[j] += array[i][j];
            }
            System.out.print(Csum[j]/4 + " ");
        }

        System.out.println();
        System.out.println(Tsum/8);
        sc.close();
    }
}