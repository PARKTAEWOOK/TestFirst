package test;

public class programmers7_6 {
//    다음 큰 숫자 https://school.programmers.co.kr/learn/courses/30/lessons/12911
//자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.
//
//            조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
//    조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
//            조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
//    예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.
//
//    자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.
//      입출력 예
//        n    result
//       78	    83
//        15	23
    public static void main(String[] args) {
//        int a= 78;
        int a= 15;
        solution(a);
    }
    public static int solution(int n) {
        int answer = 0;

        int curOne = toBinary(n);

        while(true) {
            int nextOne = toBinary(++n);
            if(curOne == nextOne) break;
        }
        answer = n;
        System.out.println(answer );
        return answer;
    }

    //2진수로 변환했을 때 1의 개수
    private static int toBinary(int n) {
        System.out.println("int n : " + n);
        int one = 1;

        while(n > 1) {
            System.out.println( " n %2 = " + n % 2);
            if(n % 2 == 1) {
                one++;
            }
            n /= 2;
        }

        System.out.println(one);
        return one;
    }
}
