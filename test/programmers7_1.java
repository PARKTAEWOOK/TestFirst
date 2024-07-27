//package test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.PriorityQueue;
//
//import static javax.swing.text.html.HTML.Attribute.N;
//
//public class programmers7_1 {
////    상담원 인원    https://school.programmers.co.kr/learn/courses/30/lessons/214288?language=java
////      참가자가 상담 요청을 하면 아래와 같은 규칙대로 상담을 진행합니다.
////
////    상담을 원하는 참가자가 상담 요청을 했을 때, 참가자의 상담 유형을 담당하는 멘토 중 상담 중이 아닌 멘토와 상담을 시작합니다.
////    만약 참가자의 상담 유형을 담당하는 멘토가 모두 상담 중이라면, 자신의 차례가 올 때까지 기다립니다. 참가자가 기다린 시간은 참가자가 상담 요청했을 때부터 멘토와 상담을 시작할 때까지의 시간입니다.
////    모든 멘토는 상담이 끝났을 때 자신의 상담 유형의 상담을 받기 위해 기다리고 있는 참가자가 있으면 즉시 상담을 시작합니다. 이때, 먼저 상담 요청한 참가자가 우선됩니다.
////    참가자의 상담 요청 정보가 주어질 때, 참가자가 상담을 요청했을 때부터 상담을 시작하기까지 기다린 시간의 합이 최소가 되도록 각 상담 유형별로 멘토 인원을 정하려 합니다. 단, 각 유형별로 멘토 인원이 적어도 한 명 이상이어야 합니다.
////
////    예를 들어, 5명의 멘토가 있고 1~3번의 3가지 상담 유형이 있을 때 아래와 같은 참가자의 상담 요청이 있습니다.
////    참가자의 상담 요청
////입출력 예
////     k    n	        reqs	                                                                                             result
////      3	5	[[10, 60, 1], [15, 100, 3], [20, 30, 1], [30, 50, 3], [50, 40, 1], [60, 30, 2], [65, 30, 1], [70, 100, 2]]	25
////      2	3	[[5, 55, 2], [10, 90, 2], [20, 40, 2], [50, 45, 2], [100, 50, 2]]	                                           90
//
//    public static class Point {
//        int s, d;
//
//        public Point(int s, int d) {
//            this.s = s;
//            this.d = d;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("항ㄴ녕");
//        int k = 3;
//        int n = 5;
//        int[][] reqs= {{10, 60, 1},{15, 100, 3},{20, 30, 1}};
//
////        solution(k,n,reqs);
//    }
//
////    public static int solution(int k, int n, int[][] reqs) {
////        int answer = 0;
////        return answer;
////    }
//
//
//   //작업 배열
////    int[][] requiredTime; //k유형에 n명의 멘토가 있을때 소요 시간
////    int K, N;
//
//    public static int calTotalMinTime() {
//        int remain = N - K;
//        int[] mentorCnt = new int[K];
//        Arrays.fill(mentorCnt, 1);
//        while(remain-- > 0) {
//            int maxDiff = 0;
//            int maxIndex = 0;
//            for (int i = 0; i < K; i++) {
//                if (mentorCnt[i] == N - K + 1) continue;
//                int diff = requiredTime[i][mentorCnt[i]] - requiredTime[i][mentorCnt[i] + 1];
//                if (maxDiff < diff) {
//                    maxDiff = diff;
//                    maxIndex = i;
//                }
//            }
//            mentorCnt[maxIndex]++;
//        }
//        //결과 계산
//        int sum = 0;
//        for (int i = 0; i < K; i++)
//            sum += requiredTime[i][mentorCnt[i]];
//        return sum;
//    }
//    //k유형에 cnt명의 멘토가 있을떄 소요시간 계산
//
////    public static int calTime(int k, int cnt) {
////        int result = 0;
////        PriorityQueue<Integer> q = new PriorityQueue<>();
////        for (int i = 0; i < cnt; i++) q.add(0);
////        for (Point cust : reqList[k]) {
////            Integer cur = q.poll();
////            //해당 멘토의 종료시간 갱신 및 대기 시간 더해줌
////            if (cur <= cust.s)
////                q.add(cust.s + cust.d);
////            else {
////                result += cur - cust.s;
////                q.add(cur + cust.d);
////            }
////        }
////        return result;
//////    }
//////    public static int solution(int k, int n, int[][] reqs) {
////        //초기화
////        int K, N;
////        List<Point>[] reqList;
////        int[][] requiredTime;
////
////        reqList = new List[k];
////        for (int i = 0; i < k; i++) reqList[i] = new ArrayList<>();
////        for (int i = 0; i < reqs.length; i++)
////            reqList[reqs[i][2] - 1].add(new Point(reqs[i][0], reqs[i][1]));
////        requiredTime = new int[k][n - k + 2];
////        K = k; N = n;
////        //유형별 멘토수에 따른 대기 시간 계산
////        for (int i = 0; i < k; i++)
////            for (int j = 1; j < n - k + 2; j++)
////                requiredTime[i][j] = calTime(i, j);
////        //각 유형별 멘토수 설정 후 대기시간의 최소시간 계산
////        return calTotalMinTime();
////    }
//}
