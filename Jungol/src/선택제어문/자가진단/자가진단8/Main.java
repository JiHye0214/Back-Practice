package 선택제어문.자가진단.자가진단8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double avg = sc.nextDouble();
        switch ((int)avg){ // 소숫점 뒷자리가 뭐든간에 싹 버려버리네
            case 4 :
                System.out.println("scholarship");
                break;
            case 3 :
                System.out.println("next semester");
                break;
            case 2 :
                System.out.println("seasonal semester");
                break;
            default:
                System.out.println("retake");
        }
        sc.close();
    }
}
