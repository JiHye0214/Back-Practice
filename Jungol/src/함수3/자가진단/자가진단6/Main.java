package 함수3.자가진단.자가진단6;

import java.util.Scanner;
public class Main {
    // 배열을 함수랑 main 코드 밖에 생성
    public static int[] array = new int[51];
    public static int function(int num){
        // 재귀함수를 어따 써야 되는지 잘 모르겠음...
        // 알고자 하는 값이 array[num]이니까
        // 걔를 알기 위해서는 두 개의 값을 알아야 함 -> 같은 방식이잖아 -> 재귀함수를 써야지
        if(array[num]==0) array[num] = function(num/2) + function(num-1);
        return array[num];
    }
    public static void main(String[] args) {
        array[0] = 0;
        array[1] = 1;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(function(num));;
        sc.close();
    }
}