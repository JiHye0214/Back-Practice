package 문자열2.형성평가.형성평가8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String one = sc.next();
            if(one.equals("END")) break;
            String[] arr = one.split("");
            for(int i=arr.length-1; i>=0; i--){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
