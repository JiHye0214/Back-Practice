package 배열2.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[25];

        for(int i=0; i<25; i+=5){
            array[i] = 1; // 첫 행 1로 초기화
            for(int j=i+1; j<=i+4; j++){
                if(j<5){
                    array[j] = 1;
                } else {
                    array[j] = array[j-1] + array[j-5];
                }
            }
        }

        for(int i=0; i<25; i+=5){
            for(int j=i;j<=i+4;j++){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
