package 반복제어문3.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, avg=0, sum=0, count=0;
        while(count < 20){
            num = sc.nextInt();
            sum += num;
            if(num == 0){
                break;
            }
            count++;
        }
        avg = sum / count;
        System.out.printf("%d %d", sum, avg);

        sc.close();
    }
}
