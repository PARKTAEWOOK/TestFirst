package test;

import java.util.Arrays;

public class programmers7_18 {
//    문자열 다루기 기본 https://school.programmers.co.kr/learn/courses/30/lessons/12918
//문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
//
//    제한 사항
//    s는 길이 1 이상, 길이 8 이하인 문자열입니다.
//    s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
//    입출력 예
//              s	    return
//            "a234"	false
//            "1234"	true
    public static void main(String[] args) {
        String s="a234";
        System.out.println(solution(s));
    }
    public static boolean solution(String s) {

//        char[] c=s.toCharArray();
//        Arrays.sort(c);
//
//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//        }

        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
    public static boolean solution1(String s) {
        if(s.length() == 4 || s.length() == 6){
            try{
                int x = Integer.parseInt(s);
                return true;
            } catch(NumberFormatException e){
                return false;
            }
        }
        else return false;
    }
}
