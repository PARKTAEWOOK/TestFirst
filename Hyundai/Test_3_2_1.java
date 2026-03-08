package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test_3_2_1 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int totalLine = Integer.parseInt(st.nextToken());
    int[][] arggs = new int[totalLine][2];

    for(int i =0; i <totalLine; i++){
      st = new StringTokenizer(br.readLine());
      for(int j=0; j<2; j++){
        arggs[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    int ans=0;
    for(int i=0; i<totalLine; i++){
      if(arggs[i][0]-ans < 0 ){
        if((arggs[i][0]-ans)*-1 <= arggs[i][1]){
          ans++;
        }
      }else{
        if(arggs[i][0]-ans<= arggs[i][1]){
          ans++;
        }

      }
    }

    System.out.println(ans);
  }
}
