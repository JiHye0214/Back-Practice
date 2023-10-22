package 구조체.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextDouble();
            }
        }

        System.out.printf("height : %dcm", ((int)arr[0][0]+(int)arr[1][0])/2+5);
        System.out.printf("\nweight : %.1fkg", (arr[0][1]+arr[1][1])/2 - 4.5);

        sc.close();
    }
}