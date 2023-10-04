package 반복제어문2.형성평가.형성평가7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num1=sc.nextInt();

        for(i=1; i<=10; i++){
            System.out.printf("%d ", num1*i);
        }
        sc.close();
    }
}