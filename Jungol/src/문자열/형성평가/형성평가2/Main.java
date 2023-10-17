package 문자열.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.nextLine();

        for(int i=0; i<5; i++){
            System.out.print(what.charAt(i));
        }
        sc.close();
    }
}
