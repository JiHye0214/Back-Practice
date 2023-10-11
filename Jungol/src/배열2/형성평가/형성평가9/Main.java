package 배열2.형성평가.형성평가9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정방향으로 만들고 역방향 출력
        int num = sc.nextInt();
        int[][] arr = new int[10][10];

        // 양쪽 끝을 1로 초기화
        for(int i=0;i<num;i++) {
            for(int j=0;j<1;j++) {
                arr[i][j] = 1;
                arr[i][i] = 1;
            }
        }

        // 양끝 사이의 배열값 지정
        for(int i=2;i<num;i++) {
            for(int j=1;j<i;j++) {
                arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
            }
        }

        // 역방향 출력
        for(int i=num-1;i>-1;i--) {
            for (int j = i; j >= 0; j--) { // 행만 역방향이 아니라 전체 역방향 출력이라서 인덱스도 끝부터 지정
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}