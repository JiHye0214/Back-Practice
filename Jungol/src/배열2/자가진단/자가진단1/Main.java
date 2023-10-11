package 배열2.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 먼저 0으로 채워진 26개 인덱스 배열 생성
        int[] arr = new int[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = 0;
        }

        // 다른 거면 멈추고 아니면 알파벳에 해당하는 인덱스에 1씩 더하기
        while (true) {
            char ch = sc.next().charAt(0);
            if (ch < 'A' || ch > 'Z') // 그냥 ch의 범위를 알파벳으로 해도 되는 구나
                break;
            arr[(int) ch - 65]++;
        }

        // 알파벳이랑 개수
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.print((char) (int) (i + 65) + " : ");
                System.out.println(arr[i]);
            }
        }
        sc.close();
    }
}
