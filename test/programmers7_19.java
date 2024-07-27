package test;

import java.util.Arrays;
import java.util.stream.Stream;

public class programmers7_19 {
//    단어 변환 https://school.programmers.co.kr/learn/courses/30/lessons/43163
//두 개의 단어 begin, target과 단어의 집합 words가 있습니다. 아래와 같은 규칙을 이용하여 begin에서 target으로 변환하는 가장 짧은 변환 과정을 찾으려고 합니다.
//
//1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
//2. words에 있는 단어로만 변환할 수 있습니다.
//    제한사항
//    각 단어는 알파벳 소문자로만 이루어져 있습니다.
//    각 단어의 길이는 3 이상 10 이하이며 모든 단어의 길이는 같습니다.
//    words에는 3개 이상 50개 이하의 단어가 있으며 중복되는 단어는 없습니다.
//    begin과 target은 같지 않습니다.
//    변환할 수 없는 경우에는 0를 return 합니다.
//            입출력 예
//            begin	target	            words	                        return
//            "hit"	"cog"	["hot", "dot", "dog", "lot", "log", "cog"]	4
//            "hit"	"cog"	["hot", "dot", "dog", "lot", "log"]	        0
    public static int answer;
    public static boolean[] visited;
    public static void main(String[] args) {

        String begin = "hit";
        String target = "cog";

        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        solution(begin, target, words);
    }
    public static int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return answer;
    }
    public static void dfs(String begin, String target, String[] words, int cnt) {
        System.out.println("begin: " + begin + ", target: " + target + ", cnt: " + cnt);
        if (begin.equals(target)) {
            answer = cnt;
            return;
        }
//        System.out.println(visited[cnt]);
        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue;
            }

            int k = 0;    // 같은 스펠링 몇개인지 세기
            for (int j = 0; j < begin.length(); j++) {
                if (begin.charAt(j) == words[i].charAt(j)) {
                    k++;
                }
            }

            if (k == begin.length() - 1) {  // 한글자 빼고 모두 같은 경우
                visited[i] = true;
                dfs(words[i], target, words, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
