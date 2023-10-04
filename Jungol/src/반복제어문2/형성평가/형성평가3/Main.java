package 반복제어문2.형성평가.형성평가3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, sum=0, num1 = sc.nextInt();
        for(i=1; i<=num1; i++){
            if(i%5==0){
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
