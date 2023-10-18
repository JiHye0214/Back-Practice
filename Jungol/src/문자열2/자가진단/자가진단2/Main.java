package 문자열2.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String what = sc.nextLine();
        String[] array = what.split(" ");

        for(int i=0; i<array.length; i++){
            if(i%2==0) System.out.println(array[i]);
        }
        sc.close();
    }
}