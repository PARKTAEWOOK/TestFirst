package HackRank;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
 */
public class Solution15 {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    /* Enter your code here. Print output to STDOUT. */
    StringBuilder B=new StringBuilder(A).reverse();
    if(A.equals(B.toString())){
      System.out.println("Yes");
    }else {
      System.out.println("No");
    }
  }

}
