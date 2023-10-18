package 문자열2.자가진단.자가진단11;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String num = ""; // 빈공간 초기화
        for (int i = 0; i < 5; i++) {
            num += sc.next();
        }

        for(int i=0; i<num.length(); i++){
            // make Enter button
            // 이건 생각 못했다 ㅁㅊ
            if(i%3==0 && i!=0){
                System.out.println();
            }
            System.out.print(num.charAt(i));
        }

        sc.close();
    }
}