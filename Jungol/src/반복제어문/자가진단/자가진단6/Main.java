package 반복제어문.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Korea\n2. USA\n3. Japan\n4. China");
            System.out.print("number? ");
            int num = sc.nextInt();

            if(num <= 4 && num > 0){
                switch (num) {
                    case 1:
                        System.out.println("\nSeoul\n");
                        break;
                    case 2:
                        System.out.println("\nWashington\n");
                        break;
                    case 3:
                        System.out.println("\nTokyo\n");
                        break;
                    case 4:
                        System.out.println("\nBeijing\n");
                        break;
                }
            } else {
                System.out.println("\nnone");
                break;
            }
        }
        sc.close();
    }
}

