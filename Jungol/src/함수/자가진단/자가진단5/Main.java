package 함수.자가진단.자가진단5;

import java.util.Scanner;

public class Main {
    // 함수 생성
    public static void function(int num1, int num2){
        if(num2 > 0){
            int mul = num1;
            for(int i=1; i<num2; i++){
                num1 *= mul;
            }
        } else num1 = 1;
        System.out.println(num1);
    }
    // 함수 실행
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        function(num1, num2);

        sc.close();
    }
}
