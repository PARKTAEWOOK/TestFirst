package test;

import java.util.Collections;
import java.util.PriorityQueue;

public class programmers8_1 {
  //  코딩테스트 연습/ 연습문제 /야근 지수
  // https://school.programmers.co.kr/learn/courses/30/lessons/12927

//  제한 사항
//  works는 길이 1 이상, 20,000 이하인 배열입니다.
//  works의 원소는 50000 이하인 자연수입니다.
//  n은 1,000,000 이하인 자연수입니다.
//  입출력 예
//      works	    n   	result
//    [4, 3, 3]	  4	        12
//    [2, 1, 2]	  1       	6
//    [1,1]	      3	         0
  public static void main(String[] args) {

    int[] works = {1,3,6};
    int n = 4;
    System.out.println(solution(n,works));
  }

  public static long solution(int n, int[] works) {
//    이런 큐의 특성과 달린 우선순위 큐(Priority Queue)는 들어간 순서에 상관없이 일정한 규칙에 따라 우선순위를 선정하고, 우선순위가 가장 높은 데이터가 가장 먼저 나오게 됩니다.
        PriorityQueue<Integer> overtime = new PriorityQueue<>(Collections.reverseOrder());

    for (int work : works) {
      overtime.offer(work);
    }

    overtime.stream().forEach(System.out::println);

    for (int i = 0; i < n; i++) {
      int max = (int)overtime.poll();
      if (max <= 0) break;
      overtime.offer(max - 1);
    }

    return sumPow(overtime);
  }

  static long sumPow(PriorityQueue<Integer> works) {
    long sum = 0;
    while (!works.isEmpty()) {
      sum += Math.pow(works.poll(), 2);
    }
    return sum;
  }
}
