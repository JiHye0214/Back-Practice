package 함수3.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void function(int num, int count) {
        if(num == 1){
            System.out.print(count + " ");
            return ;
        }
        if(num%2==0) function(num/2, count+1);
        else function(num/3, count+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        function(num, 0);
        sc.close();
    }
}
