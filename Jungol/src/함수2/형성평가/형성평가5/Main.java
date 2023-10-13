package 함수2.형성평가.형성평가5;

import java.util.Scanner;

public class Main {
    public static void function(double[] array) {
        double sum1=0, sum2=0, avg1, avg2;

        for(int i=0; i<3; i++){
            sum1 += array[i];
        }
        avg1 = sum1/3;
        for(int i=0; i<3; i++){
            array[i] = Math.round(array[i]);
            sum2 += array[i];
        }
        avg2 = sum2/3;
        System.out.println(Math.round(avg1));
        System.out.println(Math.round(avg2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[3];
        for(int i=0; i<3; i++){
            array[i] = sc.nextDouble();
        }
        function(array);
        sc.close();
    }
}