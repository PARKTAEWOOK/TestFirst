package test;

import java.util.HashMap;

public class programmers1_3 {

    public static void main(String[] args){

        String[][] cloths = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] cloths2 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};

        System.out.println( " 조합할 수 있는 총 개수는 " + String.valueOf(solution(cloths)));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        if(clothes == null){
            return answer;
            // 주석
        }

        HashMap<String, Integer> hm = new HashMap<>();
        // 종류 별 의상 수 계산 (key = 의상 , value = 의상 수 (누적)))
        for(String[] Items : clothes){
            System.out.println(Items[1]); // 종류에 따른 아이템
            System.out.println(hm.getOrDefault(Items[1],0)+1); // Items[1] 은 의상의 종류
            hm.put( Items[1], hm.getOrDefault(Items[1],0)+1);
        }

        // 각 의상의 조합 수를 수학적 확률로 계산
        // 종류 별로 의상의 수를 이용하여 조합의 수를 계산한다.
        // 모자 A 개, 안경 B 개 , 상의 C 개  = A * B * C
        // 입지 않는 의상 종류가 있을 수 있어 이를 고려하여 조 합
        // 모자 A 개, 안경 B 개 , 상의 C 개인 경우 조합의 수 = (a+1) * ( B+1) * (c+1)
        // 최소 1개의 의상은 입어야 하므로 모두 입지 않는 경우는 제외 합니다.
        //  ((a+1) * ( B+1) * (c+1))-1

        for( String key : hm.keySet() ){
            System.out.println("key  : " + key + " value : " + hm.get(key) );
            answer *= (hm.get(key) + 1);
        }

        answer -= 1;

        return answer;
    }
}
