package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/7628
 */
public class Test_1_11 {
  static int n;
  static int[] stoves;
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    n = Integer.parseInt(br.readLine());
    stoves = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i=0; i<n; i++) {
      stoves[i] = Integer.parseInt(st.nextToken());
    }
        /*
        주어진 배열에서 이들의 공약수를 구한다. 가장 많은 수의 공약수인 값을 찾아내는 문제.
        n도 최대 100개, 반지름의 최대 크기도 100.
        해봤자 10000번이니까 시초 안날것 같다.
        */
    int ans = 0;
    for(int i=2; i<=100; i++) {
      int cnt = 0;
      for(int j=0; j<n; j++) {
        if(stoves[j] % i == 0){
          cnt++;
          System.out.println(i);
        }
      }
      ans = Math.max(ans, cnt);
    }
    System.out.println(ans);

  }

}
