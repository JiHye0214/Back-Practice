package 구조체.연습문제.연습문제1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름은 무엇입니까? ");
        String name = sc.next();
        System.out.print("당신의 나이는 몇 살입니까? ");
        int age = sc.nextInt();
        System.out.printf("당신의 이름은 %s이고 나이는 %d세이군요.", name, age);
    }
}
