package 문자열2.자가진단.자가진단7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String one = sc.next();
        String[] one1 = one.split("");
        String result = "No";

        for(int i=0; i<one1.length; i++){
            if(one1[i].equals("c")){
                result = "Yes";
            }
        }
        System.out.print(result + " ");
        result = "No";

        for(int i=0; i<one1.length-1; i++){
            if((one1[i]+one1[i+1]).equals("ab")){
                result = "Yes";
            }
        }
        System.out.println(result);
        sc.close();
    }
}
