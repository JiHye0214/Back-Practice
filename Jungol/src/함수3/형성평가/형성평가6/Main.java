package 함수3.형성평가.형성평가6;

import java.util.Scanner;

public class Main {
    public static void function(int number, int mul) {
        if(number == 0) {
            System.out.println(mul);
            return ;
        }
        String convert = Integer.toString(number);
        convert = convert.replace('0', '1');
        int convert2 = Integer.parseInt(convert);
        int hold = convert2%10;
        function(convert2/10, mul * hold);

        // return을 알다가도 모르겠ㄷ...
//        if(number == 0) return 1;
//        if(number%10 != 0) return (number%10)*function(number/10);
//        else return (1%10)*function(number/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        function(num1*num2*num3, 1);
//        System.out.println(function(num1*num2*num3));
        sc.close();
    }
}
