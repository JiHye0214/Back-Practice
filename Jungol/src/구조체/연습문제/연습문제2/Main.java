package 구조체.연습문제.연습문제2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("친한 친구의 이름과 나이를 입력하세요. ");
        String N = sc.next();
        int A = sc.nextInt();
        Inform cla = new Inform(N, A);
    }
}

class Inform {
    String name = "박지혜";
    int age = 19;

    public Inform(String N, int A){
        System.out.printf("당신의 이름 : %s, 나이 : %d\n", this.name, this.age);
        this.name = N;
        this.age = A;
        System.out.printf("친구의 이름 : %s, 나이 : %d", this.name, this.age);
    }
}