package test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class programmers3_2 {

    static class Job{
        int requestTime;
        int workingTime;

        Job(int requestTime, int workingTime){
            this.requestTime = requestTime;
            this.workingTime = workingTime;
        }

        @Override
        public String toString(){
            return "Truck{" +
                    "requestTime=" + requestTime +
                    ", workingTime=" + workingTime +
                    '}';
        }
    }
    public static void main(String[] args){
//        [[0, 3], [1, 9], [2, 6]]	9
        int[][] jobs = {{0,3},{1, 9},{2,6}};
        System.out.println("정답 : " +  solution(jobs));
    }

    public static int solution(int[][] jobs) {
        LinkedList<Job> waiting = new LinkedList<>();
        PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
            @Override
            public int compare(Job j1, Job j2) {
                return j1.workingTime - j2.workingTime;
            }
        });

        System.out.println(" pq 값 : " + pq.toString());

        for(int[] job : jobs){
            waiting.offer(new Job( job[0],job[1] ));
        }

        Collections.sort(waiting, new Comparator<Job>() {
            @Override
            public int compare(Job t1, Job t2) {
                return t1.requestTime - t2.requestTime;
            }
        });
//        음수일 경우 : 두 원소의 위치를 교환 안함
//        양수일 경우 : 두 원소의 위치를 교환 함
        System.out.println(" waiting 값 : " + waiting.toString());


        int answer = 0;
        int cnt = 0;
        int time = waiting.peek().requestTime;

        while (cnt < jobs.length){
            System.out.println("Time 시간 : " + time);

            while (!waiting.isEmpty() && waiting.peek().requestTime <= time){
                System.out.println(" waiting.peek().requestTime 값 : " + waiting.peek().requestTime);
                pq.offer(waiting.pollFirst());
            }
            System.out.println(" pq2 값 : " + pq.toString());
            if(!pq.isEmpty()){
                Job job = pq.poll();
                System.out.println(" job 값 : " + job.toString());
                time += job.workingTime;
                answer += time - job.requestTime;

                System.out.println(" answer 값 : " + answer);

                cnt++;
            }
            else{
                time++;
            }
        }

        return answer / cnt ;
    }
}
