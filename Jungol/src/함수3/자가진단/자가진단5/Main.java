package 함수3.자가진단.자가진단5;

import java.util.Scanner;
public class Main {
    // 변수랑 배열을 함수랑 main 코드 밖에 생성
    // 지역변수이므로 최대한 밖에서 해야 두 함수에서 실행 가능
    static int N;
    static int[] array = new int[11]; // array[0] + 10개
    public static void function(int level){
        // 아래 for문에서 function(level+1) 해도 if문만 실행되는 이유는
        // 초기 level이 항상 1이기 때문에
        // 시작하면 무조건 아래 for문 돌렸다가 위로 올라가는데 if문 아래에는 return;이 있어서 중단된다.
        if(level>N){ // level(변수)이 N(상수)보다 커질 때까지 if문(출력) 실행 안 함 ==> 범위에 맞게 array에 채울 때까지 출력 안 함
            for(int i=1;i<=N;i++)System.out.printf("%d ",array[i]);
            System.out.println();
            return; // if문을 다 실행한 후에도 밑 for문을 실행하지 않는 이유는 return 값이 없기 때문이다.
        }
        for(int i=array[level-1];i<=6;i++){ // level-1 --> 중복을 없애기 위한 수단 / 1일때는 0, 2일때는 1 ...
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