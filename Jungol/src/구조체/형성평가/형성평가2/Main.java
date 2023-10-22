package 구조체.형성평가.형성평가2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String [3];

        for(int i=0; i<3; i++){
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr);
        String[] first = arr[0].split(" ");

        System.out.printf("name : %s", first[0]);
        System.out.printf("\ntel : %s", first[1]);
        System.out.printf("\naddr : %s", first[2]);
    }
}