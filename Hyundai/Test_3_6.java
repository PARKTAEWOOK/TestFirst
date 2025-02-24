package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 * https://softeer.ai/practice/7697
 */
public class Test_3_6 {
  static Deque<Integer> nx = new LinkedList<>();
  static int N;
  static HashMap<Integer, Integer> map = new HashMap<>();
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());

    for (int i = 0; i < N; i++) {
      map.put(i, Integer.parseInt(st.nextToken()));
    }

    for (int i = 0; i < N; i++) {
      System.out.println(map.get(i));
      getPhiSquared(i);
    }

    System.out.println("nx.size() = " + nx.size());
    for(int i = 0; i < nx.size(); i++){
      System.out.println(nx.poll());
    }
  }

  public static int getPhiSquared(int indexNumber){
    int sum = 0;
    System.out.println("indexNumber = " + indexNumber);
    if(indexNumber == (N-1)) return 0;

    if(indexNumber == 0){
      if (map.get(indexNumber) >= map.get(indexNumber+1))
        nx.offer(map.get(indexNumber)+map.get(indexNumber+1));
    }

    if(indexNumber > 0) {
      if (!(map.get(indexNumber - 1) >= map.get(indexNumber))) {
        if (map.get(indexNumber) >= map.get(indexNumber + 1)) {
          sum = map.get(indexNumber) + map.get(indexNumber + 1);
          System.out.println("sum = " + sum);
          nx.offer(sum);
        }
      }
    }
    return 0;
  }
}
