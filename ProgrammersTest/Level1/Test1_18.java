package ProgrammersTest.Level1;

public class Test1_18 {
//
//    0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
//    numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를
//        return 하도록 solution 함수를 완성해주세요.

//
//          numbers	            result
//            [1,2,3,4,6,7,8,0]	14
//            [5,8,4,0,6,7,9] 	6
    public static void main(String[] args){

         int[] numberList = {1,2,3,4,6,7,8,0};
         int[] numberList2 = {5,8,4,0,6,7,9};

        System.out.println(solution(numberList2));
    }

    public static int solution(int[] numbers) {
        int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}
