package test;

public class programmers1_1_4 {

//    숫자로만 이루어진 문자열 n_str이 주어질 때, n_str을 정수로 변환하여 return하도록 solution 함수를 완성해주세요.
//
//    n_str	result
//      "10"	10
//        "8542"	8542
    public static void main(String[] args) {

        System.out.println(solution("1111"));

    }

    public static int solution(String n_str) {
        int answer = 0;
        answer = Integer.parseInt(n_str);
        return answer;
    }
}
