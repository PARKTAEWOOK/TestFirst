package ProgrammersTest.Level1;

import java.util.Arrays;
import java.util.HashMap;

public class Test1_3 {
//    로또 6/45(이하 '로또'로 표기)는 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권입니다. 아래는 로또의 순위를 정하는 방식입니다. 1
//
//    순위	당첨 내용
//1	6개 번호가 모두 일치
//2	5개 번호가 일치
//3	4개 번호가 일치
//4	3개 번호가 일치
//5	2개 번호가 일치
//6(낙첨)	그 외


//    lottos는 길이 6인 정수 배열입니다.
//    lottos의 모든 원소는 0 이상 45 이하인 정수입니다.
//            0은 알아볼 수 없는 숫자를 의미합니다.
//            0을 제외한 다른 숫자들은 lottos에 2개 이상 담겨있지 않습니다.
//    lottos의 원소들은 정렬되어 있지 않을 수도 있습니다.
//    win_nums은 길이 6인 정수 배열입니다.
//    win_nums의 모든 원소는 1 이상 45 이하인 정수입니다.
//    win_nums에는 같은 숫자가 2개 이상 담겨있지 않습니다.
//    win_nums의 원소들은 정렬되어 있지 않을 수도 있습니다.


//            lottos	            win_nums        	    result
//      [44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	    [3, 5]
//        [0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
//        [45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	    [1, 1]
//    입출력 예 설명
//    입출력 예 #1
//    문제 예시와 같습니다.
//
//    입출력 예 #2
//    알아볼 수 없는 번호들이 아래와 같았다면, 1등과 6등에 당첨될 수 있습니다.
//
//    당첨 번호	38	19	20	40	15	25	결과
//    최고 순위 번호	0→38	0→19	0→20	0→40	0→15	0→25	6개 번호 일치, 1등
//    최저 순위 번호	0→21	0→22	0→23	0→24	0→26	0→27	0개 번호 일치, 6등
//    입출력 예 #3
//    민우가 구매한 로또의 번호와 당첨 번호가 모두 일치하므로, 최고 순위와 최저 순위는 모두 1등입니다.
    public static void main(String[] args){

//        System.out.println(solution2("23four5six7"));

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};


        System.out.println(solution2(lottos, win_nums));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (Integer zeroNum : lottos) {
            System.out.println( "player : " +  zeroNum);
            if(zeroNum == 0){
                hm.put(zeroNum, hm.getOrDefault(zeroNum, 0) + 1);
            }
        }



        return answer;
    }

    public static int[] solution2(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;

        for (int l : lottos) {
            if (l == 0) zero++;
            else {
                for (int w : win_nums) {
                    if (l == w) {
                        matched++;
                        break;
                    }
                }
            }
        }

        int min = matched;
        int max = matched + zero;


        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};

//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(Math.min(7 - max, 6));
//        System.out.println(Math.min(7 - min, 6));

//        static int min(int a , int b)
//        min() 함수는 두 인자 값 중 작은 값을 리턴하는 함수이다.

        return answer;
    }
}
