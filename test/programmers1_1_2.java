package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class programmers1_1_2 {
//    문자열 my_string과 정수 n이 매개변수로 주어질 때, my_string의 뒤의 n글자로 이루어진 문자열을 return 하는 solution 함수를 작성해 주세요.

//    입출력 예
//    my_string	n	result
//"ProgrammerS123"	11	"grammerS123"
//        "He110W0r1d"	5	"W0r1d"
    public static void main(String[] args) {

        System.out.println(solution("abcdefg", 3));

    }

    public static String solution(String my_string, int n) {
        String answer = "";
//        my_string.substring(n);

        answer=my_string.substring(my_string.length()-n);
        return answer;
    }
}