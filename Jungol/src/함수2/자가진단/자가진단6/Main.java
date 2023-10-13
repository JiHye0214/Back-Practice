package 함수2.자가진단.자가진단6;

public class Main {
    public static void function() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d + %d = %d\n", arr1[i], arr2[j], arr1[i] + arr2[j]);
            }
        }
    }
    public static void main(String[] args) {
        function(); // #define
    }
}
