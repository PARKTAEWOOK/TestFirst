package test;

import java.util.ArrayList;
import java.util.List;

public class programmers7_5 {
//    이진 변환 반복하기 https://school.programmers.co.kr/learn/courses/30/lessons/70129#
//    입출력 예
//          s	            result
//  "110010101001"	        [3,8]
//        "01110"	        [3,3]
//        "1111111"     	[4,1]

//    0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
    public static void main(String[] args) {
        String s = "110010101001";
        solution2(s);
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        int cnt = 0; //변환 횟수
        int zero = 0; //제거된 0 개수

        while(!s.equals("1")) {
            int length = s.length(); //원래 문자열의 길이
            s = s.replace("0", ""); //0 제거
            zero += length - s.length(); //원래 문자열 길이 - 0을 제거한 문자열 길이 = 제거한 0의 개수
            length = s.length();

            //이진수 변환
            List<Integer> list = new ArrayList<>();
            while(length > 1) {
                list.add(length % 2);
                length /= 2;
            }

            StringBuilder sb = new StringBuilder();
            sb.append("1");
            for(int i = list.size() - 1; i >= 0; i--) {
                sb.append(list.get(i));
            }

            s = sb.toString();
//          s = Integer.toBinaryString(length);
            cnt++;//횟수 증가
        }

        answer[0] = cnt;
        answer[1] = zero;

        return answer;
    }

    public static int[] solution2(String s) {
        System.out.println(" s :" + s);
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            System.out.println("s :" + s);
            answer[1] += s.length();
            System.out.println(" answer[1] :" + answer[1]);
            s = s.replaceAll("0", "");
            System.out.println(" replace s :" + s);
            temp = s.length();
            System.out.println(" replace s length:" + s.length());
            s = Integer.toBinaryString(temp);
            System.out.println("toBinaryString s : " + s );
            answer[0]++;
            answer[1] -= temp;
        }

        System.out.println(" answer[0] :" + answer[0]);
        System.out.println(" answer[1] :" + answer[1]);

        return answer;
    }
}
