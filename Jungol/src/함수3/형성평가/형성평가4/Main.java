package 함수3.형성평가.형성평가4;

import java.util.Scanner;
public class Main {
    static int[] array =new int[101];
    public static int function(int num){
        if(array[num]==0)
            array[num] = (function(num-2) * function(num-1))%100;
        return array[num];
    }
    public static void main(String[] args) {
        array[1] = 1;
        array[2] = 2;

        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(function(num));
    }
}