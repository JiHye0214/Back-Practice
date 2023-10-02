package 연산자.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int com = sc.nextInt();

        System.out.printf("sum %d", kor+eng+math+com);
        System.out.printf("\navg %d", (int)(kor+eng+math+com)/4);
        sc.close();
    }
}
