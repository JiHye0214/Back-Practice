package 구조체.연습문제.연습문제6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] arr = new String[5][3];
        int[] height = new int [5];

        for(int i=0; i<5; i++){
            String inform = sc.nextLine();
            arr[i] = inform.split(" "); // 한줄씩 문자열로 받아서 분리
            height[i] = Integer.valueOf(arr[i][1]); // 키만 집어넣기
        }

        Arrays.sort(height); // 키 정렬

        for(int H : height){
            for(int j=0; j<5; j++){
                if(H == Integer.valueOf(arr[j][1])){
                    for(String k : arr[j]){
                        System.out.printf("%s ", k);
                    }
                    System.out.println();
                }
            }
        }
    }
}
