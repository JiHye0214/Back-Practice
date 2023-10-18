package 문자열2.형성평가.형성평가6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int num = sc.nextInt();
        String copy = "", conv = "";

        A = A+B;
        System.out.println(A);

        if(num <= A.length()){ // 작으면 개수만큼 복사
            for(int i=0; i<num; i++){
                copy += A.charAt(i);
            }
        } else { // 크면 다 복사
            for(int i=0; i<A.length(); i++){
                copy += A.charAt(i);
            }
        }

        if(copy.length() <= B.length()){ // 작으면 부분 붙여넣기
            for(int i=0; i<copy.length(); i++){
                conv += B.charAt(i);
            }
            B = B.replace(conv, copy);
        } else { // 크면 다 붙여넣기
            B = copy;
        }

        System.out.println(B);

        sc.close();
    }
}
