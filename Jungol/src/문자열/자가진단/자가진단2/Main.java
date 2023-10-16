package 문자열.자가진단.자가진단2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.next();
        if(what.length() <= 100){
            System.out.println(what+what);
        }
        sc.close();
    }
}