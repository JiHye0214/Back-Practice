package 문자열.자가진단.자가진단6;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            char what = sc.next().charAt(0);
            int num = (int)what;
            if(num >= 65 && num <= 122){
                System.out.println(what);
            } else if(num >= 48 && num <= 57){
                System.out.println(num);
            } else {
                break;
            }
        }
        sc.close();
    }
}
