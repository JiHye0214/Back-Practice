package 문자열2.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];

        for(int i=0; i<5; i++){
            array[i] = sc.next();
        }
        for(int i=4; i>=0; i--){
            System.out.println(array[i]);
        }
        sc.close();
    }
}