package HackRank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 */
public class Solution10 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNextLine()){
      int i = in.nextInt();
      int j = in.nextInt();
      if(i <= 0 || j <= 0 ) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
      }else{
        System.out.println((i*j));
      }
    }
    in.close();
  }

}
