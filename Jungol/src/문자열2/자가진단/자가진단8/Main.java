package 문자열2.자가진단.자가진단8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        // 배열 만들어서 비교하기
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.next();
        }
        Arrays.sort(arr); // 애초에 고생하지 말라고 sort 만들어 줬잖아;;;
        System.out.println(arr[0]);
        sc.close();
    }
}

