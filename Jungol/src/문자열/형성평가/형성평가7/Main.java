package 문자열.형성평가.형성평가7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String what = sc.nextLine();
        String[] array = what.split(" ");
        for(int i=1; i<=array.length; i++){
            System.out.println(i + ". " + array[i-1]);
        }
        sc.close();
    }
}
