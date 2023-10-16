package 문자열.자가진단.자가진단4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.next();
        int num = sc.nextInt();

        // 문자열의 인덱싱 방법
        // 1. array
        // 2. charAt()

        int num2 = (what.length()>=num) ? (num-1) : 0;
//        int index = str.length() - 1 - i;
        // 이런 방법을 생각해 보자.

        for(int i=what.length()-1; i>=num2; i--){
            System.out.print(what.charAt(i));
        }
        sc.close();
    }
}
