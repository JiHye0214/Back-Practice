package 반복제어문2.자가진단.자가진단5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, num, mul3 = 0, mul5 = 0;
        for(i=1; i<=10; i++){
            num = sc.nextInt();
            if(num%3 ==0){
                ++mul3;
            }
            if(num%5 == 0){
                ++mul5;
            }
        }
        System.out.println("Multiples of 3 : " + mul3);
        System.out.println("Multiples of 5 : " + mul5);
        sc.close();
    }
}
