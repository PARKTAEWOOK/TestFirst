package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test_1_8_1 {

  public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());
    int[][] arcs = new int[N][K];
    HashMap<Integer, Integer> map = new HashMap<>();
//    System.out.println();
    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < K; j++) {
        arcs[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < K; j++) {
//        System.out.print(arcs[i][j] + " ");
        if(arcs[i][j] == 1){
          map.put(i+1, map.getOrDefault(i+1, 0) + 1);
        }
      }
//      System.out.println();
    }

    st = new StringTokenizer(br.readLine());
    int Start1 = Integer.parseInt(st.nextToken());
    int End1 = Integer.parseInt(st.nextToken());

    for(int i = Start1; i <= End1; i++){
      map.put(i, map.getOrDefault(i,0) -1 );
    }

    st = new StringTokenizer(br.readLine());
    int Start2 = Integer.parseInt(st.nextToken());
    int End2 = Integer.parseInt(st.nextToken());
    for(int i = Start2; i <= End2; i++){
      map.put(i, map.getOrDefault(i,0) -1 );
    }

    int ans = 0;
    for(int i=0;i<N;i++){
//      System.out.println(map.get(i));
     if(map.get(i+1) > 0){
       ans+=map.get(i+1);
     }
    }

    System.out.println(ans);

  }
}
