package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers7_3 {
//    빛의 경로 사이클 https://school.programmers.co.kr/learn/courses/30/lessons/86052
//각 칸마다 S, L, 또는 R가 써져 있는 격자가 있습니다. 당신은 이 격자에서 빛을 쏘고자 합니다. 이 격자의 각 칸에는 다음과 같은 특이한 성질이 있습니다.
//
//            빛이 "S"가 써진 칸에 도달한 경우, 직진합니다.
//            빛이 "L"이 써진 칸에 도달한 경우, 좌회전을 합니다.
//    빛이 "R"이 써진 칸에 도달한 경우, 우회전을 합니다.
//    빛이 격자의 끝을 넘어갈 경우, 반대쪽 끝으로 다시 돌아옵니다. 예를 들어, 빛이 1행에서 행이 줄어드는 방향으로 이동할 경우, 같은 열의 반대쪽 끝 행으로 다시 돌아옵니다.
//    당신은 이 격자 내에서 빛이 이동할 수 있는 경로 사이클이 몇 개 있고, 각 사이클의 길이가 얼마인지 알고 싶습니다. 경로 사이클이란, 빛이 이동하는 순환 경로를 의미합니다.
//
//    예를 들어, 다음 그림은 격자 ["SL","LR"]에서 1행 1열에서 2행 1열 방향으로 빛을 쏠 경우, 해당 빛이 이동하는 경로 사이클을 표현한 것입니다.

//    입출력 예
//           grid	    result
//      ["SL","LR"]	    [16]
//        ["S"]	        [1,1,1,1]
//        ["R","R"]	    [4,4]

    private static final int DIR_NUM = 4, MAX_SIZE = 500;
    private static int r, c;

    private static int[] dx = {1, 0, -1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static boolean[][][] visited = new boolean[MAX_SIZE][MAX_SIZE][DIR_NUM];
    private static int[][] value = new int[MAX_SIZE][MAX_SIZE];
    private static List<Integer> result = new ArrayList<>();


    public static void main(String[] args) {

        String[] grid = {"SL","LR"};
        solution(grid);
    }
    public static int[] solution(String[] grid) {
        initialize(grid);
        move();
        int[] answer = result.stream()
                .mapToInt(i -> i)
                .toArray();
        Arrays.sort(answer);

        Arrays.stream(answer).forEach(i -> System.out.print(i + " "));

        return answer;
    }
    private static void initialize(String[] grid) {
        r = grid.length;
        c = grid[0].length();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i].charAt(j) == 'S') {
                    value[i][j] = 0;
                } else if(grid[i].charAt(j) == 'L') {
                    value[i][j] = 1;
                } else {
                    value[i][j] = -1;
                }
            }
        }
    }

    private static  void move() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < DIR_NUM; k++) {
                    if (!visited[i][j][k]) {
                        result.add(moveRoute(i, j, k));
                    }
                }
            }
        }
    }

    private static int moveRoute(int x, int y, int d) {
        int cnt = 0;
        int nowX = x;
        int nowY = y;
        int nowD = d;
        while(true) {

            if (visited[nowX][nowY][nowD]) break;

            cnt++;
            visited[nowX][nowY][nowD] = true;

            int nx = (nowX + dx[nowD] + r) % r;
            int ny = (nowY + dy[nowD] + c) % c;

            int nd = (DIR_NUM + nowD + value[nx][ny]) % DIR_NUM;

            nowX = nx;
            nowY = ny;
            nowD = nd;
        }

        return cnt;
    }
}
//class Solution { https://jisunshine.tistory.com/175
//    static int R, C;
//    static int[] dr = { -1, 0, 1, 0 }, dc = { 0, -1, 0, 1 }; // 아래, 왼, 위, 오른
//    static boolean[][][] isVisited;
//
//    public int[] solution(String[] grid) {
//        ArrayList<Integer> answer = new ArrayList<Integer>();
//
//        R = grid.length;
//        C = grid[0].length();
//
//        isVisited = new boolean[R][C][4];
//        for (int i = 0; i < R; i++) {
//            for (int j = 0; j < C; j++) {
//                for (int d = 0; d < 4; d++) {
//                    if (!isVisited[i][j][d])
//                        answer.add(light(grid, i, j, d ));
//                }
//            }
//        }
//
//        return answer.stream().sorted().mapToInt(i -> i).toArray();
//    }
//
//    private static int light(String[] grid, int r, int c, int d) {
//        int cnt = 0; // 이동거리
//
//        while (true) {
//            if (isVisited[r][c][d])
//                break;
//
//            cnt++;	// 거리증가
//            isVisited[r][c][d] = true; // 방문처리
//
//            if (grid[r].charAt(c) == 'L')
//                d = d == 0 ? 3 : d - 1; // 좌회전
//            else if (grid[r].charAt(c) == 'R')
//                d = d == 3 ? 0 : d + 1; // 우회전
//
//            r = (r + dr[d] + R) % R;
//            c = (c + dc[d] + C) % C;
//        }
//
//        return cnt;
//    }
//}