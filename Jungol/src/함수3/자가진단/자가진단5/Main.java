package 함수3.자가진단.자가진단5;

import java.util.Scanner;
public class Main {
    // 변수랑 배열을 함수랑 main 코드 밖에 생성
    static int N;
    static int[] array = new int[11]; // array[0]에 1을 넣었으니까 11개?
    public static void function(int level){
        if(level>N){
            for(int i=1;i<=N;i++)System.out.printf("%d ",array[i]);
            System.out.printf("\n");
            return;
        }
        for(int i=array[level-1];i<=6;i++){
            array[level]=i;
            function(level+1);
        }
    }
    public static void main(String[] args) {
        array[0] = 1;

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        function(1); // 함수 매개변수에는 입력 받는 N이 아니라 1을 넣는다
        sc.close();
    }
}