package 함수3.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void function(int num) {
        if(num==0) return; // 재귀함수는
        System.out.println("recursive");
        function(num-1); // 이렇게 쓰는 거란다
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        function(num);
        sc.close();
    }
}
