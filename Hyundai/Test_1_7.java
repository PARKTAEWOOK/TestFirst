package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_1_7 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int T = Integer.parseInt(br.readLine()); // 첫번째 줄
    StringTokenizer st;
    st = new StringTokenizer(br.readLine());

    System.out.println("T="+T);
    for(int i = 0; i < T; i++){
      System.out.println("st.nextToken()="+st.nextToken());
    }
  }

}
