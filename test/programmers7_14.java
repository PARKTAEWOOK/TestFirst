package test;

import java.util.HashMap;
import java.util.Map;

public class programmers7_14 {
//    롤케이크 자르기 https://school.programmers.co.kr/learn/courses/30/lessons/132265
//롤케이크에 올려진 토핑들의 번호를 저장한 정수 배열 topping이 매개변수로 주어질 때, 롤케이크를 공평하게 자르는 방법의 수를 return 하도록 solution 함수를 완성해주세요.
//
//    제한사항
//            1 ≤ topping의 길이 ≤ 1,000,000
//            1 ≤ topping의 원소 ≤ 10,000
//    입출력 예
//          topping	            result
//[1, 2, 1, 3, 1, 4, 1, 2]  	2
//        [1, 2, 3, 1, 4]	    0
    public static void main(String[] args) {
//        int[] toppings = new int[]{1, 2, 1, 3, 1, 4, 1, 2};
        int[] toppings = new int[]{1, 2, 3, 1, 4};
        solution(toppings);
    }
    public static int solution(int[] topping) {
        int answer = 0;

        Map<Integer, Integer> map_1 = new HashMap<>(); // 형
        Map<Integer, Integer> map_2 = new HashMap<>(); // 동생

        for (int e : topping) {
            map_2.put(e, map_2.getOrDefault(e, 0) + 1);
        }

        for(int i : map_2.keySet()){
            System.out.println("key : "+i+" value : "+map_2.get(i) );
        }


        for (int e : topping) {

            map_1.put(e, map_1.getOrDefault(e, 0) + 1);
            System.out.println("map 1_ key : "+e+" value : "+map_1.get(e) );
            if (map_2.get(e) - 1 == 0)
                map_2.remove(e);
            else
                map_2.put(e, map_2.get(e) - 1);

            System.out.println("map_1 size : "+map_1.size() + " map_2 size : "+map_2.size() );
            if (map_1.size() == map_2.size())
                answer++;
        }

        return answer;
    }

}
