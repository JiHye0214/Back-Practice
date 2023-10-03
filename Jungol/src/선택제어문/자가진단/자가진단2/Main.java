package 선택제어문.자가진단.자가진단2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = sc.nextInt();
        int weight = sc.nextInt();
        int obesity = weight+100-height;
        System.out.println(obesity);
        if(obesity > 0){
            System.out.println("Obesity");
        }
        sc.close();
    }
}
