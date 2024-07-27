package test;

import java.util.ArrayList;

public class programmers2_1_7 {

//    크기가 작은 부분문자열  https://school.programmers.co.kr/learn/courses/30/lessons/147355
//
//    숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서, 이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
//
//    예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다. 이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
//
//    제한사항
//    1 ≤ p의 길이 ≤ 18
//    p의 길이 ≤ t의 길이 ≤ 10,000
//    t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.
//
//
//            입출력 예
//          t	            p	    result
//       "3141592"	        "271"	2
//       "500220839878"	    "7"	    8
//       "10203"	        "15"	3
    public static void main(String[] args) {
        String t = "3141592";
//        String t = "500220839878";
        String p = "271";
//        String p = "7";

        System.out.println( "정답 : "+ solution2(t,p) );

    }


   public static int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length();
        for(int i=0; i < t.length()-pLength; i++){
//            System.out.println(t.substring(i,i+pLength).toString());
            if(Integer.valueOf(t.substring(i,i+pLength).toString()) <= Integer.valueOf(p)){
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(String t, String p) {
        int length = t.length() - p.length() + 1;
        System.out.println(length);
        long pNum = Long.parseLong(p);
        System.out.println(pNum);
        System.out.println(Integer.valueOf(p));
        int answer = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("i :" + i + " length:" + length + " p.length():" + (i +p.length()));
            String temp = t.substring(i, i + p.length());
            System.out.println(temp);
            if (Long.parseLong(temp) <= pNum) {
                answer++;
            }
        }
        return answer;
    }

}
