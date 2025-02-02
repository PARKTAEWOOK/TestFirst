package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/9657
 */
public class Test_1_8 {

  public static void main(String[] args) throws Exception, IOException {
    int answer = 0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<Integer, Integer> map = new HashMap<>();
    StringTokenizer st = new StringTokenizer(br.readLine());
    int row = Integer.parseInt(st.nextToken());
    int column = Integer.parseInt(st.nextToken());


    int [][] arr = new int[row][column];
    for(int i=0; i<row; i++){
      StringTokenizer st2 = new StringTokenizer(br.readLine());
      for(int j=0; j<column; j++){
        arr[i][j] = Integer.parseInt(st2.nextToken());
        map.put(i, map.getOrDefault(i, 0)+arr[i][j]);
      }
    }
    StringTokenizer st3 = new StringTokenizer(br.readLine());
    int firstStart = Integer.parseInt(st3.nextToken());
    int firstEnd = Integer.parseInt(st3.nextToken());
    StringTokenizer st4 = new StringTokenizer(br.readLine());
    int secondStart = Integer.parseInt(st4.nextToken());
    int secondEnd = Integer.parseInt(st4.nextToken());

    System.out.print("row="+row + " ");
    System.out.println("column="+column);

    for(int i=0; i<row; i++){
      for(int j=0; j<column; j++){
        System.out.print(arr[i][j]+" ");

      }
      System.out.println("");
    }

    for (int i=0; i<row; i++) {
      if(firstStart-1 <= i && i <= firstEnd-1){
        map.put(i, map.get(i)-1);
      }
      if(secondStart-1 <= i && i <= secondEnd-1){
        map.put(i, map.get(i)-1);
      }
      System.out.println("map.get(i)="+map.get(i));
      if(map.get(i) > 0){
        answer += map.get(i);
      }
    }

    System.out.println(answer);
  }
}
//0 0 1 0 0 0 1 0
//    0 0 0 1 0 0 0 0
//    0 0 1 0 0 1 1 0
//    0 0 0 0 1 0 0 0
//    0 0 0 0 0 0 0 0
//    0 0 0 1 0 0 0 0
