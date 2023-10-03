package 선택제어문.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char what = sc.next().charAt(0);
        if(what == 'A'){
            System.out.println("Excellent");
        } else if (what == 'B') {
            System.out.println("Good");
        } else if(what == 'C') {
            System.out.println("Usually");
        } else if(what == 'D'){
            System.out.println("Effort");
        } else if(what == 'F'){
            System.out.println("Failure");
        } else {
            System.out.println("error");
        }

        sc.close();
    }
}
