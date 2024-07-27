package test;

import java.util.Arrays;
import java.util.Stack;

public class programmers7_7 {

//    짝지어 제거하기 https://school.programmers.co.kr/learn/courses/30/lessons/12973

    public static void main(String[] args) {

        String a = "baabaa";
        solution2(a);
    }
    public static int solution(String s)
    {
        int answer = -1;

        String[] words = s.split("");

        Arrays.stream(words).sorted().forEach(i -> System.out.println(i));

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }

    public static int solution2(String s){
        int answer = -1;
        char[] carr = s.toCharArray();

        Stack<Character> stack = new Stack<>();
    // Stack : L I F O
        for (int i=0;i<carr.length;i++) {
            char c = carr[i];
            System.out.println("char :" + c);
            // 스택이 비어있다면 현재 문자는 반복될 일이 없으므로 push
            if (stack.isEmpty()) stack.push(c);
                // 스택이 비어있지 않다면
            else {
                // 스택의 top확인(peek) - 만약 현재 문자와 같다면 반복이므로 스택에서 pop하고 현재 문자도 스택에 넣지 않음
                // 이렇게 되면 스택에는 반복이 발생하는 이전문자와 현재문자 모두 들어가지 않게 됨 (반복제거)
                if (stack.peek() == c) {
                    System.out.println("stack :" + stack);
//                    System.out.println("stack.peek :" + stack.peek());
                    stack.pop();
                    // 스택의 top이 현재 문자와 다르다면 반복이 아니므로 push
                } else {
                    stack.push(c);
                }
            }
        }
        // 스택에 남아있는 값들은 반복되지 않는 값들임 즉, 비어있어다면 모두 짝지어 반복된 것
        return stack.isEmpty() ? 1 : 0;
    }
}
