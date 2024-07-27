package test;

public class programmers2_1_4 {
//    올바른 괄호   https://school.programmers.co.kr/learn/courses/30/lessons/12909
//    문제 설명
//    괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
//
//      "()()" 또는 "(())()" 는 올바른 괄호입니다.
//      ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
//      '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
//
//            제한사항
//    문자열 s의 길이 : 100,000 이하의 자연수
//    문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
//
//          s	    answer
//        "()()"	true
//        "(())()"	true
//        ")()("	false
//        "(()("	false
    public static void main(String[] args) {
//        String s = "()()";
        String s = ")()(";

        System.out.println( "정답 : "+ solution2(s) );

    }


    public static boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static boolean solution2(String s) {
        int openCount = 0;
        int closeCount = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
            if (s.charAt(i) == '(') {
                openCount++;
            } else if (s.charAt(i) == ')') {
                closeCount++;
            }
            if (openCount < closeCount) {
                return false;
            }
        }
        if (openCount == closeCount) {
            return true;
        }
        return false;
    }
}
