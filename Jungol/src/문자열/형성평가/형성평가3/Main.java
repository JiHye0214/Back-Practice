package 문자열.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.nextLine();
        int len = what.length();

        for(int i=0; i<len; i++){
            char s = what.charAt(i);
            if((s >= 65 && s <= 90) || (s >= 97 && s <= 122) || (s >= 48 && s <= 57)){
                System.out.print(Character.toLowerCase(s));
            }
        }
        sc.close();
    }
}
