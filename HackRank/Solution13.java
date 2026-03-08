package HackRank;

import java.util.Scanner;

/**
 *  https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
 *  Sub String
 */
public class Solution13 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();

    char[] ch = S.toCharArray();
    for (int i = start; i <end; i++) {
      System.out.print(ch[i]);
    }
    System.out.println();
  }

}
