package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/7369
 */
public class Test_3_10 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st;
    int[][] asc = new int[N][N];
    for(int i = 0; i < N; i++){
      st = new StringTokenizer(br.readLine());
        for(int j = 0; j < N; j++){
          asc[i][j] = Integer.parseInt(st.nextToken());
        }
    }

    int answer1 = solution1(asc, N);
    int answer2 = solution2(asc, N);

    int result = Math.max(answer1, answer2);
    System.out.println(result);

  }

  static int solution1(int[][] asc, int N){
    int answer = 0;
    int maxSize = 0;
    for(int i = 0; i < N; i++){
      if(i == N-1){
        for(int j = 0; j < N; j++){
//          System.out.print(asc[i][j]);
          answer += asc[i][j];
          maxSize = Math.max(maxSize, asc[i][j]);
        }
      }else{
//        System.out.print(asc[i][0]);
        answer += asc[i][0];
        maxSize = Math.max(maxSize, asc[i][0]);
      }

      if(i == N-1){
//        System.out.println();
//        System.out.println("maxSize is " + maxSize);
        answer +=maxSize;
      }
//      System.out.println();
    }

//    System.out.println("answer is " + answer);
    return answer;
  }

  static int solution2(int[][] asc, int N){
    int answer = 0;
    int maxSize = 0;
    for(int i = 0; i < N; i++){
      if(i == 0){
        for(int j = 0; j < N; j++){
//          System.out.print(asc[i][j]);
          answer += asc[i][j];
          maxSize = Math.max(maxSize, asc[i][j]);
        }
      }else{
//        System.out.print(asc[i][N-1]);
        answer += asc[i][N-1];
        maxSize = Math.max(maxSize, asc[i][N-1]);
      }

      if(i == N-1){
//        System.out.println();
//        System.out.println("maxSize is " + maxSize);
        answer +=maxSize;
      }
//      System.out.println();
    }

//    System.out.println("answer is " + answer);
    return answer;
  }
}
