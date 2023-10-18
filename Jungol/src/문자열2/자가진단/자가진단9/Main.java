package 문자열2.자가진단.자가진단9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr); // 애초에 고생하지 말라고 sort 만들어 줬잖아;;;
        for(int i=4; i>=0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
