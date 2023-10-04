package 반복제어문3.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, mul, avg=0, count=0, num = sc.nextInt();
        for(i=1; i<=10; i++){
            mul = i * num;
            if(mul > 100){
                break;
            }
            System.out.printf("%d ", mul);
            if(mul%10 == 0){
                break;
            }
        }
        sc.close();
    }
}
