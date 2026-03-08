package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/6294
 */
public class Test_3_7 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int [] score = new int[N];

    st = new StringTokenizer(br.readLine());

    for(int i = 0; i < N; i++){
      score[i] = Integer.parseInt(st.nextToken());
    }

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < K; i++){
      st = new StringTokenizer(br.readLine());

      int start = Integer.parseInt(st.nextToken());
      int end = Integer.parseInt(st.nextToken());

      double sum = 0;

      for(int j = start; j <= end; j++){
        sum += score[j-1];
      }

      //sb.append(Math.round(sum/(end-start+1) * 100)/100.0).append("\n");
      sb.append(String.format("%.2f",sum/(end-start+1))).append("\n");
    }
    System.out.println(sb);
  }

}
