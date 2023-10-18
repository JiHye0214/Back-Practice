package 문자열2.형성평가.형성평가1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String what = sc.nextLine();
        String[] array = what.split(" ");
        for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
        sc.close();
    }
}
