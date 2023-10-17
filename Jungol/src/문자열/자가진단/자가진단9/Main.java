package 문자열.자가진단.자가진단9;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String what = sc.nextLine();
        String[] array = what.split("");

        int len = what.length();
        int count;

        for (int i = 0; i < len; i++) {
            count = len - 1 - i; // ⭐ 이걸 생각 못 했어...
            for (int j = 0; j < len; j++) {
                if (count == len) {
                    count = 0;
                }
                System.out.print(array[count]);
                count++;
            }
            System.out.println();
        }
        sc.close();
    }
}
