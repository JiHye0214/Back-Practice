package 구조체.형성평가.형성평가5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        String[][] inform = new String[num][4];
        int[] total = new int[num];

        for(int i=0; i<num; i++){
            inform[i] = sc.nextLine().split(" ");
            for(int j=1; j<4; j++){
                total[i] += Integer.parseInt(inform[i][j]);
            }
        }
        Arrays.sort(total); // 역순 정렬

        for(int i=num-1; i>=0; i--){
            for(int j=0; j<num; j++){
                if(total[i] == Integer.parseInt(inform[j][1]) + Integer.parseInt(inform[j][2]) + Integer.parseInt(inform[j][3])){
                    for(String k : inform[j]){
                        System.out.print(k + " ");
                    }
                    System.out.print(total[i] + "\n");
                }

            }
        }

        sc.close();
    }
}
