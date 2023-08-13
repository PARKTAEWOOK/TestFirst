package ProgrammersTest.Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test1_4 {
//    슈퍼 게임 개발자 오렐리는 큰 고민에 빠졌다. 그녀가 만든 프랜즈 오천성이 대성공을 거뒀지만, 요즘 신규 사용자의 수가 급감한 것이다. 원인은 신규 사용자와 기존 사용자 사이에 스테이지 차이가 너무 큰 것이 문제였다.
//
//    이 문제를 어떻게 할까 고민 한 그녀는 동적으로 게임 시간을 늘려서 난이도를 조절하기로 했다. 역시 슈퍼 개발자라 대부분의 로직은 쉽게 구현했지만, 실패율을 구하는 부분에서 위기에 빠지고 말았다. 오렐리를 위해 실패율을 구하는 코드를 완성하라.
//
//    실패율은 다음과 같이 정의한다.
//    스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수

//    스테이지의 개수 N은 1 이상 500 이하의 자연수이다.
//    stages의 길이는 1 이상 200,000 이하이다.
//            stages에는 1 이상 N + 1 이하의 자연수가 담겨있다.
//    각 자연수는 사용자가 현재 도전 중인 스테이지의 번호를 나타낸다.
//            단, N + 1 은 마지막 스테이지(N 번째 스테이지) 까지 클리어 한 사용자를 나타낸다.
//    만약 실패율이 같은 스테이지가 있다면 작은 번호의 스테이지가 먼저 오도록 하면 된다.
//    스테이지에 도달한 유저가 없는 경우 해당 스테이지의 실패율은 0 으로 정의한다.

//    N	        stages	               result
//     5	[2, 1, 2, 6, 2, 4, 3, 3]	[3,4,2,1,5]
//     4	[4,4,4,4,4]             	[4,1,2,3]

//    입출력 예 #1
//            1번 스테이지에는 총 8명의 사용자가 도전했으며, 이 중 1명의 사용자가 아직 클리어하지 못했다. 따라서 1번 스테이지의 실패율은 다음과 같다.
//
//                      1       번 스테이지 실패율 : 1/8
//            2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.
//
//              2 번 스테이지 실패율 : 3/7
//      마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
//
//            3 번 스테이지 실패율 : 2/4
//            4번 스테이지 실패율 : 1/2
//            5번 스테이지 실패율 : 0/1
//    각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.
//
//            [3,4,2,1,5]
    public static void main(String[] args){
        int[] stage = {2, 1, 2, 6, 2, 4, 3, 3};
        int challeneStage = 5;

        solution2(challeneStage,stage);
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = {};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int stage : stages){
            hm.put(stage, hm.getOrDefault(stage, 0) + 1);
        }


        for( int key : hm.keySet() ){
            System.out.println("key  : " + key + " value : " + hm.get(key) );
//            answer *= (hm.get(key) + 1);
        }

        return answer;
    }

    public static int[] solution2(int N, int[] stages) {
        int[] answer = new int[N];
        Map<Integer,Double> map = new HashMap<>();
        //<stage,failureRate>

        for(int i=1; i<=N; i++) {
            int stage = i;
            int noClearPlayer = 0;
            int currentStagePlayer = 0;

            for(int j=0; j < stages.length; j++) {
                int player = stages[j];

                //현재 스테이지 클리어 못한사람
                if(stage == player) {
                    noClearPlayer++;
                }
                //현재 스테이지 도전자
                if(stage<=player) {
                    currentStagePlayer++;
                }
            }

            //스테이지에 도달한 유저가 없는 경우 실패율 = 0
            //실패율 = 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수 (도전자수)
            double failureRate = 0;
            if(noClearPlayer!=0 && currentStagePlayer!=0) {
                failureRate = (double)noClearPlayer / (double)currentStagePlayer;
            }
            System.out.println(  " stage : " +stage + "  noClearPlayer : " + noClearPlayer + "  currentStagePlayer   :  " +currentStagePlayer);
            System.out.println( "failureRate : " +failureRate  );
            map.put(stage, failureRate);

        }

        //value순 정렬하여 answer배열에 넣기
        for(int i=0; i<N; i++) {
            double max = -1;
            int maxKey = 0;
            for(Integer key : map.keySet()) {
                if(max < map.get(key)) {
                    max = map.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey;
            map.remove(maxKey);
        }

        System.out.println(Arrays.toString(answer));


        return answer;


    }
}
