package 배열.형성평가.형성평가10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num1 = sc.nextInt(), num2;
        int[] array = new int [num1];

        for(i=0; i<array.length; i++) {
            num2 = sc.nextInt();
            array[i] = num2;
        }

        Arrays.sort(array); // 이런 함수가 있다고 왜 얘기를 안 해 줌?;;

        for(j=i-1; j>=0; j--){
            System.out.println(array[j]);
        }
        sc.close();
    }
}
