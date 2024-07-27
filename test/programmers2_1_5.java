package test;

public class programmers2_1_5 {

//    피보나치 수  https://school.programmers.co.kr/learn/courses/30/lessons/12945
//    문제 설명
//    피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//
//    예를들어
//
//    F(2) = F(0) + F(1) = 0 + 1 = 1
//    F(3) = F(1) + F(2) = 1 + 1 = 2
//    F(4) = F(2) + F(3) = 1 + 2 = 3
//    F(5) = F(3) + F(4) = 2 + 3 = 5
//    와 같이 이어집니다.
//
//  2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.
//
//            제한 사항
//    n은 2 이상 100,000 이하인 자연수입니다.
//
//    n	return
//            3	2
//            5	5
    public static void main(String[] args) {
        int i = 2;

        System.out.println( "정답 : "+ solution(i) );

    }


    public static int solution(int n) {
        int answer = fibo(n);
        System.out.println(answer);
        return answer;
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
