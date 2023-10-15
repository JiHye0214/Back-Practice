package 함수3.형성평가.형성평가2;

import java.util.Scanner;
public class Main {
    static void function(int num){
        if(num<=0) return;
        function(num-2);
        System.out.printf("%d ",num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        function(num);
    }
}