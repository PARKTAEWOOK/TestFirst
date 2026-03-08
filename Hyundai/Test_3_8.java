package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/6293
 */
public class Test_3_8 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }

    int ans = 1;
    int max = arr[0];
    if(arr.length == 1){
      ans = 1;
    }else{
      for (int i = 1; i < arr.length; i++) {
        if(max < arr[i]){
          max = Math.max(max, arr[i]);
          ans++;

          System.out.println("MAX: " + max);
        }
      }
    }

    String d ="dddd-dddd";
    String[] dds = d.split("-");
    System.out.println(dds[0].substring(0,2));
for(int i=1;i<dds.length;i++){}
    System.out.println(ans);
  }
}

//class solution(){
//
//  int N = Integer.parseInt(br.readLine());
//  int[] bridge = new int[N];
//
//  st =new StringTokenizer(br.readLine(), " ");
//        for(
//  int i = 0;
//  i<N;i++)
//
//  {
//    bridge[i] = Integer.parseInt(st.nextToken());
//  }
//
//  // i번째 돌을 밟을 때의 최대 개수
//  int[] dp = new int[N];
//        for(
//  int i = 0;
//  i<N;i++)
//
//  {
//    dp[i] = 1;
//  }
//
//  int answer = 0; // 답
//
//        for(
//  int i = 0;
//  i<N;i++)
//
//  {
//    // i번째 돌을 밟을 때의 최대 개수 탐색 시작
//
//    for (int j = 0; j <= i; j++) {
//      if (bridge[i] > bridge[j]) {
//        // 그 다음 돌이 현재 돌보다 높이가 높을 때
//        dp[i] = Math.max(dp[i], dp[j] + 1);
//        // 현재 i번째 돌을 밟을 때의 최대 개수와 j번째 돌을 밟고 i번째 돌을 밟았을 때의 개수 중 최대값
//      }
//    }
//  }
//        for(
//  int i = 0;
//  i<N;i++)
//
//  {
//    answer = Math.max(answer, dp[i]);
//  }
//        System.out.println(answer);
//}
