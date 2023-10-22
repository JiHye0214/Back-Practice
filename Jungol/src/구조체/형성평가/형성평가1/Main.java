package 구조체.형성평가.형성평가1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inform = sc.nextLine();
        String[] arr = inform.split(" ");

        System.out.printf("name : %s", arr[0]);
        System.out.printf("\ntel : %s", arr[1]);
        System.out.printf("\naddr : %s", arr[2]);
    }
}
