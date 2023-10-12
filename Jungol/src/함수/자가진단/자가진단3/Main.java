package 함수.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    // 함수 생성
    public static void function(int num){
        for(int i=0; i<num; i++){
            for(int j=i*num+1; j<=num*(i+1); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    // 함수 실행
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int what = sc.nextInt();
        function(what);

        sc.close();
    }
}
