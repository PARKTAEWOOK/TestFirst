package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test_3_6_1 {
  static class Microbe{
    int idx;
    int size;
    Microbe(int idx, int size){
      this.idx = idx;
      this.size = size;
    }
    @Override
    public String toString() {
      return "Microbe [idx=" + idx + ", size=" + size + "]";
    }
  }
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    Deque<Microbe> curDeque = new LinkedList<>();
    Deque<Microbe> nextDeque = new LinkedList<>();

    for(int i = 0; i < N; i++){
      curDeque.offerLast(new Microbe(i+1, Integer.parseInt(st.nextToken())));
    }

    while (curDeque.size()>1){
      while(!curDeque.isEmpty()){
        Microbe microbe = curDeque.pollFirst();
        if(!curDeque.isEmpty()){
          Microbe nextMicrobe = curDeque.pollFirst();
//          System.out.println(microbe.toString() );
//          System.out.println(nextMicrobe.toString());
          if(microbe.size >= nextMicrobe.size){
            nextDeque.offerLast(new Microbe(microbe.idx, microbe.size + nextMicrobe.size));
          }else if (nextMicrobe.size >= microbe.size){
            nextDeque.offerLast(new Microbe(nextMicrobe.idx, microbe.size + nextMicrobe.size));
          }
        }else{
//          System.out.println("last : " + microbe.toString() );
          Microbe nextMicrobe = nextDeque.pollLast();
//          System.out.println("nextMicrobe last : " + nextMicrobe.toString() );
          if(microbe.size >= nextMicrobe.size){
            nextDeque.offerLast(new Microbe(microbe.idx, microbe.size + nextMicrobe.size));
          }
        }

      }

//      System.out.println("---------");
      curDeque = nextDeque;
      nextDeque = new LinkedList<>();
    }

//    System.out.println(curDeque.pollFirst().toString());
    Microbe answer = curDeque.pollFirst();
    System.out.println(answer.size);
    System.out.println(answer.idx);

//    microbeList.stream().forEach(System.out::println);
  }

}
