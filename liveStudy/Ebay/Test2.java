package liveStudy.Ebay;

import java.util.LinkedList;
import java.util.Queue;

public class Test2 {
    public static void main(String[] args){
        int[] test1 = {1, 2, 4, 1, 2, 3};
//
//        [1, 2, 3, 4]	4
//                [1, 2, 4, 1, 2, 3]	5
//                [4, 3, 2, 1, 4]	3
//                [4, 3, 2, 1]	0
//                [1, 10, 5, 11, 7]	15
//
        System.out.println(solution(test1));

        // Calculating the max profit
//        int ans = maxProfit(test1, test1.length);
        // Print the answer
//        System.out.println(ans);

    }
    public static int solution(int[] prices) {
        int answer = 0;
        int sumValue1 = 0;
        int sumValue2 = 0;
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i<prices.length; i++){
          q.offer(prices[i]);
        }

        while (!q.isEmpty()){

            System.out.println(q.peek());

            sumValue1 = q.peek();
            q.poll();
            if(!q.isEmpty()){
                if(sumValue1 < q.peek()){
                    System.out.println("peek    "+q.peek());
                    sumValue2 = q.peek();
                    answer += sumValue2 - sumValue1;
                }
                else{
                    q.poll();
                }
            }


        }

        if(answer < 0){
            answer = 0 ;
        }
        return answer;
    }


    private static int maxProfit(int[] prices, int n) {
        int maxSP[] = new int[n];
        int max = Integer.MIN_VALUE;
        // Construct the maxSP array
        for (int i = n - 1; i >= 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
                maxSP[i] = Integer.MIN_VALUE;
            } else {
                maxSP[i] = max;
            }
        }
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (maxSP[i] != Integer.MIN_VALUE) {
                profit = Math.max(profit, maxSP[i] - prices[i]);
            }
        }
        // Return profit
        return profit;
    }

}
