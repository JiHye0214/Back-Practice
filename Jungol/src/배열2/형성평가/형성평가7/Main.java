package 배열2.형성평가.형성평가7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array1 = new int[2][3];
        int[][] array2 = new int[2][3];
        int[][] array3 = new int[2][3];

        System.out.println("first array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("second array");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                array3[i][j] = array1[i][j] * array2[i][j];
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}