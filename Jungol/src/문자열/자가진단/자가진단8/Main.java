package 문자열.자가진단.자가진단8;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String what = sc.nextLine(); // 라인으로 안 해주면 띄어쓰기 전까지 읽어버림 -> 한 글자만 읽음

        String[] array = what.split(" ");
        System.out.println(array.length);
        sc.close();
    }
}
