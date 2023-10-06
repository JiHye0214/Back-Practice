package 배열.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;
        char what;
        char[] array = new char[10];

        for(i=0;i<10;i++){
            what = sc.next().charAt(0);
            array[i] = what;
        }

        System.out.println(array);

        sc.close();
    }
}