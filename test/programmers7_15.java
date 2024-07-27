package test;

public class programmers7_15 {
//    행렬의 덧셈 https://school.programmers.co.kr/learn/courses/30/lessons/12950
//제한 조건
//    행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
//            입출력 예
//              arr1	        arr2	    return
//            [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
//            [[1],[2]]	    [[3],[4]]	    [[4],[6]]
    public static void main(String[] args) {
        int[][] arr1={{1,2},{2,3}};
        int[][] arr2={{3,4},{5,6}};

        solution(arr1,arr2);

    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println(arr1[i][j] +  arr2[i][j]);
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
