package 함수.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    // 함수 생성
    public static void function(int num){
        double area = num * num * 3.14;
        System.out.printf("%.2f", area);
    }
    // 함수 실행
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int what = sc.nextInt();
        function(what);

        sc.close();
    }
}
