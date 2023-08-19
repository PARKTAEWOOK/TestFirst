package test;

public class programmers1_1_7 {
//    약수의 합
//    문제 설명
//    정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.


//          n	return
//            12	28
//            5	6
    public static void main(String[] args) {


//        System.out.println(solution(num_lists,3));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i=1; n  >= i ; i++){
            if( n % i == 0){
                answer+=i;
            }
        }
        return answer;
    }
}
