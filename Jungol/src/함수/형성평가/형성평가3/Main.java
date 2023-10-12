package 함수.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void function(int num) {
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        function(num);
        sc.close();
    }
}
