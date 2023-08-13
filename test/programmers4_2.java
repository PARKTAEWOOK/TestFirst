package test;

import java.util.Arrays;
import java.util.Comparator;

public class programmers4_2 {
//
//    0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//    예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
//
//    제한 사항
//    numbers의 길이는 1 이상 100,000 이하입니다.
//    numbers의 원소는 0 이상 1,000 이하입니다.
//    정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
//            입출력 예
//    가장 큰 수

    public static void main(String[] args){
        int[] a = {6, 10, 2};
        int[] a2 = {3, 30, 34, 5, 9};

        System.out.println(solution(a));

    }
    public static String solution(int[] numbers){
        String[] result = new String[numbers.length];
        for(int i =0; i< numbers.length; i++){
            result[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {

                System.out.println(" s2+s1 "+  s2+s1  +   "    " +  " s1 + s2 " + s1 + s2);
                return ((s2+s1).compareTo((s1 + s2)));
            }
        });
//        음수일 경우 : 두 원소의 위치를 교환 안함


//        양수일 경우 : 두 원소의 위치를 교환 함
        for(String i : result){
            System.out.print( i + "  ");
        }

        if(result[0].equals("0")){
            return "0";
        }

        String anwser = "";

        for(String a : result){
            anwser += a;
        }

        return anwser;
    }
}
