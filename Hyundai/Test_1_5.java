package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/app/assessment/index.html?xid=358398&xsrfToken=an3rUDl1SK0qDhVrrGdDDr00lgIM1xAA&testType=practice
 */
public class Test_1_5 {
  static int n, minDist, cnt;
  static int[] town;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st;
    n = Integer.parseInt(br.readLine());
    st = new StringTokenizer(br.readLine());
    town = new int[n];
    minDist = Integer.MAX_VALUE;
    for(int i=0; i<n; i++) {
      town[i] = Integer.parseInt(st.nextToken());
      if(i != 0) minDist = Math.min(minDist, town[i]-town[i-1]);
    }
    comb(new int[2], 0, 0);
    System.out.println(cnt);
  }
  private static void comb(int[] pick, int idx, int p) {

    if(p == pick.length) {
      if(minDist == pick[1]-pick[0]) cnt++;
      return;
    }

    if(idx == n) {
      return;
    }

    for(int i=idx; i<n; i++) {
      pick[p] = town[i];
      comb(pick, i+1, p+1);
    }

  }

}
