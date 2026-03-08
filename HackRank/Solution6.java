package HackRank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-dequeue/problem?isFullScreen=true
 * DeQue
 */
public class Solution6 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque deque = new ArrayDeque<>();
    int n = in.nextInt();
    int m = in.nextInt();

    int[] arrays = new int[n];
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      arrays[i] = num;
    }

    int maxnum = 0;
    for(int i=0; i<=n-m; i++){
      HashSet<Integer> hash = new HashSet<>();
      for(int j=0; j<m; j++){
        hash.add(arrays[i+j]);
      }
      maxnum = Math.max(maxnum, hash.size());
    }

    System.out.print(maxnum);
  }

}
