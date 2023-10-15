package 함수3.자가진단.자가진단6;

import java.util.Scanner;
public class Main {
    // 배열을 함수랑 main 코드 밖에 생성
    public static int[] array = new int[51]; // 그러니까 0번빼고 50개 --> 51개 인덱스
    public static int function(int num){
        // 재귀함수를 어따 써야 되는지 잘 모르겠음...
        // 알고자 하는 값이 array[num]이니까
        // 걔를 알기 위해서는 두 개의 값을 알아야 함 -> 같은 방식이잖아 -> 재귀함수를 써야지
        // if 문의 array[num] == 0인 이유는 초기 array[num] 값은 지정해 주지 않는 이상 0이기 때문이다.
        if (num !=0) { // 이거 없으면 0입력 시 에러남
            if(array[num]==0)
                array[num] = function(num/2) + function(num-1);
        }
        return array[num];
    }
    public static void main(String[] args) {
        array[0] = 0; // 0번은 쓸모가 없고 의미도 없어 --> 인덱스 1번을 1이라고 저장하기 위한 도구
        array[1] = 1; // start

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(function(num));;
        sc.close();
    }
}