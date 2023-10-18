package 문자열2.자가진단.자가진단3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[10];
        int i=0;
        while(i<10){
            array[i] = sc.next();
            i++;
        }

        char last = sc.next().charAt(0);
        for(int j=0; j<10; j++){
            char fin = array[j].charAt(array[j].length()-1);
            if(last == fin){
                System.out.println(array[j]);
            }
        }
        sc.close();
    }
}