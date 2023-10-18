package 문자열2.형성평가.형성평가2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = {"flower", "rose", "lily", "daffodil", "azalea" };
        char one = sc.next().charAt(0);
        int count=0;

        for(int i=0; i<5; i++){
            if(one == arr[i].charAt(1) || one == arr[i].charAt(2)){
                System.out.println(arr[i]);
                count++;
            }
        }
        if(count != 0){
            System.out.println(count);
        } else System.out.println("0");
        sc.close();
    }
}
