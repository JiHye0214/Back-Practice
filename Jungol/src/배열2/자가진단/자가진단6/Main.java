package 배열2.자가진단.자가진단6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[20];
        int num, count=0;
        for(int i=0; i<array.length; i++){
            num = sc.nextInt();
            array[i] = num;
        }

        for(int i=3; i<array.length; i+=4){
            int sum=0;
            for(int j=i-3; j<=i; j++){
                sum+=array[j];
            }
            if((sum/4) >= 80) {
                System.out.println("pass");
                count++;
            } else System.out.println("fail");
        }
        System.out.println("Successful : " + count);

        sc.close();
    }
}