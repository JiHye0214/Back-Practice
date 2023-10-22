package 구조체.자가진단.자가진단6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inform = new String[5];
        String[][] arr = new String[5][3];
//        String[] name = new String[5];
        Double[] weight = new Double[5];

        for(int i=0; i<5; i++){
            inform[i] = sc.nextLine();
            arr[i] = inform[i].split(" ");
//            String inform = sc.nextLine();
//            arr[i] = inform.split(" "); // 한줄씩 문자열로 받아서 분리
//            name[i] = arr[i][0]; // 체중만 집어넣기
            weight[i] = Double.valueOf(arr[i][2]); // 체중만 집어넣기
        }

        Arrays.sort(inform); // 뭘 정렬할까 -> 이름을 정렬하네?
//        Arrays.sort(name); // 이름 정렬
        // Collection.reverseOrder() : 역순 정렬 --> reference 타입만 가능 -> double(x) Double(o)
        Arrays.sort(weight, Collections.reverseOrder()); // 체중 정렬

        System.out.println("name");
        for(String i : inform){
            System.out.println(i);
        }
//        for(String N : name){
//            for(int j=0; j<5; j++){
//                if(N == arr[j][0]){
//                    for(String k : arr[j]){
//                        System.out.printf("%s ", k);
//                    }
//                    System.out.println();
//                }
//            }
//        }

        System.out.println("\nweight");
        for(double H : weight){
            for(int j=0; j<5; j++){
                if(H == Double.valueOf(arr[j][2])){
                    for(String k : arr[j]){
                        System.out.printf("%s ", k);
                    }
                    System.out.println();
                }
            }
        }
    }
}