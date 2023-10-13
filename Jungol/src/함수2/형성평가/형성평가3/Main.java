package 함수2.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void function(int[] array) {
        int sum = 0;
        for(int i : array){
            sum += Math.abs(i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[5];
        for(int i=0; i<5; i++){
            array[i] = sc.nextInt();
        }
        function(array);

        sc.close();
    }
}
