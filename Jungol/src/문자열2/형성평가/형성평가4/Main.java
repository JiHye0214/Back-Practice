package 문자열2.형성평가.형성평가4;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] arr = new String[num];

        for(int i=0; i<num; i++){
            arr[i] = sc.next();
        }

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
