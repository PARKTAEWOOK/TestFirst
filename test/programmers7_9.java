package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class programmers7_9 {
//    영어 끝말잇기 https://school.programmers.co.kr/learn/courses/30/lessons/12981
//      문제 설명
//  1부터 n까지 번호가 붙어있는 n명의 사람이 영어 끝말잇기를 하고 있습니다. 영어 끝말잇기는 다음과 같은 규칙으로 진행됩니다.
//
//    1번부터 번호 순서대로 한 사람씩 차례대로 단어를 말합니다.
//    마지막 사람이 단어를 말한 다음에는 다시 1번부터 시작합니다.
//    앞사람이 말한 단어의 마지막 문자로 시작하는 단어를 말해야 합니다.
//    이전에 등장했던 단어는 사용할 수 없습니다.
//    한 글자인 단어는 인정되지 않습니다.

//    정답은 [ 번호, 차례 ] 형태로 return 해주세요


//    입출력 예
//      n	words	                                                                                             result
//        3	["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]	                        [3,3]
//        5	["hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"]	[0,0]
//        2	["hello", "one", "even", "never", "now", "world", "draw"]	                                            [1,3]
    public static void main(String[] args) {
//        int n = 3;
//        int n = 5;
        int n = 2;
//        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        solution(n, words);
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();
        boolean flag = true;

        for(int i=0; i<words.length; i++){
            if(list.contains(words[i])){   // 이전에 등장한 단어인경우
                System.out.println(words[i]);
                System.out.println("i :"+i);
                System.out.println("n :"+n);
                System.out.println("(i%n) :"+(i%n));
                System.out.println("(i/n) :"+(i/n));
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }

            list.add(words[i]); // 현재 단어 리스트에 넣기

            // 이전 끝단어와 현재 첫단어가 다른경우 - 끝말잇기가 아닌경우
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)){
                System.out.println("이전 단어 : " +words[i-1].charAt(words[i-1].length()-1));
                System.out.println("지금 단어 : " +words[i].charAt(0));
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                flag = false;
                break;
            }
        }
        if(flag) return new int[]{0, 0};
        return answer;
    }

    public static int[] solution2(int n, String[] words) {
        int[] answer = { 0, 0 };
        char chEnd = words[0].charAt(words[0].length() - 1);
        char chStart;
        System.out.print(chEnd + " ");
        HashSet<String> log = new HashSet<>();
        log.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            chStart = words[i].charAt(0);
            log.add(words[i]);
            if (chEnd != chStart || log.size() != i + 1) {
                System.out.print(i + 1 + "!");
                answer[0] = (i % n)+1;
                answer[1] = (i / n) + 1;
                break;
            }

            chEnd = words[i].charAt(words[i].length() - 1);
            System.out.print(chEnd + " ");
        }
        System.out.println();
        System.out.println("(" + answer[0] + ", " + answer[1] + ")");
        return answer;
    }
}
