package 배열2.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 나는 왜 여태까지 이차원배열을 생각하지 못했는가.
        int[][] array = {{3, 5, 9}, {2, 11, 5}, {8, 30, 10}, {22, 5, 1}};
        int i, j, sum=0;

        for(i=0; i<array.length; i++){
            for(j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");;
                sum += array[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
        sc.close();
    }
}
