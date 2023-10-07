package 배열.형성평가.형성평가9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [100];
        int i, num, j;

        for(i=0; i<array.length; i++) {
            num = sc.nextInt();
            if(num==0){
                break;
            }
            if(num%2==0){
                array[i] = num / 2;
            } else {
                array[i] = num * 2;
            }
        }

        System.out.println(i);
        for(j=0; j<i; j++){
            System.out.print(array[j] + " ");
        }
        sc.close();
    }
}
