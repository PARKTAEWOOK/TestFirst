package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class programmers4_3 {
    // H - Index
    // 인덱스랑 비교했을때 같거나 인덱스가 더 큰 값을 구하세요.
    public static void main(String[] args){
        int[] a = {3, 0, 6, 1, 5};

        System.out.println(" 정답   "+solution(a));
    }

    public static int solution(int[] citations) {
        int answer = 0;

        Integer[] a = new Integer[citations.length];
        for(int i=0; i<citations.length; i++){
            a[i] = citations[i];
        }
        Arrays.sort(a, Collections.reverseOrder());

        for(int i=0; i<citations.length; i++){
           System.out.println(a[i]);
           if( i >= a[i]){
               break;
           }
           else{
               answer++;
           }
        }
        return answer;
    }
}
