package 배열.형성평가.형성평가6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] array = {'J', 'U', 'N', 'G', 'O', 'L'};
        char num = sc.next().charAt(0);
        int i, find=0 ;
        boolean flag = false;

        for(i=0; i<array.length; i++) {
            if(array[i] == num){
                find = i;
                flag = true;
            }
        }

        if(flag == true){
            System.out.println(find);
        } else {
            System.out.println("none");
        }

        sc.close();
    }
}

