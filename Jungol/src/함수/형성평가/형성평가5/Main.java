package 함수.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void function(int[][] array) {
        for(int i=0; i<3; i++){
            int Rsum = 0, Csum = 0;
            for(int j=0; j<3; j++){
                Rsum += array[i][j];
                Csum += array[j][i];
                array[3][3] += array[i][j];
            }
            array[i][3] = Rsum;
            array[3][i] = Csum;
        }

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[4][4];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                array[i][j] = sc.nextInt();
            }
        }
        function(array);
        sc.close();
    }
}