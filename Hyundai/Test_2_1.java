package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/6283
 */
public class Test_2_1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] n = new int[8];

    for (int i = 0; i < n.length; i++) {
      n[i] = Integer.parseInt(st.nextToken());
    }

    int[] ascending = {1,2,3,4,5,6,7,8};
    int[] descending = {8,7,6,5,4,3,2,1};

    if (Arrays.equals(ascending, n)) {
      System.out.println("ascending");
    }
    else if (Arrays.equals(descending, n)) {
      System.out.println("descending");
    }
    else {
      System.out.println("mixed");
    }
  }

}
