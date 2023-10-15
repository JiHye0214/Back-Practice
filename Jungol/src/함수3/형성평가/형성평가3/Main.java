package 함수3.형성평가.형성평가3;

import java.util.Scanner;
public class Main {
    static int[] array = new int [11];
    static int N, M;

    static void function(int num, int sum){
        if(num > N){
            if(sum == M){
                for(int i=1; i<=N; i++){
                    System.out.print(array[i] + " ");
                }
                System.out.println();
            }
            return;
        }
        for(int i=1; i<=6; i++){ // 중복불허 i=array[level-1] / 중복허용 i=1
            array[num] = i;
            function(num+1, sum+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        function(1, 0);
        sc.close();
    }
}
