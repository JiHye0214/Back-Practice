package 함수.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static int function(int num) {
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = function(num);
        System.out.println(result);

        sc.close();
    }
}
