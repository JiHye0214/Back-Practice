package 반복제어문2.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char what = sc.next().charAt(0);
        for (int i=1;i<=20;i++){
            System.out.print(what);
        }
        sc.close();
    }
}
