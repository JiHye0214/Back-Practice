package 연산자.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        System.out.println(num++);
        // 출력 후에 더해지는 건가? 아니 근데 왜 sout 안에서 해야 됨.?
        System.out.println(++num);

        sc.close();
    }
}

