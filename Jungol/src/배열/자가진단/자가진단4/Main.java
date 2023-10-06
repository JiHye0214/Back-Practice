package 배열.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, j, num, count=0;
        int[] array = new int[100];

        for(i=0; i<array.length; i++){
            num = sc.nextInt();
            if(num != 0){
                array[i] = num;
                ++count;
            } else {
                for(j=count-1; j>=0; j--){
                    System.out.print(array[j] + " ");
                }
                break;
            }
        }
        sc.close();
    }
}
