package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/6253
 *
 */
public class Test_1_3 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());


    if( A < B){
      System.out.println("B");
    }
    else if (A>B) {
      System.out.println("A");
    }
    else{
      System.out.println("same");
    }

  }

}
