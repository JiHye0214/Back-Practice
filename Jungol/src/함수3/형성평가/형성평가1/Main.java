package 함수3.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void function(int num) {
        if(num==0) return;
        function(num/2);
        System.out.print(num + " "); // 어째서 순서만 바꿨다고 출력이 거꾸로 되는 거임 ?
        // num이 어디 저장되는 것도 아니고 왜 함수 다음에 출력했다고 거꾸로 되는 거임?
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        function(num);
        sc.close();
    }
}
