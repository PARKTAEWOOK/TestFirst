package test;

import java.util.HashMap;
import java.util.Map;

public class programmers7_2 {

//    도넛과 막대 그래프 https://school.programmers.co.kr/learn/courses/30/lessons/258711#

    //
//    문제 설명
//    도넛 모양 그래프, 막대 모양 그래프, 8자 모양 그래프들이 있습니다. 이 그래프들은 1개 이상의 정점과, 정점들을 연결하는 단방향 간선으로 이루어져 있습니다.
//
//    크기가 n인 도넛 모양 그래프는 n개의 정점과 n개의 간선이 있습니다. 도넛 모양 그래프의 아무 한 정점에서 출발해 이용한 적 없는 간선을 계속 따라가면 나머지 n-1개의 정점들을 한 번씩 방문한 뒤 원래 출발했던 정점으로 돌아오게 됩니다. 도넛 모양 그래프의 형태는 다음과 같습니다.
//

//    입출력 예
//    edges	                                                                                                                                  result
//         [[2, 3], [4, 3], [1, 1], [2, 1]]	                                                                                                [2, 1, 1, 0]
//        [[4, 11], [1, 12], [8, 3], [12, 7], [4, 2], [7, 11], [4, 8], [9, 6], [10, 11], [6, 10], [3, 5], [11, 1], [5, 3], [11, 9], [3, 8]]	[4, 0, 1, 2]
    public static void main(String[] args) {

        int[][] edges = {{2,3},{4,4},{1,1},{2,1}};

        solution(edges);

    }

    public static int[] solution(int[][] edges) {
        Map<Integer, Integer> out = new HashMap<>();
        Map<Integer, Integer> in = new HashMap<>();
        int[] answer = new int[4];

        for (int[] edge : edges) { // (1)
            System.out.println(" out : " + edge[0] + " IN : " + edge[1]);
            out.put(edge[0], out.getOrDefault(edge[0], 0) + 1);
            in.put(edge[1], in.getOrDefault(edge[1], 0) + 1);
        }

        for (int node : out.keySet()) {
            System.out.println( "out Kesy : " + node + " : " + out.get(node));

            if (out.get(node) > 1) { // (2)

                if (!in.containsKey(node)) {
                    answer[0] = node;
                } else {
                    answer[3] += 1;
                }
            }
        }

        for (int node : in.keySet()) {
            System.out.println( "in Kesy : " + node + " : " + in.get(node));
            if (!out.containsKey(node)) { // (3)
                answer[2] += 1;
            }
        }
        answer[1] = out.get(answer[0]) - answer[2] - answer[3]; // (4)
        return answer;
    }

//    (1) a -> b 간선이라면 in에 b를, out에 a를 저장한다.
//            (2) out 간선 개수가 2개 이상인 정점 중에서 in 간선이 없으면 생성한 정점이고, 있으면 8자 그래프이다.
//            (3) in 간선이 있는 정점 중에서 out 간선이 없으면 막대 그래프이다.
//            (4) 도넛 그래프 개수는 생성한 정점의 out 간선 개수 - 막대 그래프 개수 - 8자 그래프 개수이다.
}
