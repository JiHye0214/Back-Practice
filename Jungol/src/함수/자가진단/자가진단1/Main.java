package 함수.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    // ※ 주의 > 함수 생성할 때는 Main class 바로 밑에 쓰기
    //          main함수도 함수이므로 main 안에 적을 수 없음!!
    // 함수 생성
    public static void function(int num){
        for(int i=0; i<num; i++){
            System.out.print("~!@#$^&*()_+|\n");
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
