package test;

import java.util.Arrays;

public class programmers1_1_5 {
//    n 번째 원소부터
//    정수 리스트 num_list와 정수 n이 주어질 때, n 번째 원소부터 마지막 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.

//    num_list	n	result
//              [2, 1, 6]	3	[6]
//        [5, 2, 1, 7, 5]	2	[2, 1, 7, 5]
    public static void main(String[] args) {

        int[] num_lists = {2,1,6};
//        System.out.println(solution(num_lists,3));
        System.out.println(solution(num_lists,3));
    }

    public static int[] solution(int[] num_list, int n) {
//        int[] answer = new int[num_list.length-n + 1];
//        int check_num= 1;
//        int arry_num=0;
//        for(int i=0; num_list.length > i; i++ ){
//            System.out.println(num_list[i]);
//            if(check_num >= n){
//                answer[arry_num] = num_list[i];
//                arry_num++;
//            }
//            check_num++;
//        }
//        return answer;
        return Arrays.copyOfRange(num_list, n - 1, num_list.length);
    }
}
