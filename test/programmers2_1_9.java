package test;

import java.util.HashMap;
import java.util.Map;

public class programmers2_1_9 {

//    문자열 나누기  https://school.programmers.co.kr/learn/courses/30/lessons/140108
//    문제 설명
//    문자열 s가 입력되었을 때 다음 규칙을 따라서 이 문자열을 여러 문자열로 분해하려고 합니다.
//
//    먼저 첫 글자를 읽습니다. 이 글자를 x라고 합시다.
//    이제 이 문자열을 왼쪽에서 오른쪽으로 읽어나가면서, x와 x가 아닌 다른 글자들이 나온 횟수를 각각 셉니다. 처음으로 두 횟수가 같아지는 순간 멈추고, 지금까지 읽은 문자열을 분리합니다.
//    s에서 분리한 문자열을 빼고 남은 부분에 대해서 이 과정을 반복합니다. 남은 부분이 없다면 종료합니다.
//    만약 두 횟수가 다른 상태에서 더 이상 읽을 글자가 없다면, 역시 지금까지 읽은 문자열을 분리하고, 종료합니다.
//    문자열 s가 매개변수로 주어질 때, 위 과정과 같이 문자열들로 분해하고, 분해한 문자열의 개수를 return 하는 함수 solution을 완성하세요.

//    제한사항
//      1 ≤ s의 길이 ≤ 10,000
//      s는 영어 소문자로만 이루어져 있습니다.
//
//    입출력 예
//    s	        result
//  "banana"	        3
//  "abracadabra"	    6
//  "aaabbaccccabba"	3
//
    public static void main(String[] args) {
        String t = "abracadabra";
//        String t = "foobar";
        System.out.println(t);
        System.out.println( "정답 : "+ solution2(t) );

    }

    public static int solution(String s) {
        int answer = 1;

        char x = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (count == 0) {
                answer++;
                x = s.charAt(i);
            }

            if (x == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }

        return answer;
    }

    public static int solution2(String s) {
        int answer = 1;

        char x = s.charAt(0);
        System.out.println("Char :" + x);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            System.out.println("count:" + count);
            if (count == 0) {
                answer++;
                x = s.charAt(i);
                System.out.println("charAt : " +s.charAt(i) );
            }
            System.out.println("charAt222 : " +s.charAt(i) );
            if (x == s.charAt(i)) {
                count++;
            } else {
                count--;
            }
        }


        return answer;
    }


}
