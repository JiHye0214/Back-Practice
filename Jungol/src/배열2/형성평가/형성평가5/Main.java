package 배열2.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 항상 입력 배열이 아니라 count array를 떠올리란 말이야
        int[] array = new int[4];
        int i, j, num;

        for(i=0; i<4; i++){
            System.out.print((i+1) + "class? ");
            for(j=0; j<3; j++){
                num = sc.nextInt();
                array[i] += num;
            }
        }
        for(i=0; i<4; i++){
            System.out.println((i+1) + "class : " + array[i]);
        }
        sc.close();
    }
}
