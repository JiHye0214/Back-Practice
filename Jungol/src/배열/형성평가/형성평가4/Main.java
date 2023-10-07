package 배열.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int [100];
        int i, j, start, num;

        for(i=0; i<array.length; i++) {
            num = sc.nextInt();
            array[i] = num;
            if(num==-1){
                break;
            }
        }

        // 변수에 범위를 담기
        // 3보다 크면 끝에서 3개 출력해야 되니까 i-3
        // 작으면 다 출력해야 되니까 0
        start = (i>=3) ? i-3 : 0;

        // 이렇게 하면 코드가 훨씬 줄어듦
        for(j=start; j<i; j++){
            System.out.print(array[j] + " ");
        }
        sc.close();
    }
}
