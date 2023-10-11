package 배열2.자가진단.자가진단1;

import java.util.Scanner;

// 복습
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 알파벳 배열 만들기 -> 필요 없음 : 출력 때 아스키코드로 만들면 됨
//        char[] array = new char[26];
//        for(char i='A'; i<='Z'; i++){
//            array[(int)i-65] = i;
//        }

        int[] count = new int[26];
        for(int j=0; j<count.length; j++){
            count[j]=0;
        }

        // 대문자 아니면 중단
        while(true){
            char alpa = sc.next().charAt(0);
            if((int)alpa >= 65 && (int)alpa <= 90){
//                if(alpa == array[(int)alpa-65]){ // 위 코드랑 같은 말을 하고 있음
                    count[(int)alpa-65] += 1;
            } else {
                break;
            }
        }
        for(int k=0; k<count.length; k++){
            if(count[k] != 0){
//                System.out.println(array[k] + " : " + count[k]);
                System.out.println((char)(int)(k+65) + " : " +  count[k]);
            }
        }
        sc.close();
        
        // 잘하긴 했는데 알파벳배열은 사실 필요 없었음
        // 아스키코드를 char, int, index로 활용만 잘 하면 배열 하나로 끝남.
        // 단순한 코드를 생각하자
    }
}
