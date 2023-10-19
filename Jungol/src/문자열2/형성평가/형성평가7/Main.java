package 문자열2.형성평가.형성평가7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuffer one = new StringBuffer(sc.next());
        StringBuffer two = new StringBuffer(sc.next());

        System.out.println(function(one) * function(two));
    }
    public static int function(StringBuffer some){
        while(true){ // 최초숫자 앞 아무개 삭제
            if (some.charAt(0) >= 48 && some.charAt(0) <= 57) break;
            some.deleteCharAt(0);
        }

        int i=0;
        String result = "";

        while(i<some.length()) {// 최초숫자 뒤 아무개 삭제
            if (some.charAt(i) < 48 || some.charAt(i) > 57) break; // 숫자 아니면 멈추기
            result += some.charAt(i);
            i++;
        }

        int fin = Integer.parseInt(result);
        return fin;
    }
}
