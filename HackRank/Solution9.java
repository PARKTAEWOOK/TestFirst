package HackRank;

import java.util.Scanner;

/**
 *https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
 * hasNextLine()
 */
public class Solution9 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int lineNumber = 1;
    while (scan.hasNextLine()){
     String s =  scan.nextLine();
      System.out.println(lineNumber + " " + s);
      lineNumber++;
    }
    scan.close();
  }

}
