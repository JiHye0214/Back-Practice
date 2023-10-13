package 함수2.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void function(int[] array) {
        int temp;
        for(int h=9; h>=1; h--){
            for(int i=0; i<h; i++){
                if(array[i] < array[i+1]){
                    temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
            for(int i : array){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for(int i=0; i<10; i++){
            array[i] = sc.nextInt();
        }
        function(array);
        sc.close();
    }
}
