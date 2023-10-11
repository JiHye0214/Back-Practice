package 배열2.형성평가.형성평가2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // count array
        // 0점대부터 100점까지
        int[] array = new int[11];
        int i=0, num;

        while(i < 100) {
            num = sc.nextInt();
            if(num==0) break;
            array[num/10]++;
            i++;
        }
        for(i=10; i>=0; i--){
            if(array[i] > 0){
                System.out.println((i*10) + " : " + array[i] + " person");
            }
        }

        sc.close();
    }
}

