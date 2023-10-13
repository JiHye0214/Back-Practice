package 함수2.자가진단.자가진단1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] function(int[] array) {
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int[] array = new int[count];
        for(int i=0; i<count; i++){
            int num = sc.nextInt();
            array[i] = num;
        }

        int[] result = function(array);
        for(int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
}
