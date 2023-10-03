package 선택제어문.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        if(age >= 18){
            if(gender == 'M'){
                System.out.println("MAN");
            } else if(gender == 'F') {
                System.out.println("WOMAN");
            }
        } else {
            if(gender == 'M'){
                System.out.println("BOY");
            } else if(gender == 'F') {
                System.out.println("GIRL");
            }
        }
        sc.close();
    }
}
