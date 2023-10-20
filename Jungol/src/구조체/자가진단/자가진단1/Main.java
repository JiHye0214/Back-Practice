package 구조체.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for(int i=0; i<3; i++){
            arr[i] = sc.next();
        }

        System.out.println("Name : " + arr[0]);
        System.out.println("School : " + arr[1]);
        System.out.println("Grade : " + arr[2]);
        sc.close();
    }
}
