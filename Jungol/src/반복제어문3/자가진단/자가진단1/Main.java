package 반복제어문3.자가진단.자가진단1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, sum=0, count=0, num = sc.nextInt();
        for(i=1; sum<num; i++){
            if(i%2!=0){
                sum+=i;
                ++count;
            }
        }
        System.out.print(count +" "+ sum);
        sc.close();
    }
}
