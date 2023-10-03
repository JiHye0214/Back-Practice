package 반복제어문.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("number? ");
            int num = sc.nextInt();
            if(num > 0){
                System.out.println("positive integer");
            } else if(num < 0){
                System.out.println("negative number");
            } else if(num == 0){
                break;
            }
        }
        sc.close();
    }
}