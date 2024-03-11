package test;

public class programmers2_9 {
//   광물 캐기  https://school.programmers.co.kr/learn/courses/30/lessons/172927

//    비내림차순으로 정렬된 수열이 주어질 때, 다음 조건을 만족하는 부분 수열을 찾으려고 합니다.
//
//    기존 수열에서 임의의 두 인덱스의 원소와 그 사이의 원소를 모두 포함하는 부분 수열이어야 합니다.
//    부분 수열의 합은 k입니다.
//    합이 k인 부분 수열이 여러 개인 경우 길이가 짧은 수열을 찾습니다.
//    길이가 짧은 수열이 여러 개인 경우 앞쪽(시작 인덱스가 작은)에 나오는 수열을 찾습니다.
//    수열을 나타내는 정수 배열 sequence와 부분 수열의 합을 나타내는 정수 k가 매개변수로 주어질 때, 위 조건을 만족하는 부분 수열의 시작 인덱스와 마지막 인덱스를 배열에 담아 return 하는 solution 함수를 완성해주세요. 이때 수열의 인덱스는 0부터 시작합니다.

//    picks	            minerals	                                                                                        result
//    [1, 3, 2]	["diamond", "diamond", "diamond", "iron", "iron", "diamond", "iron", "stone"]	                            12
//    [0, 1, 1]	["diamond", "diamond", "diamond", "diamond", "diamond", "iron", "iron", "iron", "iron", "iron", "diamond"]	50
    public static void main(String[] args){
//        System.out.println(solution(id_list1,report1,k1));
        int[] sequences = {1,2,3,4,5};
        int k = 7;

        System.out.println(solution2(sequences,k));
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = {};
        return answer;
    }

    public static int[] solution2(int[] sequence, int k) {
        int N = sequence.length;
        int left = 0, right = N;
        int sum = 0;
        for(int L = 0, R = 0; L < N; L++) {
            while(R < N && sum < k) {
                sum += sequence[R++];
            }

            if(sum == k) {
                int range = R - L - 1;
                if((right - left) > range) {
                    left = L;
                    right = R - 1;
                }
            }

            sum -= sequence[L];
        }

        int[] answer = {left, right};

        return answer;
    }
}
