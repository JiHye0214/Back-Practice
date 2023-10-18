package 문자열2.형성평가.형성평가5;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];
        for(int i=0; i<5; i++){
            arr[i] = sc.next();
        }

        char one = sc.next().charAt(0);
        String two = sc.next();
        int count = 0;

        for(int i=0; i<5; i++){
            // 이새끼 contains 못 써먹어가지고 몇 분을 낭비하였으며
            // 코드 몇 십 줄을 낭비할 뻔 했네?
            // 괜찮아 이제 알았자나
            if(arr[i].contains(Character.toString(one)) || arr[i].contains(two)){
                System.out.println(arr[i]);
                count++;
            }
        }

        if(count==0) System.out.println("none");

        sc.close();
    }
}

