package 문자열.형성평가.형성평가6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // StringBuffer 없으면 자바는 하지 말라는 거지
        // 함수 너무 쓰고 싶은데 StringBuffer 없이 안 될 거 같아서
        // 그냥 씀 사실 StringBuffer 안 쓰고 싶었는데 말이지...

        StringBuffer str = new StringBuffer(); // 타입은 buffer라는 독립적인 클래스

        Scanner sc = new Scanner(System.in);
        String what = sc.nextLine();
        str.append(what);

        while(true){
            int len = str.length();
            if(len==1) break;
            int num = sc.nextInt();

            if(num < len){
                str.deleteCharAt(num-1); // 이런 깔쌈한 함수가 StringBuffer 밖에 없어 ㅅㅂ
            } else {
                str.deleteCharAt(len-1);
            }
            System.out.println(str);
        }
        sc.close();
    }
}
