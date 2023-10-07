package 배열.자가진단.자가진단9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [10];
        int i, j, k,l, num, tmp;

        for(i=0; i<10; i++) {
            num = sc.nextInt();
            array[i] = num;
        }

        // 이중포문으로 sort 만들기
        for(j=0; j<array.length; j++){
            for(k=0; k<array.length; k++){
                if(array[j]>array[k]){
                    tmp = array[j];
                    array[j] = array[k];
                    array[k] = tmp;
                }
            }
        }

        for(l=0; l<array.length; l++){
            System.out.print(array[l] + " ");
        }

        sc.close();
    }
}
