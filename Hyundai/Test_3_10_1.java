package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_3_10_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[][] tree =  new int[n][n];

    for(int i = 0; i<n; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      for(int j =  0; j<n; j++){
        tree[i][j] =  Integer.parseInt(st.nextToken());
      }
    }
    int[][] sum =  new int[n][n];
    int[][] answer =  new int[n][n];

    sum[0][0] = tree[0][0];
    answer[0][0] = tree[0][0]*2;

    for(int i = 0; i<n; i++){
      for(int j = 0; j<n; j++){
        if(i>0){
          sum[i][j] =  Math.max(sum[i][j],sum[i-1][j]+tree[i][j]);
          answer[i][j] = Math.max(answer[i][j],answer[i-1][j] + tree[i][j]);
          answer[i][j] = Math.max(answer[i][j],sum[i-1][j]+tree[i][j]*2);
        }
        if(j>0){
          sum[i][j] =  Math.max(sum[i][j],sum[i][j-1]+tree[i][j]);
          answer[i][j] = Math.max(answer[i][j],answer[i][j-1] + tree[i][j]);
          answer[i][j] = Math.max(answer[i][j],sum[i][j-1]+tree[i][j]*2);
        }
      }
    }
    System.out.println(answer[n-1][n-1]);
  }
}
