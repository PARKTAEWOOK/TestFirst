package test;

import java.util.ArrayList;

public class programmers2_1_6 {

//    같은 숫자는 싫어  https://school.programmers.co.kr/learn/courses/30/lessons/12906
//
//
//     문제 설명
//    배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
//
//    arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
//            arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
//    배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
//
//            제한사항
//    배열 arr의 크기 : 1,000,000 이하의 자연수
//    배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
//
//          arr	        answer
//[1,1,3,3,0,1,1]	[1,3,0,1]
//     [4,4,4,3,3]	[4,3]
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};

        System.out.println( "정답 : "+ solution(arr) );

    }


    public static int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        //
        int value = -1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != value) {
                answerList.add(arr[i]);
                System.out.println(answerList);
                value = arr[i];
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }

    public static int fibo(int n) {
        int[] cache = new int[n+1];

        cache[0] = 0;
        cache[1] = 1;

        for (int i=2; i<= n; i++){
            // 99999와 같이 큰 수를 넣을 경우 int와 long타입의 범위를 넘어
            // 값들을 문제 조건에 맞게 1234567로 나눈 나머지로 저장
            cache[i] = (cache[i-1] + cache[i-2]) % 1234567;
        }

        return cache[n] % 1234567;
    }
}
