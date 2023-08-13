package test;

import java.util.ArrayList;
import java.util.List;

public class programmers5_1 {
    // 완전탐색
    // 모의고사
    public static void main(String[] args){

        int[] answers1 = {1,2,3,4,5};
        int[] answers2 = {1,3,2,4,2};

        System.out.println(1%5);
        solution(answers2);
//       solution(answers1);
    }

    public static int[] solution(int[] answers) {
//        int[] answer = {};

        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};

        int[] cnt = new int[3];

        for(int i= 0; i< answers.length ; i++){
//            System.out.println( "person1   "+ person1[i%5]);
//            System.out.println( "person2   "+ person2[i%8]);
//            System.out.println( "person3  "+ person3[i%10]);

            if(answers[i] == person1[i%5]) cnt[0]++;
            if(answers[i] == person2[i%8]) cnt[1]++;
            if(answers[i] == person3[i%10]) cnt[2]++;
        }

        int max = Math.max(cnt[0], Math.max(cnt[1],cnt[2]));

        List<Integer> list = new ArrayList<>();

        if( max == cnt[0])
            list.add(1);
        if( max == cnt[1])
            list.add(2);
        if( max == cnt[2])
            list.add(3);

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }

        return answer;
    }
}
