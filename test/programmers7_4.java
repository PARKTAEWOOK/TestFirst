package test;

import java.util.Arrays;

public class programmers7_4 {
//    최솟값 만들기 https://school.programmers.co.kr/learn/courses/30/lessons/12941
//    제한사항
//    배열 A, B의 크기 : 1,000 이하의 자연수
//    배열 A, B의 원소의 크기 : 1,000 이하의 자연수
//    입출력 예
//        A	        B	    answer
//      [1, 4, 2]	[5, 4, 4]	29
//        [1,2]	    [3,4]	10
    public static void main(String[] args) {
        int[] a = {1,4,2}; int[] b = {5,4,4};
        solution(a,b);
    }
    public static int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);

        Arrays.stream(A).forEach(i -> System.out.println(i));
        Arrays.sort(B);
        System.out.println("b length :  "+B.length);
        System.out.println("b length :  "+B[2]);
        for(int i = 0; i < A.length; i++) {
            System.out.println(B[B.length - 1 - i]);
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }

}
