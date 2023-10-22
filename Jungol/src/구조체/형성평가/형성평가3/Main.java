package 구조체.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][4];

        // 좌표 찍기
        for(int i=0; i<2; i++){
            for(int j=0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<2; i++){
            int fin = (arr[0][i] > arr[1][i]) ? arr[1][i] : arr[0][i];
            System.out.print(fin + " ");
        }
        for(int i=2; i<4; i++){
            int fin = (arr[0][i] > arr[1][i]) ? arr[0][i] : arr[1][i];
            System.out.print(fin + " ");
        }

        sc.close();
    }
}
