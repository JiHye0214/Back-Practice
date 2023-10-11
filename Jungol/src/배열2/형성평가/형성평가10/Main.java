package 배열2.형성평가.형성평가10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] array = new char[3][5];
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                array[i][j] = sc.next().charAt(0);
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                System.out.print((char)((int)array[i][j]+32) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
