package 구조체.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        double x = (double)(arr[0][0] + arr[1][0] + arr[2][0])/3;
        double y = (double)(arr[0][1] + arr[1][1] + arr[2][1])/3;

        System.out.printf("(%.1f, %.1f)", x, y);

        sc.close();
    }
}
