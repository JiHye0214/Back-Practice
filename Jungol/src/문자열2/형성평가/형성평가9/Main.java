package 문자열2.형성평가.형성평가9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String result = "";
        result += sc.nextInt();

        double num2 = sc.nextDouble();
        num2 = Math.round(num2*1000)/1000.0; // 이딴 게 반올림 소숫점 n자리라니

        result += num2;
        result += sc.next();

        for(int i=0; i<result.length(); i++){
            if(i == (result.length()+1)/2) System.out.println();
            System.out.print(result.charAt(i));
        }
        sc.close();
    }
}
