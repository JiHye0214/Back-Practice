package 반복제어문.형성평가.형성평가4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int count=0;

        while(true){
            num = sc.nextInt();
            if(num > 0){
                if(num % 3 != 0 && num % 5 != 0){
                    ++count;
                }
            } else {
                System.out.println(count);
                break;
            }

        }
        sc.close();
    }
}
