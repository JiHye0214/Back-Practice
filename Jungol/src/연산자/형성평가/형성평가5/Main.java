package 연산자.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minHeight = sc.nextInt();
        int minWeight = sc.nextInt();
        int kiHeight = sc.nextInt();
        int kiWeight = sc.nextInt();

        if(minHeight > kiHeight && minWeight > kiWeight) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}