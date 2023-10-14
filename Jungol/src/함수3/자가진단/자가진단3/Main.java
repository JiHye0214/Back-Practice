package 함수3.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static int function(int num) {
        if(num==0) return 0;
        return num += function(num-1); // 그냥 num에 재귀함수 더한 걸 리턴하네
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(function(num));
        sc.close();
    }
}
