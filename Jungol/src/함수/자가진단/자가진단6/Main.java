package 함수.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static int function(int numFirst, String oper, int numSecond){
        // void : return 없음을 의미

        // 하나의 문자열로 입력해서 계산하기
//        oper = oper.replace(" ", ""); // 공백제거
//        String[] operS= oper.split(""); // 배열화
//        int num1 = Integer.valueOf(operS[0]);
//        int num2 = Integer.valueOf(operS[2]);
//
//        // 문자열 비교 함수 equals()
//        if(operS[1].equals("+")){
//            System.out.printf("%d + %d = %d", num1, num2, num1+num2);
//        } else if(operS[1].equals("-")){
//            System.out.printf("%d - %d = %d", num1, num2, num1-num2);
//        }else if(operS[1].equals("*")){
//            System.out.printf("%d * %d = %d", num1, num2, num1*num2);
//        }else if(operS[1].equals("/")){
//            System.out.printf("%d / %d = %d", num1, num2, num1/num2);
//        } else {
//            System.out.println(0);
//        }

        // 따로 해서 뭉치기
        if( oper.equals("+") ) {
            return numFirst + numSecond;
        }else if( oper.equals("-") ) {
            return numFirst - numSecond;
        }else if( oper.equals("*") ) {
            return numFirst * numSecond;
        }else if( oper.equals("/") ) {
            return numFirst / numSecond;
        }else {
            return 0;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String oper = sc.nextLine();
//        function(oper);

        // 사실 내가 의도했던 건 이거임...equals를 까먹었을 뿐
        // + result를 만들어서 함수의 반환값을 넣어주고 main에서 출력하면 함수 생성 코드가 안 더러워짐
        int numFirst = sc.nextInt();
        String oper = sc.next();
        int numSecond = sc.nextInt();
        int result = function(numFirst, oper, numSecond);
        System.out.printf("%d %s %d = %d", numFirst,oper, numSecond, result);

        sc.close();
    }
}
