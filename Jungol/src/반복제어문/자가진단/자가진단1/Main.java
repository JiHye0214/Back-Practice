package 반복제어문.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(i <= 15){
            System.out.print(i + " ");
            ++i;
        }
        sc.close();
    }
}
