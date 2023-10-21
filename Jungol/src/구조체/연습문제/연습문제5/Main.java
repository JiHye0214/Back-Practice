package 구조체.연습문제.연습문제5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int max = 0;

        for(int i=0; i<5; i++){
            System.out.print(i+1 + "번 저축금액은? ");
            arr[i] = sc.nextInt();
            max = (arr[i] > max) ? arr[i] : max;
        }

        // Arrays.indexof : 특정 "문자"의 위치 찾기
        // Arrays.binarySearch : 이진 탐색 함수

        int i = Arrays.binarySearch(arr, max);
        System.out.printf("저축왕 %d번 %d원", i+1, max);

    }
}
