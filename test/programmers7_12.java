package test;

public class programmers7_12 {
//    피로도 https://school.programmers.co.kr/learn/courses/30/lessons/87946

//    제한사항
//    k는 1 이상 5,000 이하인 자연수입니다.
//    dungeons의 세로(행) 길이(즉, 던전의 개수)는 1 이상 8 이하입니다.
//            dungeons의 가로(열) 길이는 2 입니다.
//    dungeons의 각 행은 각 던전의 ["최소 필요 피로도", "소모 피로도"] 입니다.
//      "최소 필요 피로도"는 항상 "소모 피로도"보다 크거나 같습니다.
//      "최소 필요 피로도"와 "소모 피로도"는 1 이상 1,000 이하인 자연수입니다.
//    서로 다른 던전의 ["최소 필요 피로도", "소모 피로도"]가 서로 같을 수 있습니다.
//            입출력 예
//    k	        dungeons	        result
//  80	[[80,20],[50,40],[30,10]]	3

    public static int answer; // 최대 던전 수
    public static boolean[] visited; // 방문 여부
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeon = {{80,20},{50,40},{30,10}};
        solution(k,dungeon);
     }

    public static int solution(int k, int[][] dungeons) {
        // dungeons 배열의 길이만큼 방문 여부 배열 선언
        visited = new boolean[dungeons.length];
        System.out.println("dungeons: " + dungeons.length);
        // dfs 메서드 호출
        dfs(0, k, dungeons);

        // 결과 반환
        return answer;
    }

    public static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            // 방문하지 않은 상태면서 k가 최소 필요 피로도보다 크거나 같은 경우
            System.out.println("visited[i] :" + visited[i]  );
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true; // 방문 처리
                dfs(depth + 1, k - dungeons[i][1], dungeons); // 재귀 호출
                visited[i] = false; // 방문 초기화
            }
        }

        System.out.println("answer :"+answer);
        System.out.println("depth : "+depth);

        answer = Math.max(answer, depth);
    }

}
