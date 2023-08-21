package test;

public class programmers1_1_9 {
//      3진법 뒤집기 https://school.programmers.co.kr/learn/courses/30/lessons/68935
//    문제 설명
//    자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
//n 	result
//45	7
//125	229
    public static void main(String[] args) {

       int a = 45;

        System.out.println(solution(a));
    }

    public static int solution(int n) {
        String str = "";

        while (n != 0) {
            str += n % 3;
            n /= 3;
        }

        return Integer.parseInt(str, 3);
    }
}
