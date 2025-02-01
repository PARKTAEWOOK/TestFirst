package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://softeer.ai/app/assessment/index.html?xid=357619&xsrfToken=V848tnDfZdqg2OXTvTQDGcZPMmI5ajS5&testType=practice
 *
 *
 */
public class Test_1_2 {
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine()); // 첫번째 줄

      for(int i = 0; i < T; i++) { //T 수 만큼 반복

        int five = Integer.parseInt(br.readLine());
        int five_div = five/5; //input값 나누기
        int five_mod = five%5; //input값 나머지
        System.out.println("five_div="+five_div+" five_mod="+five_mod);
        for( int k = 0; k < five_div; k++) { //input값 나누기 값 만큼 ++++ 입력
          System.out.print("++++ ");
        }

        if(five_div != 0 && five_mod > 0) { //input값 나누기 값이 0이아니고 나머지 값이 있는 경우

          for( int j = 0; j < five_mod; j++) {
            System.out.print("|");
          }

          System.out.print(" "); // 무의미

        }else if(five_div == 0) { // input값 나누기 값이 0인경우

          for( int j = 0; j < five_mod; j++) {
            System.out.print("|");
          }

          System.out.print(" "); // 무의미

        }

        System.out.println("");

      }
    }
}
