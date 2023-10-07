package 배열.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] array = new double [6];
        double num, sum=0;
        int i;

        for(i=0; i<array.length; i++) {
            num = sc.nextDouble();
            array[i] = num;
            sum += num;
        }

        System.out.printf("%.1f", sum/6);

        sc.close();
    }
}

