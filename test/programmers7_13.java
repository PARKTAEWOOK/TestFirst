package test;

public class programmers7_13 {
//    타겟 넘버 https://school.programmers.co.kr/learn/courses/30/lessons/43165

//    제한사항
//    주어지는 숫자의 개수는 2개 이상 20개 이하입니다.
//    각 숫자는 1 이상 50 이하인 자연수입니다.
//    타겟 넘버는 1 이상 1000 이하인 자연수입니다.
//    입출력 예
//           numbers	        target  	return
//            [1, 1, 1, 1, 1]	3	        5
//            [4, 1, 2, 1]	    4	        2
//

    public static int answer;
    public static void main(String[] args) {
//        int[] nums = {1, 1, 1, 1, 1};
        int[] nums = {4, 1, 2, 1};
//        int target = 3;
        int target = 4;
        solution(nums, target);

    }

    public static int solution(int[] numbers, int target) {
//        int answer = 0;
        dfs(numbers, 0, target, 0);
        System.out.println("numbers.length = " + numbers.length);
        System.out.println(answer);
        return answer;
    }

    // 깊이 우선 탐색
    public static void dfs(int[] numbers, int depth, int target, int sum){
        if(depth == numbers.length){ // 마지막 노드 까지 탐색한 경우
            if(target == sum){
                System.out.println("sum is " + sum);
                System.out.println("depth is " + depth);
                answer++;
            }
        } else {
            System.out.println("depth: " + depth + ", target: " + target + ", sum: " + sum );
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }
}
