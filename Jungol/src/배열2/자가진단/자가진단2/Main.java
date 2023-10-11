package 배열2.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[10];
        int i, num;

        // count array
        for(i=0; i<=10; i++){
            array[0] = 0;
        }

        while(true){
            num = sc.nextInt();
            if(num == 0) break;
            array[num/10]++;
        }

        for(i=0; i<array.length; i++){
            if(array[i] > 0){
                System.out.println(i + " : " + array[i]);
            }
        }
        sc.close();
    }
}
