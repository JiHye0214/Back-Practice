package 배열2.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[100];
        int i=0,  num = sc.nextInt();

        array[0] = 100;
        array[1] = num;

        while(true){
            array[i+2] = array[i] - array[i+1];
            System.out.print(array[i] + " ");
            if(array[i] < 0){
                break;
            }
            i++;
        }
        sc.close();
    }
}
