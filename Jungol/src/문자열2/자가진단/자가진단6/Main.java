package 문자열2.자가진단.자가진단6;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.next();
        String[] one1 = one.split("");
        String two = sc.next();
        String[] two1 = two.split("");

        String result = one1[0] + one1[1];

        for(int i=2; i<two1.length; i++){
            result += two1[i];
        }
        result += one1[0] + one1[1];
        System.out.println(result);

        sc.close();
    }
}