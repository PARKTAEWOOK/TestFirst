package test;

import java.util.Arrays;

public class programmers1_1_6 {
//    나이 출력
//    문제 설명
//    머쓱이는 40살인 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 나이 age가 주어질 때, 2022년을 기준 출생 연도를 return 하는 solution 함수를 완성해주세요.

//    age	result
//        40	1983
//        23	2000
    public static void main(String[] args) {


//        System.out.println(solution(num_lists,3));
        System.out.println(solution(40));
    }

    public static int solution(int age) {
        int answer = 0;
        answer = (2022 - age) + 1;
        return answer;
    }
}