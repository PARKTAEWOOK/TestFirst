package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://softeer.ai/practice/6291
 */
public class Test_3_9 {

  public static void main(String args[]) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());

    Node[] lectures = new Node[N];

    for(int i = 0; i < N; i++){
      String[] time = br.readLine().split(" ");
      lectures[i] = new Node(Integer.parseInt(time[0]), Integer.parseInt(time[1]));
    }

    Arrays.sort(lectures);

    int answer = 0;
    int curTime = 0;

    for(Node lecture : lectures){
      if(lecture.start < curTime){
        continue;
      }else{
        answer++;
        curTime = lecture.end;
      }
    }

    System.out.println(answer);

  }

  static class Node implements Comparable<Node>{
    int start;
    int end;

    public Node(int start, int end){
      this.start = start;
      this.end = end;
    }

    public int compareTo(Node o){
      return this.end - o.end;
    }

  }


}
