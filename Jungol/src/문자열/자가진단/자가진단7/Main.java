package 문자열.자가진단.자가진단7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String what = sc.next();

        for(int i=0; i<what.length(); i++){
            if(what.charAt(i) >= 65 && what.charAt(i) <= 122){
                System.out.print(Character.toUpperCase(what.charAt(i)));
                // 문자열 -> 소문자 변환 toUpperCase
                // 문자 -> 소문자 변환 Character.toUpperCase
            }
        }
        sc.close();
    }
}
