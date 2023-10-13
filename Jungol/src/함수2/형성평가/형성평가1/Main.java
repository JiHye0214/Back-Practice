package 함수2.형성평가.형성평가1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void function() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i=0; i<num; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }
        sc.close();
    }
    public static void main(String[] args) {
        function();
    }
}
