package Hyundai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://softeer.ai/practice/9498
 */
public class Test_1_9 {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    System.out.println(Solution(input));

  }

  public static String Solution(String input) {
    Deque<Character> stack = new ArrayDeque<>();
    int inputlength = input.length();

    if (inputlength == 2) {
      return "(1+1)";
    }

    for (int i = 0; i < input.length(); i++) {
      stack.offerLast(input.charAt(i));
    }

    boolean finish = true;
    StringBuilder answer = new StringBuilder();
    while(finish) {
      if (stack.size() == 2) {
        finish = false;
      }


      char L = stack.pollFirst();
      char R = stack.pollFirst();

      if (L == ')' && R == '(') {
        answer.append(L);
        answer.append('+');
      }
      else if (L == '(' && R == ')') {
        answer.append(L);
        answer.append('1');
      } else {
        answer.append(L);
      }
      stack.offerFirst(R);
      if (finish == false) answer.append(R);
    }
    String res = String.valueOf(answer);
    return res;
  }
}

