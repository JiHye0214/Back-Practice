package 구조체.연습문제.연습문제4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xsum = 0, ysum = 0;

        for(int i=0; i<2; i++){
            System.out.print("점의 좌표는?(x, y) ");
            xsum += sc.nextDouble();
            ysum += sc.nextDouble();
        }

        System.out.printf("\n중심점의 위치 = (%.1f, %.1f)", xsum/2, ysum/2);
    }
}
