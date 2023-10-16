package 문자열.자가진단.자가진단5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.next();
        String what2 = sc.next();
        System.out.println(what.length() + what2.length());
        sc.close();
    }
}