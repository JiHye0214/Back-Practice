package 문자열.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.next();
        String one = sc.next();
        int i;

        for(i=0; i<what.length(); i++){
            if(what.charAt(i) == one.charAt(0)) {
                break;
            }
        }

        if(i==what.length()){
            System.out.println("No");
        } else {
            System.out.println(i);
        }

        sc.close();
    }
}
