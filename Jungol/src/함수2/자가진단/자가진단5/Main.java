package 함수2.자가진단.자가진단5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] function(double[] array) {
        // 상빠 올림 하빠 내림 중빠 반올림
        int[] arr = new int [3];

        Arrays.sort(array); // 오름정렬
        double high = array[2];
        double low = array[0];
        double middle = array[1];

        arr[0] = (int)Math.ceil(high);
        arr[1] = (int)Math.floor(low);
        arr[2] = (int)Math.round(middle);

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[3];
        for(int i=0; i<3; i++){
            array[i] = sc.nextDouble();
        }
        int[] result = function(array);
        for(int i : result){
            System.out.print(i + " ");
        }
        sc.close();
    }
}