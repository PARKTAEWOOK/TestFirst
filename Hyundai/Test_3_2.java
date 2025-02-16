package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/app/assessment/index.html?xid=423225&xsrfToken=ht4ev7iufWSO9gRR7iys7stSm5zjxlfT&testType=practice   Hanyang Popularity Exceeding Competition
 */
public class Test_3_2 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int returnValue = 0;
    int N = Integer.parseInt(br.readLine());
    int[][] arr = new int[N][2];
    for (int i = 0; i < N; i++) {
      String[] s = br.readLine().split(" ");
      for (int j = 0; j < 2; j++) {
        arr[i][j] = Integer.parseInt(s[j]);
      }
    }

    for (int i = 0; i < N; i++) {

      int calculation = arr[i][0]-returnValue;

      if (calculation < 0) calculation = calculation*-1;

      if ( calculation <= arr[i][1]) {

//        System.out.println("arr[i][0] : " + arr[i][0] + " arr[i][1] : " + arr[i][1]);
//        System.out.println("(arr[i][0]-returnValue) = " + (arr[i][0]-returnValue));

        returnValue++;
//        System.out.println(returnValue);
      }
    }

    System.out.println(returnValue);
  }

  public static void solution() throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    int X = 0;

    for(int i=0; i<N; i++){
      StringTokenizer st = new StringTokenizer(br.readLine());
      int P = Integer.parseInt(st.nextToken());
      int C = Integer.parseInt(st.nextToken());

      int absoluteValue = 0 ;
      if((P-X) < 0){
        absoluteValue = (P-X)*-1;
      }else{
        absoluteValue = (P-X);
      }

      if(absoluteValue <= C){
        X++;
      }

    }

    System.out.println(X);
  }
}
