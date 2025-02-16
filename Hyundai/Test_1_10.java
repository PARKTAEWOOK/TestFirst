package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/9497 * 못풀었음
 */
public class Test_1_10 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    System.out.println("Case " + N + ":" );
    for (int i = 0; i < N; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < N; j++) {
        int a = Integer.parseInt(st.nextToken());
        System.out.print("  a  : " + a);
      }
      System.out.println("");
    }

  }
//6
//1 2 5 4 6 3
//6 4 3 2 1 5
//3 6 2 1 5 4
//2 3 1 5 4 6
//4 5 6 3 2 1
//5 1 4 6 3 2
  public static String passPasvie(String str) {

    return str;
  }

}
