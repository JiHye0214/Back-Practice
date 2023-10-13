package 함수2.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void function(int num) {
        int result = 1;
        for(int i=1; i<=num; i++){
            result *= 2;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        function(num);

        sc.close();
    }
}
