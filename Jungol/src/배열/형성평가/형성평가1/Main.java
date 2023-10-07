package 배열.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array = new char [10];
        char num;
        int i,j;

        for(i=0; i<10; i++) {
            num = sc.next().charAt(0);
            array[i] = num;
        }

        for(j=array.length-1; j>=0;j--){
            System.out.print(array[j] + " ");
        }
        sc.close();
    }
}
