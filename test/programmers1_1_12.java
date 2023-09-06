package test;

import java.util.Scanner;
import java.util.stream.IntStream;

public class programmers1_1_12 { 
//    자연수 뒤집어 배열로 만들기
//    문제 설명
//    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
//
//    제한 조건
//    n은 10,000,000,000이하인 자연수입니다.

//             n	return
//            12345	[5,4,3,2,1]

    public static void main(String[] args) {
        long n = 12345;

        System.out.println(solution(n));

    }


    public static int[] solution(long n) {
        String s =""+n; //String에 n 추가
        System.out.println(s + " ddddd " +  s.length());
        int[] answer = new int[s.length()];//입력받은 숫자의 길이만큼
        int cnt=0;
        while(n>0) {
            answer[cnt]=(int)(n%10);//12345 -> 나머지 5 -> 4 -> 3 -> 2 ->1
            n/=10; // n=1234 -> 123 -> -> 12 -> 1
            cnt++;
        }
       for(int i=0; i< answer.length; i++){
           System.out.println(answer[i]);
       }
        return answer;
    }
}
