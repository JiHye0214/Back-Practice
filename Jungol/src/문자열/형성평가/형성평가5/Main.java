package 문자열.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.next();
        String two = sc.next();

        int big = (one.length() > two.length()) ? one.length() : two.length();
        System.out.println(big);

        sc.close();
    }
}
