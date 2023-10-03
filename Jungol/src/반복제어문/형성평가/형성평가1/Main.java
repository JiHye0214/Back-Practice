package 반복제어문.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 1;
        while(i<=num){
            System.out.printf("%d ", i++);
        }
        sc.close();
    }
}
