package 배열2.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // count array
        int[] array = new int[6];
        int i=0, num;

        while(i < 10) {
            num = sc.nextInt();
            array[num-1]++;
            i++;
        }
        for(i=0; i<array.length; i++){
            System.out.println((i+1) + " : " + array[i]);
        }

        sc.close();
    }
}

