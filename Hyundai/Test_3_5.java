package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/7703
 */
public class Test_3_5 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine()); //8

    StringBuilder sb = new StringBuilder();

    for(int i = 0; i < N; i++){
      int Pi = 0;
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      String Si = st.nextToken(); //Exit
      String Ti = st.nextToken(); //Alin

      for(int j = 0; j < Si.length(); j++){
        if(Si.charAt(j) == 'x' || Si.charAt(j) == 'X'){
          Pi = j;
          break;
        }
      }

      sb.append(Character.toUpperCase(Ti.charAt(Pi)));
    }
    String answer = sb.toString();

    System.out.println(answer);

  }

}
