package 문자열2.형성평가.형성평가3;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, count = 0;
        String[] arr = new String[50];

        while(true){
            arr[i] = sc.next();
            if(arr[i].equals("0")) break;
            i++;
            count++;
        }
        System.out.println(count);
        for(int j=0; j<i; j++){
            if(j%2==0) System.out.println(arr[j]);
        }
        sc.close();
    }
}
