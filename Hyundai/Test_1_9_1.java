package Hyundai;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Test_1_9_1 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    System.out.println(Solution(input));
  }

  static String Solution(String input) {
    Deque<Character> stack = new LinkedList<>();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<input.length(); i++){
      stack.offerLast(input.charAt(i));
//      System.out.println(input.charAt(i));
    }

    while(!stack.isEmpty()){
      char L = stack.pollFirst();
      if(!stack.isEmpty()){
        char R = stack.peekFirst();

//        System.out.println(L+" "+R);
        if(L == '(' && R == ')'){
          sb.append(L);
          sb.append('1');
        }else if(L == ')' && R == '('){
          sb.append(L);
          sb.append("+");
        }else if(L == '(' && R == '(') {
          sb.append(L);
        }else{
          sb.append(L);
        }
      }else{
        sb.append(L);
      }
    }

    return sb.toString();
  }

}
