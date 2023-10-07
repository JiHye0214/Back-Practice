package 배열.형성평가.형성평가7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [100];
        int i, min = 1000, max = -1000, num;
        // "세자리" 라는 범위가 주어졌기 때문에 max와 min을 지정할 수 있단다

        for(i=0; i<array.length; i++) {
            num = sc.nextInt();
            if(num==999){
                break;
            }
            array[i] = num;
            max = (array[i] > max) ? array[i] : max;
            min = (array[i] < min) ? array[i] : min;
        }

        System.out.println("max : " + max);
        System.out.println("min : " + min);

        sc.close();
    }
}
