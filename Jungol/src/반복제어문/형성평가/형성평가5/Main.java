package 반복제어문.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Base, Height;
        while(true){
            Base = sc.nextInt();
            Height = sc.nextInt();

            System.out.print("Base = ");
            System.out.print("Height = ");
            System.out.println("Triangle width = " + (double)(Base*Height)/2);
            System.out.print("Continue? ");
            char YorN = sc.next().charAt(0);
            if(YorN == 'Y' || YorN == 'y'){
            } else {
                break;
            }
        }
        sc.close();
    }
}
