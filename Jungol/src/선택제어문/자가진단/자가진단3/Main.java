package 선택제어문.자가진단.자가진단3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if(age >= 20){
            System.out.println("adult");
        } else {
            System.out.printf("%d years later", 20-age);
        }
        sc.close();
    }
}
