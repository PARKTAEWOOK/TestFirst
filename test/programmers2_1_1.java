package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;

public class programmers2_1_1 {
//    최댓값과 최솟값  https://school.programmers.co.kr/learn/courses/30/lessons/12939
//    문제 설명
//    문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
//    예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

//               s	        return
//            "1 2 3 4"	    "1 4"
//            "-1 -2 -3 -4"	"-4 -1"
//            "-1 -1"	    "-1 -1"
    public static void main(String[] args) {
       String number  = "1 2 3 4";

        System.out.println(solution(number));

    }


    public static String solution(String s) {
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[] slist = s.split(" ");
        for(int i =0 ; i<slist.length; i ++){
//            System.out.println(Integer.parseInt(slist[i]));
            arr.add(Integer.parseInt(slist[i]));
        }
        answer = "" + Collections.min(arr) + " " + Collections.max(arr);

        return answer;


//        String[] array = str.split(" ");
//        int[] arrayInt = new int[array.length];
//
//        for (int i = 0; i < arrayInt.length; i++) {
//            arrayInt[i] = Integer.parseInt(array[i]);
//        }
//
//        Arrays.sort(arrayInt);
//        String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];
//
//        return result;
    }
}
