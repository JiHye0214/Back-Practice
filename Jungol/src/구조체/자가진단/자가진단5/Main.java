package 구조체.자가진단.자가진단5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 순서보장 map : LinkedHashMap<>
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<5; i++){
            String name = sc.next();
            int height = sc.nextInt();
            map.put(name,height);
        }

        // 최소 value 찾기
        // Integer에서 연산함수를 찾으려면 collections
        Integer minValue = Collections.min(map.values());

        // value 해당 key 찾기 - 함수가 딱히 없대..for문 써야 됨
        String findK = "";
        for(String key : map.keySet()){
            if(map.get(key).equals(minValue)){
                findK = key;
            }
        }
        System.out.print(findK + " " + minValue);
        sc.close();
    }
}
