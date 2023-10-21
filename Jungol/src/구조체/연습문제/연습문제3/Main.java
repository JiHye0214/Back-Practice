package 구조체.연습문제.연습문제3;

import java.util.Scanner;

public class Main {
    static int sum1 = 0;
    static int sum2 = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();

        function(one);
        function(two);

        System.out.printf("합계 %d %d", sum1, sum2);
    }

    public static void function(String inf){
        System.out.println(inf);
        String[] arr = inf.split(" ");
        sum1 += Integer.valueOf(arr[1]);
        sum2 += Integer.valueOf(arr[2]);
    }
}
