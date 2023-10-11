package 배열2.형성평가.형성평가6;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[5][5];
        int i, j;

        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 1;
        array[0][3] = 0;
        array[0][4] = 1;

        for(i=1; i<array.length; i++){
            for(j=0; j<array[i].length; j++){
                if(j==0){
                    array[i][j] = array[i-1][j+1];
                } else if(j==4){
                    array[i][j] = array[i-1][j-1];
                }else {
                    array[i][j] = array[i-1][j-1] + array[i-1][j+1];
                }
            }
        }
        for(i=0; i<array.length; i++){
            for(j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
